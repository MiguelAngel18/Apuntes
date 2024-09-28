USE world;
DROP PROCEDURE IF EXISTS borrarConPoblacion;
DELIMITER $$
CREATE PROCEDURE borrarConPoblacion(IN ciudad varchar(100), IN pais varchar(100))
BEGIN
	DECLARE habitantes int DEFAULT 0;
    DECLARE codigo varchar(3) DEFAULT "";
    SELECT code INTO codigo FROM country WHERE name LIKE pais;
	SELECT population INTO habitantes FROM city WHERE name LIKE ciudad AND countrycode=codigo;
    DELETE from city WHERE name LIKE ciudad AND countrycode=codigo;
   	UPDATE country SET population=population-habitantes WHERE name LIKE pais;
END$$
DELIMITER ;

CALL borrarConPoblacion("Agaete", "Spain");