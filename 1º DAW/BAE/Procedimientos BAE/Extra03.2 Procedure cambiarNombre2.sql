USE world;
DROP PROCEDURE IF EXISTS cambiarNombre2;
DELIMITER $$
CREATE PROCEDURE cambiarNombre2(IN ciudad varchar(100), IN pais varchar(100), IN nuevonombre varchar(100))
BEGIN
	DECLARE codigo varchar(3) DEFAULT "";
	SELECT code INTO codigo FROM country WHERE name LIKE pais;
	UPDATE city SET name=nuevonombre WHERE name LIKE ciudad and countrycode=codigo;
END$$
DELIMITER ;

CALL cambiarNombre2("Santa Cruz de Tenerife", "Spain", "Chicharrolandia");