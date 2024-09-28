USE world;
DROP PROCEDURE IF EXISTS distritosPaisLoop;
DELIMITER $$
CREATE PROCEDURE distritosPaisLoop(IN pais varchar(100), OUT distritos varchar(1000))
alfa: BEGIN
    DECLARE x, cuantos int DEFAULT 0;
    DECLARE codigo varchar(3) DEFAULT "";
    DECLARE distrito varchar(100) DEFAULT "";
    SET distritos="";
    SELECT code INTO codigo FROM country WHERE name LIKE pais;
    SELECT COUNT(distinct district) INTO cuantos FROM city WHERE countrycode LIKE codigo; 
    IF cuantos=0 THEN 
		SELECT "No hay distritos en este país" as mensaje;
        LEAVE alfa;
	END IF;
    bucle: LOOP
		SELECT distinct district INTO distrito FROM city WHERE countrycode LIKE codigo
		ORDER BY district LIMIT x,1;
		IF x=0 THEN SET distritos=distrito;
		ELSE SET distritos=CONCAT(distritos, ", ", distrito);
		END IF;
		SET x=x+1;
		IF x=cuantos THEN LEAVE bucle; END IF;
    END LOOP;
END$$
DELIMITER ;

CALL distritosPaisLoop("Spain",@g);
SELECT @g;