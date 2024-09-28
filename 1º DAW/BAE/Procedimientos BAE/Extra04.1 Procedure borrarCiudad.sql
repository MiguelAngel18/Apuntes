USE world;
DROP PROCEDURE IF EXISTS borrarCiudad;
DELIMITER $$
CREATE PROCEDURE borrarCiudad(IN ciudad varchar(100), IN pais varchar(100))
BEGIN
	DELETE FROM city WHERE name LIKE ciudad AND countrycode=
   	(SELECT code FROM country WHERE name LIKE pais);
END$$
DELIMITER ;

CALL borrarCiudad("Telde", "Spain");