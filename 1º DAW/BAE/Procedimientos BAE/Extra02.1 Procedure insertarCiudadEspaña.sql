USE world;
DROP PROCEDURE IF EXISTS insertarCiudadEspaña;
DELIMITER $$
CREATE PROCEDURE insertarCiudadEspaña(IN ciudad varchar(100), IN habitantes int)
BEGIN
	INSERT INTO city (name,countrycode, district, population) VALUES
    	(ciudad,"ESP","Canary Islands",habitantes);
END$$
DELIMITER ;

CALL insertarCiudadEspaña("Agaete", 6000);