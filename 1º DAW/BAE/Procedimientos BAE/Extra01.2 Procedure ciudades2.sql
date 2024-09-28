USE world;
DROP PROCEDURE IF EXISTS ciudades2;
DELIMITER $$
CREATE PROCEDURE ciudades2(IN ciudad varchar(100))
BEGIN
	DECLARE codigo varchar(3) DEFAULT "";
    SELECT countrycode INTO codigo FROM city WHERE name LIKE ciudad;
	SELECT name, population FROM city WHERE countrycode = codigo;
END$$
DELIMITER ;

CALL ciudades2("Madrid");