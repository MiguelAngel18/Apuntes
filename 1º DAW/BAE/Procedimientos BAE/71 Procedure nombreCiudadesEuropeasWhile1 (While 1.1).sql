USE world;
DROP PROCEDURE IF EXISTS nombreCiudadesEuropeasWhile1;
DELIMITER $$
CREATE PROCEDURE nombreCiudadesEuropeasWhile1()
BEGIN
    DECLARE x, cuantas, ciudades int DEFAULT 0;
    DECLARE codigo varchar(3) DEFAULT "";
    DECLARE nombre varchar(100) DEFAULT "";
    SELECT COUNT(*) INTO cuantas FROM country WHERE continent LIKE "Europe"; 
    WHILE x<cuantas DO
		SELECT code, name INTO codigo, nombre FROM country WHERE continent LIKE "Europe" ORDER BY name LIMIT x,1;
		SELECT COUNT(*) INTO ciudades FROM city WHERE countrycode LIKE codigo;
		SELECT nombre, ciudades;
		SET x=x+1;
    END WHILE;
END$$
DELIMITER ;

CALL nombreCiudadesEuropeasWhile1();
