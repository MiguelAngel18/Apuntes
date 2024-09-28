USE world;
DROP PROCEDURE IF EXISTS insertarConPoblacionGrande;
DELIMITER $$
CREATE PROCEDURE insertarConPoblacionGrande(IN ciudad varchar(100), IN habitantes int)
BEGIN
IF habitantes>1000 THEN
	INSERT INTO city (name,countrycode, district, population) VALUES
	(ciudad,"ESP","Canary Islands",habitantes);
END IF;
END$$
DELIMITER ;

CALL insertarConPoblacionGrande("Agaete", 1000);