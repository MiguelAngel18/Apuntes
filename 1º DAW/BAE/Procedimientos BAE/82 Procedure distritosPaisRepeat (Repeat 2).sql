USE world;
DROP PROCEDURE IF EXISTS distritosPaisRepeat;
DELIMITER $$
CREATE PROCEDURE distritosPaisRepeat(IN pais varchar(100), OUT distritos varchar(1000))
alfa: BEGIN
    DECLARE x, cuantos int DEFAULT 0;
    DECLARE codigo varchar(3) DEFAULT "";
    DECLARE distrito varchar(100) DEFAULT "";
    SET distritos="";
    SELECT code INTO codigo FROM country WHERE name LIKE pais;
    SELECT COUNT(distinct district) INTO cuantos FROM city WHERE countrycode LIKE codigo; 
    IF cuantos=0 THEN
		SELECT "No hay ciudades en ese distrito" AS mensaje;
		LEAVE alfa;
    END IF;    
    REPEAT
		SELECT distinct district INTO distrito FROM city WHERE countrycode LIKE codigo
		ORDER BY district LIMIT x,1;
		IF x=0 THEN SET distritos=CONCAT(distritos, distrito);
		ELSE SET distritos=CONCAT(distritos, ", ", distrito);
		END IF;
		SET x=x+1;
	UNTIL x=cuantos 
    END REPEAT;
END$$
DELIMITER ;

CALL distritosPaisRepeat("Spain",@g);
SELECT @g;