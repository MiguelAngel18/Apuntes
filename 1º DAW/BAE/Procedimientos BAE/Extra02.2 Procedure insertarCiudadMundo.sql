USE world;
DROP PROCEDURE IF EXISTS insertarCiudadMundo;
DELIMITER $$
CREATE PROCEDURE insertarCiudadMundo(IN ciudad varchar(100), IN pais varchar(100), IN distrito varchar(100), IN habitantes int)
BEGIN
	DECLARE codigo varchar(100) DEFAULT "";
	SELECT code INTO codigo FROM country WHERE name LIKE pais;
	INSERT INTO city (name,countrycode, district, population) VALUES
    	(ciudad,codigo,distrito,habitantes);
END$$
DELIMITER ;

CALL insertarCiudadMundo("Telde","SPAIN","Canary Islands",102005);