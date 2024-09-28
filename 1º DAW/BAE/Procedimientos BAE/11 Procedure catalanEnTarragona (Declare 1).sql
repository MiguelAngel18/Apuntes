USE world;
DROP PROCEDURE IF EXISTS catalanEnTarragona;
DELIMITER $$
CREATE PROCEDURE catalanEnTarragona()
BEGIN
	DECLARE cuantos double DEFAULT 0;
    DECLARE codigo varchar(3) DEFAULT "";
    DECLARE porciento double DEFAULT 0;
    
    SELECT code INTO codigo FROM country WHERE name LIKE "Spain";
    
    SELECT percentage INTO porciento FROM countrylanguage 
    WHERE countrycode LIKE codigo AND language LIKE "Catalan";
    
    SET porciento=porciento/100;

	SELECT population*porciento INTO cuantos
	FROM city WHERE countrycode LIKE codigo AND name LIKE "Tarragona";

	SELECT ROUND(cuantos);
END$$
DELIMITER ;
CALL catalanEnTarragona();