USE world;
DROP PROCEDURE IF EXISTS superficiePaisCase;
DELIMITER $$
CREATE PROCEDURE superficiePaisCase(IN pais varchar(100))
BEGIN
	DECLARE superficie double DEFAULT 0;
	DECLARE mensaje varchar(100) DEFAULT "";
	SELECT surfacearea INTO superficie FROM country WHERE name LIKE pais;
	CASE
		WHEN superficie=0 THEN SET mensaje="Ese país no existe";
		WHEN superficie<=10000 THEN SET mensaje="País pequeño";
	 	WHEN superficie<=500000 THEN SET mensaje="País normal";
		WHEN superficie<=1000000 THEN SET mensaje="País grande";
		WHEN superficie<=5000000 THEN SET mensaje="País muy grande";
		ELSE SET mensaje="País enorme";
	END CASE;
	SELECT pais, superficie, mensaje;
END$$
DELIMITER ;

CALL superficiePaisCase("Andorra");