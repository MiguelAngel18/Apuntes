USE world;
DROP PROCEDURE IF EXISTS cambiarNombre;
DELIMITER $$
CREATE PROCEDURE cambiarNombre(IN ciudad varchar(100), IN pais varchar(100), IN nuevonombre varchar(100))
BEGIN
	UPDATE city SET name=nuevonombre WHERE name LIKE ciudad and countrycode=
   	(SELECT code FROM country WHERE name LIKE pais);
END$$
DELIMITER ;

CALL cambiarNombre("Santa Cruz de Tenerife", "Spain", "Chicharrolandia");