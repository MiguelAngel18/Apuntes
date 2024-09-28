USE world;
DROP PROCEDURE IF EXISTS ciudades;
DELIMITER $$
CREATE PROCEDURE ciudades(IN ciudad varchar(100))
BEGIN
	SELECT name, population FROM city WHERE countrycode = (SELECT countrycode FROM city WHERE name LIKE ciudad);
END$$
DELIMITER ;

CALL ciudades("Madrid");