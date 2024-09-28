USE world;
DROP PROCEDURE IF EXISTS regionesContinente4;
DELIMITER $$
CREATE PROCEDURE regionesContinente4(IN pais varchar(100))
BEGIN
	DECLARE n int DEFAULT 0;
	DECLARE cual char(100);
	DECLARE error int DEFAULT 0;
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET error=1;
	CREATE TEMPORARY TABLE temp(
		regiones varchar(100), 
		PRIMARY KEY(regiones)
	);
    pepe:LOOP
		SELECT DISTINCT region INTO cual FROM country WHERE 
		continent=(SELECT continent FROM country WHERE name LIKE pais) 
		ORDER BY region LIMIT n,1;
		IF ERROR=1 THEN 
			LEAVE pepe;
		END IF;
		INSERT INTO temp (regiones) VALUES (cual);
		SET n=n+1;
	END LOOP;
    SELECT * FROM temp;
	DROP TEMPORARY TABLE IF EXISTS temp;
END$$
DELIMITER ;

CALL regionesContinente4("France");