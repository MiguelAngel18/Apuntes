USE world;
DROP PROCEDURE IF EXISTS ciudadDelDia;
DELIMITER $$
CREATE PROCEDURE ciudadDelDia()
BEGIN
    DECLARE pais, ciudad, mensaje varchar(100) DEFAULT "";
    DECLARE codigo char(3) DEFAULT "";
    DECLARE codigoCiudad, año int DEFAULT 0;
    SELECT DAY(CURDATE())+MONTH(CURDATE())+YEAR(CURDATE()) INTO codigoCiudad;
    SELECT name INTO ciudad FROM city WHERE id=codigoCiudad;
    SELECT countrycode INTO codigo FROM city WHERE id=codigoCiudad;
    SELECT name INTO pais FROM country WHERE code LIKE codigo;
    SELECT indepyear INTO año FROM country WHERE code LIKE codigo;
    CASE 
		WHEN año<=0 THEN SET mensaje="País muy antiguo";
		WHEN año<=1000 THEN SET mensaje="País antiguo";
		WHEN año<=1500 THEN SET mensaje="País medieval";
		WHEN año<=1900 THEN SET mensaje="País moderno";
		ELSE SET mensaje="País muy reciente";
    END CASE;
    SELECT ciudad, pais, año, mensaje;
END$$
DELIMITER ;

CALL ciudadDelDia();