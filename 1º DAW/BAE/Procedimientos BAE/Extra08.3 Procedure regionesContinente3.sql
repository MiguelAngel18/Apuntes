USE world;
DROP PROCEDURE IF EXISTS regionesContinente3;
DELIMITER $$
CREATE PROCEDURE regionesContinente3(IN pais varchar(100))
BEGIN
	DECLARE n, cuantas int DEFAULT 0;
	DECLARE cual char(100);
    SELECT COUNT(DISTINCT region) INTO cuantas FROM country WHERE continent= 
    (SELECT continent FROM country WHERE name LIKE pais) ORDER BY region;
	CREATE TEMPORARY TABLE temp(
		regiones varchar(100), 
		PRIMARY KEY(regiones)
	);
    pepe:LOOP
		SELECT DISTINCT region INTO cual FROM country WHERE 
		continent=(SELECT continent FROM country WHERE name LIKE pais) 
		ORDER BY region LIMIT n,1;
		IF n=cuantas THEN 
			LEAVE pepe;
		END IF;
		INSERT INTO temp (regiones) VALUES (cual);
		SET n=n+1;
	END LOOP;
    SELECT * FROM temp;
	DROP TEMPORARY TABLE IF EXISTS temp;
END$$
DELIMITER ;

CALL regionesContinente3("France");