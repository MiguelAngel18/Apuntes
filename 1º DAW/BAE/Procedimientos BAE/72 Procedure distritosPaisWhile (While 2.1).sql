USE world;
DROP PROCEDURE IF EXISTS distritosPaisWhile;
DELIMITER $$
CREATE PROCEDURE distritosPaisWhile(IN pais varchar(100), OUT distritos varchar(1000))
BEGIN
    DECLARE x, cuantos int DEFAULT 0;
    DECLARE codigo varchar(3) DEFAULT "";
    DECLARE distrito varchar(100) DEFAULT "";
    SET distritos="";
    SELECT code INTO codigo FROM country WHERE name LIKE pais;
    SELECT COUNT(distinct district) INTO cuantos FROM city WHERE countrycode LIKE codigo; 
    WHILE x<cuantos DO
		SELECT distinct district INTO distrito FROM city WHERE countrycode LIKE codigo 
        ORDER BY district LIMIT x,1;
		IF x=0 THEN SET distritos=concat(distritos, distrito);
		ELSE SET distritos=concat(distritos, ", ", distrito);
		END IF;
		SET x=x+1;
    END WHILE;
    IF distritos="" THEN
		SET distritos= "No hay distritos en ese país";
    END IF;
END$$
DELIMITER ;

CALL distritosPaisWhile("Spain",@g);
SELECT @g;