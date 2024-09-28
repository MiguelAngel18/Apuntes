USE world;
DROP PROCEDURE IF EXISTS distritosPaisWhile2;
DELIMITER $$
CREATE PROCEDURE distritosPaisWhile2(IN pais varchar(100))
alfa: BEGIN
    DECLARE x, cuantos int DEFAULT 0;
    DECLARE codigo varchar(3) DEFAULT "";
    DECLARE distrito varchar(100) DEFAULT "";
    SELECT code INTO codigo FROM country WHERE name LIKE pais;
    SELECT COUNT(distinct district) INTO cuantos FROM city WHERE countrycode LIKE codigo; 
    IF cuantos=0 THEN
		SELECT "No hay distritos en ese país" AS mensaje;
        LEAVE alfa;
    END IF;
    DROP TABLE IF EXISTS temp_DPW;
    CREATE TEMPORARY TABLE temp_DPW(distrito varchar(100) primary key);
    WHILE x<cuantos DO
		SELECT distinct district INTO distrito FROM city WHERE countrycode LIKE codigo 
        ORDER BY district LIMIT x,1;
        INSERT INTO temp_DPW VALUES(distrito);
		SET x=x+1;
    END WHILE;
    SELECT * FROM temp_DPW;
    DROP TABLE temp_DPW;
END$$
DELIMITER ;

CALL distritosPaisWhile2("Spain");