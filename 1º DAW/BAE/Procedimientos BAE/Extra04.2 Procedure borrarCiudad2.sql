USE world;
DROP PROCEDURE IF EXISTS borrarCiudad2;
DELIMITER $$
CREATE PROCEDURE borrarCiudad2(IN ciudad varchar(100), IN pais varchar(100))
BEGIN
	DECLARE codigo varchar(3) DEFAULT "";
    SELECT code INTO codigo FROM country WHERE name LIKE pais;
	DELETE FROM city WHERE name LIKE ciudad AND countrycode=codigo;
END$$
DELIMITER ;

CALL borrarCiudad2("Agaete", "Spain");