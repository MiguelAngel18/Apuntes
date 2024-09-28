USE world;
DROP PROCEDURE IF EXISTS independenciaCursor;
DELIMITER $$
CREATE PROCEDURE independenciaCursor(IN continente varchar(100))
BEGIN
    DECLARE error int DEFAULT 0;
    DECLARE nombre, poblacion varchar(100) DEFAULT "";
    DECLARE f_indep varchar(10) DEFAULT "";
    DECLARE dia, mes varchar(2) DEFAULT "";
    DECLARE miCursor CURSOR FOR 
		SELECT name, population, IF(indepyear IS NULL,YEAR(NOW()),indepyear)
		FROM country WHERE continent LIKE continente ORDER BY name;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET error=1;
    DROP TABLE IF EXISTS temp_independencia;
    CREATE TEMPORARY TABLE temp_independencia(pais varchar(100) primary key, 
    poblacion int, fecha varchar(10)); 
    SELECT IF(DAY(NOW())<10,CONCAT("0",DAY(NOW())),DAY(NOW())) INTO dia;
    SELECT IF(MONTH(NOW())<10,CONCAT("0",MONTH(NOW())),MONTH(NOW())) INTO mes;
    OPEN micursor;
    bucle:LOOP 
		FETCH micursor INTO nombre, poblacion, f_indep;
		IF error=1 THEN LEAVE bucle; END IF;
		INSERT INTO temp_independencia VALUES(nombre, poblacion, CONCAT(dia,"/",mes,"/",f_indep));
    END LOOP;
    CLOSE micursor;
    SELECT * FROM temp_independencia;
    DROP TABLE IF EXISTS temp_independencia;
END$$
DELIMITER ;
CALL independenciaCursor("Europe");