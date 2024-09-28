USE world;
DROP PROCEDURE IF EXISTS insertarConPoblacion;
DELIMITER $$
CREATE PROCEDURE insertarConPoblacion(IN ciudad varchar(100), IN habitantes int)
BEGIN
	INSERT INTO city (name,countrycode, district, population) VALUES
	(ciudad,"ESP","Canary Islands",habitantes);
	UPDATE country SET Population=Population+habitantes WHERE code LIKE "ESP";
END$$
DELIMITER ;

CALL insertarConPoblacion("Agaete", 6000);