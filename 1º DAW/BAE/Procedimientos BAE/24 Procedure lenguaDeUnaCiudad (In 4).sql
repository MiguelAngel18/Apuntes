USE world;
DROP PROCEDURE IF EXISTS lenguaDeUnaCiudad;
DELIMITER $$
CREATE PROCEDURE lenguaDeUnaCiudad(IN ciudad varchar(100))
BEGIN
	DECLARE lenguaMax varchar(100) DEFAULT "";
    DECLARE codigo char(3) DEFAULT "";
    SELECT countrycode INTO codigo FROM city WHERE name LIKE ciudad LIMIT 1;
    SELECT language INTO lenguaMax FROM countrylanguage 
    WHERE countrycode LIKE codigo ORDER BY percentage DESC LIMIT 1;
    SELECT name FROM country INNER JOIN countrylanguage ON countrycode=code
    WHERE language LIKE lenguaMax AND IsOfficial=true AND code!=codigo; 
END$$
DELIMITER ;
CALL lenguaDeUnaCiudad("Madrid");