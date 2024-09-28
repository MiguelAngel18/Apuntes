USE world;
DROP PROCEDURE IF EXISTS minimoPorciento;
DELIMITER $$
CREATE PROCEDURE minimoPorciento(IN ciudad varchar(100), OUT porciento double, OUT lengua varchar(100))
BEGIN
	DECLARE codigoPais char(3) DEFAULT "";
	SELECT countrycode INTO codigoPais FROM city 
    WHERE name LIKE ciudad LIMIT 1;
	SELECT MIN(percentage) INTO porciento FROM countrylanguage 
    WHERE countrycode LIKE codigoPais;
	SELECT language INTO lengua FROM countrylanguage 
    WHERE countrycode LIKE codigoPais AND percentage=porciento LIMIT 1;
	SET porciento=ROUND(porciento,1);
END$$
DELIMITER ;
CALL minimoPorciento("Madrid",@b,@c);
SELECT @b, @c;