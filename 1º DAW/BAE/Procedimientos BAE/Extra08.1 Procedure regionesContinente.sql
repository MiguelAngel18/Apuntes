USE world;
DROP PROCEDURE IF EXISTS regionesContinente;
DELIMITER $$
CREATE PROCEDURE regionesContinente(IN pais varchar(100), OUT regiones varchar(3000))
BEGIN
	DECLARE n, errores int DEFAULT 0;
	DECLARE cual char(100);
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET errores = 1;
	SET regiones="";
	pepe:LOOP
		SELECT DISTINCT region INTO cual FROM country WHERE 
		continent=(SELECT continent FROM country WHERE name LIKE pais) 
		ORDER BY region LIMIT n,1;
		IF errores=1 THEN 
			LEAVE pepe;
		END IF;
		SET regiones=CONCAT(regiones,cual,",");
		SET n=n+1;
	END LOOP;
    SET regiones=SUBSTRING(regiones,1,LENGTH(regiones)-1);
END$$
DELIMITER ;

CALL regionesContinente("France", @g);
SELECT @g;