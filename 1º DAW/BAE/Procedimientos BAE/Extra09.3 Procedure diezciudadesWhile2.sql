USE world;
DROP PROCEDURE IF EXISTS diezciudadesWhile2;
DELIMITER $$
CREATE PROCEDURE diezciudadesWhile2(IN pais varchar(100), OUT ciudades varchar(1000)) -- con handler
BEGIN
	DECLARE codigo varchar(3) DEFAULT "";
    -- DECLARE cuantas int DEFAULT 0;
    DECLARE x int DEFAULT 0;
    DECLARE ciudad varchar(100) DEFAULT "";
    DECLARE EXIT HANDLER FOR NOT FOUND IF x=0 THEN 
											SET ciudades="No hay ciudades en ese pais.";
									   END IF;
    SET ciudades="";
    SELECT code INTO codigo FROM country WHERE name LIKE pais;
    WHILE x<10 DO
		SELECT name INTO ciudad FROM city WHERE countrycode LIKE codigo LIMIT x,1;
        SET ciudades=CONCAT(ciudades,ciudad,",");
        SET x=x+1;
	END WHILE;
END$$
DELIMITER ;

CALL diezciudadesWhile2("Spain", @g);
SELECT @g;