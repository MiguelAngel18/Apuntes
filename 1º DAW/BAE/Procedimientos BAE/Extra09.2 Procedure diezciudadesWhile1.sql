USE world;
DROP PROCEDURE IF EXISTS diezciudadesWhile1;
DELIMITER $$
CREATE PROCEDURE diezciudadesWhile1(IN pais varchar(100), OUT ciudades varchar(1000))
alfa: BEGIN
	DECLARE codigo varchar(3) DEFAULT "";
    DECLARE cuantas int DEFAULT 0;
    DECLARE x int DEFAULT 0;
    DECLARE ciudad varchar(100) DEFAULT "";
    SET ciudades="";
    SELECT code INTO codigo FROM country WHERE name LIKE pais; 
    SELECT COUNT(name) INTO cuantas FROM city WHERE countrycode LIKE codigo; 
    IF cuantas=0 THEN 
		SET ciudades="No hay ciudades en ese pais.";
        LEAVE alfa;
	END IF;
    IF cuantas>10 THEN SET cuantas=10; END IF;
    WHILE x<cuantas DO
		SELECT name INTO ciudad FROM city WHERE countrycode LIKE codigo LIMIT x,1;
        SET ciudades=CONCAT(ciudades,ciudad,",");
        SET x=x+1;
	END WHILE;
END$$
DELIMITER ;

CALL diezciudadesWhile1("Spain", @g);
SELECT @g;