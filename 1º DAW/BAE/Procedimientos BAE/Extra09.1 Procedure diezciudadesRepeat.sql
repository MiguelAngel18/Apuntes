USE world;
DROP PROCEDURE IF EXISTS diezciudadesRepeat;
DELIMITER $$
CREATE PROCEDURE diezciudadesRepeat(IN pais varchar(100), OUT ciudades varchar(1000))
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
    REPEAT
		SELECT name INTO ciudad FROM city WHERE countrycode LIKE codigo LIMIT x,1;
        SET ciudades=CONCAT(ciudades,ciudad,",");
        SET x=x+1;
        UNTIL x>=cuantas
	END REPEAT;
    SET ciudades=SUBSTRING(ciudades,1,LENGTH(ciudades)-1);
END$$
DELIMITER ;

CALL diezciudadesRepeat("Spain", @g);
SELECT @g;