USE world;
DROP PROCEDURE IF EXISTS independencia;
DELIMITER $$
CREATE PROCEDURE independencia(IN continente varchar(100))
BEGIN
    DECLARE error int DEFAULT 0;
    DECLARE nombre varchar(100) DEFAULT "";
    DECLARE f_indep varchar(11) DEFAULT "";
    DECLARE x, poblacion int DEFAULT 0;
    DECLARE dia, mes varchar(2) DEFAULT "";
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET error=1;
    DROP TABLE IF EXISTS temp_independencia;
    CREATE TEMPORARY TABLE temp_independencia(pais varchar(100) PRIMARY KEY, 
    poblacion int, fecha varchar(11)); -- tamaño 11 porque a veces el año lleva un menos delante
    SELECT IF(DAY(NOW())<10,CONCAT("0",DAY(NOW())),DAY(NOW())) INTO dia;
    SELECT IF(MONTH(NOW())<10,CONCAT("0",MONTH(NOW())),MONTH(NOW())) INTO mes;
    bucle:LOOP 
		SELECT name, population, CONCAT(dia,"/",mes,"/",IF(indepyear IS NULL,YEAR(NOW()),indepyear))
		INTO nombre, poblacion, f_indep FROM country WHERE continent LIKE continente ORDER BY name LIMIT x,1;
		IF error=1 THEN LEAVE bucle; END IF;
		INSERT INTO temp_independencia VALUES(nombre, poblacion, f_indep);
		SET x=x+1;
    END LOOP;
    SELECT * FROM temp_independencia;
    DROP TABLE IF EXISTS temp_independencia;
END$$
DELIMITER ;

CALL independencia("Asia");