USE world;
DROP PROCEDURE IF EXISTS idAlAzar;
DELIMITER $$
CREATE PROCEDURE idAlAzar()
BEGIN
    DECLARE pais, continente, lengua varchar(100) DEFAULT "";
    DECLARE codigo varchar(3) DEFAULT "";
    DECLARE maximo, codigoCiudad int DEFAULT 0;
    SELECT MAX(id) INTO maximo FROM city;
    SELECT FLOOR(RAND()*maximo)+1 INTO codigoCiudad;
    SELECT countrycode INTO codigo FROM city WHERE id=codigoCiudad;
    SELECT name INTO pais FROM country WHERE code LIKE codigo;
    SELECT continent INTO continente FROM country WHERE code LIKE codigo;
    SELECT language INTO lengua FROM countrylanguage 
    WHERE countrycode LIKE codigo AND isofficial='T' ORDER BY percentage DESC LIMIT 1; 
    IF codigoCiudad>=1 AND codigoCiudad<=100 THEN 
		SELECT * FROM city WHERE id<=codigoCiudad;
    ELSEIF codigoCiudad=REVERSE(codigoCiudad) AND codigoCiudad>9 THEN
		SELECT id, name FROM city WHERE id=REVERSE(id) AND codigoCiudad>9;
    ELSEIF codigoCiudad=maximo OR codigoCiudad=1 THEN
		SELECT id, name, population, pais, continente, lengua FROM city 
		WHERE id=codigoCiudad;
    ELSE
		SELECT id, name FROM city WHERE id=codigoCiudad;
    END IF;    
END$$
DELIMITER ;

CALL idAlAzar();