USE world;
DROP PROCEDURE IF EXISTS regionesContinente2;
DELIMITER $$
CREATE PROCEDURE regionesContinente2(IN pais varchar(100), OUT regiones varchar(3000))
BEGIN
	DECLARE n, cuantas int DEFAULT 0;
	DECLARE cual char(100);
	SET regiones="";
    SELECT COUNT(DISTINCT region) INTO cuantas FROM country WHERE continent= 
    (SELECT continent FROM country WHERE name LIKE pais) ORDER BY region;
	pepe:LOOP
		SELECT DISTINCT region INTO cual FROM country WHERE 
		continent=(SELECT continent FROM country WHERE name LIKE pais) 
		ORDER BY region LIMIT n,1;
		IF n=cuantas THEN 
			LEAVE pepe;
		END IF;
		SET regiones=CONCAT(regiones,cual,",");
		SET n=n+1;
	END LOOP;
    SET regiones=SUBSTRING(regiones,1,LENGTH(regiones)-1);
END$$
DELIMITER ;

CALL regionesContinente2("France", @g);
SELECT @g;