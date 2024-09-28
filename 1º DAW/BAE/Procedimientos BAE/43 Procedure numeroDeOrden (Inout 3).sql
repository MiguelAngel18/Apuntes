USE world;
DROP PROCEDURE IF EXISTS numeroDeOrden;
DELIMITER $$
CREATE PROCEDURE numeroDeOrden(IN pais varchar(100), INOUT orden int)
BEGIN
	DECLARE codigoPais varchar(100) DEFAULT "";
	SELECT code INTO codigoPais FROM country WHERE name LIKE pais;
	SELECT name, population FROM city WHERE countrycode LIKE codigoPais ORDER BY name;
	SET orden=orden-1;
	SELECT population INTO orden FROM city 
    WHERE countrycode LIKE codigoPais ORDER BY name LIMIT orden,1;
END$$
DELIMITER ;

SET @g=10;
CALL numeroDeOrden("Spain",@g);
SELECT @g;