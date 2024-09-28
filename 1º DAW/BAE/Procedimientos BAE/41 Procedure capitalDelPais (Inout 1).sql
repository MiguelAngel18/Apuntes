USE world;
DROP PROCEDURE IF EXISTS capitalDelPais;
DELIMITER $$
CREATE PROCEDURE capitalDelPais(INOUT ciudad varchar(100))
BEGIN
	DECLARE codigo char(3) DEFAULT "";
    DECLARE capicode int(11) DEFAULT -1;
    SELECT countrycode INTO codigo FROM city WHERE name LIKE ciudad LIMIT 1;
    SELECT capital INTO capicode FROM country WHERE code LIKE codigo;
    SELECT name INTO ciudad FROM city WHERE id LIKE capicode;
    SELECT * FROM city WHERE id=capicode;
END$$
DELIMITER ;

SET @g="hamburg";
CALL capitalDelPais(@g);
SELECT @g;