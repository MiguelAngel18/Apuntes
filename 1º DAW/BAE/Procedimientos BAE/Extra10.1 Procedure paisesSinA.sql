USE world;
DROP PROCEDURE IF EXISTS paisesSinA;
DELIMITER $$
CREATE PROCEDURE paisesSinA(IN ciudad varchar(100))
BEGIN
	DECLARE codigo varchar(3) DEFAULT "";
    DECLARE continente varchar(100) DEFAULT"";
    DECLARE x int DEFAULT 0;
    SELECT countrycode INTO codigo FROM city WHERE name LIKE ciudad;
    SELECT continent INTO continente FROM country WHERE code LIKE codigo;     
	SELECT name as paises FROM country WHERE continent LIKE continente AND
    POSITION('A' IN name)=0 ORDER BY population DESC;
    -- name not like"%A%" ORDER BY population DESC;    
END$$
DELIMITER ;

CALL paisesSinA("Madrid");