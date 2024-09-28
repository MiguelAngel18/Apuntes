USE world;
DROP PROCEDURE IF EXISTS paisesSinALoop1;
DELIMITER $$
CREATE PROCEDURE paisesSinALoop1(IN ciudad varchar(100), OUT paises varchar(5000))
BEGIN
	DECLARE codigo varchar(3) DEFAULT "";
    DECLARE continente varchar(100) DEFAULT"";
    DECLARE cuantas INt DEFAULT 0;
    DECLARE pais varchar(100) DEFAULT"";
    DECLARE x INt DEFAULT 0;
    SET paises="";
    
    SELECT countrycode INTO codigo FROM city WHERE name LIKE ciudad;
    SELECT continent INTO continente FROM country WHERE code LIKE codigo;
    SELECT COUNT(name) INTO cuantas FROM country WHERE continent LIKE continente ORDER BY population DESC; 
    
    arriba: LOOP
		IF x=cuantas THEN LEAVE arriba; END IF;
		SELECT name INTO pais FROM country WHERE continent LIKE continente ORDER BY population DESC LIMIT x,1;
        SET x=x+1;
        IF POSITION('a' IN pais)!=0 THEN ITERATE arriba; END IF;
        SET paises=concat(paises,pais,", ");
	END LOOP;
END$$
DELIMITER ;

CALL paisesSinALoop1("Madrid", @g);
SELECT @g;