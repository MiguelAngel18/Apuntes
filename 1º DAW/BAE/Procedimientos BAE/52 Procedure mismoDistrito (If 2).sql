USE world;
DROP PROCEDURE IF EXISTS mismoDistrito;
DELIMITER $$
CREATE PROCEDURE mismoDistrito(IN pais varchar(100))
BEGIN
	DECLARE codigo char(3) DEFAULT "";
    DECLARE capicode int DEFAULT 0;
    DECLARE distrito varchar(100) DEFAULT "";
    DECLARE poblacionCapital, poblacionConjunta double DEFAULT 0;
    
    SELECT code, capital INTO codigo, capicode FROM country WHERE name LIKE pais;
    SELECT district, population INTO distrito, poblacionCapital FROM city 
    WHERE id LIKE capicode;
    SELECT SUM(population) INTO poblacionConjunta FROM city WHERE district LIKE distrito 
    AND countrycode LIKE codigo AND id!=capicode;
    
	IF poblacionCapital<=poblacionConjunta THEN	
		 SELECT name FROM city WHERE district LIKE distrito ORDER BY name;
    ELSE SELECT name FROM city WHERE district LIKE distrito ORDER BY name DESC;
    END IF;
END$$
DELIMITER ;

CALL mismoDistrito("SPAIN");