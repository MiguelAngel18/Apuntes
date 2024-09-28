USE world;
DROP PROCEDURE IF EXISTS nombreCiudadesEuropeasWhile2; 
DELIMITER $$
CREATE PROCEDURE nombreCiudadesEuropeasWhile2()
    alfa: BEGIN
    DECLARE x, cuantos, ciudades int DEFAULT 0;
    DECLARE codigo varchar(3) DEFAULT "";
    DECLARE nombre varchar(100) DEFAULT "";
    DROP TABLE IF EXISTS temp_NCE;
    CREATE TEMPORARY TABLE temp_NCE(pais varchar(100) PRIMARY KEY, numCiudades int);
    SELECT COUNT(*) INTO cuantos FROM country WHERE continent LIKE "Europe"; 
    IF cuantos=0 THEN
		SELECT "No hay paises en ese continente" AS mensaje;
		LEAVE alfa;
    END IF;
    WHILE x<cuantos DO
		SELECT code, name INTO codigo, nombre FROM country WHERE continent LIKE "Europe" ORDER BY name LIMIT x,1;
		SELECT COUNT(*) INTO ciudades FROM city WHERE countrycode LIKE codigo;
		INSERT INTO temp_NCE VALUES(nombre, ciudades);
		SET x=x+1;
    END WHILE; 
    SELECT * FROM temp_NCE;
    DROP TABLE IF EXISTS temp_NCE;
END$$
DELIMITER ;

CALL nombreCiudadesEuropeasWhile2();