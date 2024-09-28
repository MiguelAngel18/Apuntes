USE world;
DROP PROCEDURE IF EXISTS independencia2;
DELIMITER $$
CREATE PROCEDURE independencia2(IN continente varchar(100))
BEGIN
    DECLARE error int DEFAULT 0;
    DECLARE nombre varchar(100) DEFAULT "";
    DECLARE f_indep varchar(15) DEFAULT "";
    DECLARE x, poblacion int DEFAULT 0;
    DECLARE dia, mes varchar(2) DEFAULT "";
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET error=1;
    DROP TABLE IF EXISTS temp_independencia2;
    CREATE TEMPORARY TABLE temp_independencia2(pais varchar(100) PRIMARY KEY, 
    poblacion int, fecha varchar(15)); -- tamaño 15 porque tendrá A.C. o D.C. detras
    SELECT IF(DAY(NOW())<10,CONCAT("0",DAY(NOW())),DAY(NOW())) INTO dia;
    SELECT IF(MONTH(NOW())<10,CONCAT("0",MONTH(NOW())),MONTH(NOW())) INTO mes;
    bucle:LOOP 
		SELECT indepyear INTO f_indep FROM country WHERE continent LIKE continente ORDER BY name LIMIT x,1;
        IF f_indep<0 THEN 
			SET f_indep=f_indep*-1;
			SET f_indep=CONCAT(f_indep," A.C.");
        ELSE 
			SET f_indep=CONCAT(f_indep," D.C.");
        END IF;
        WHILE LENGTH(f_indep)<9 DO SET f_indep=CONCAT("0", f_indep); END WHILE;			
        SET f_indep=CONCAT(dia,"/",mes,"/",IF(f_indep IS NULL,CONCAT(YEAR(NOW())," D.C."),f_indep));
		SELECT name, population INTO nombre, poblacion FROM country WHERE continent LIKE continente ORDER BY name LIMIT x,1;
		IF error=1 THEN LEAVE bucle; END IF;
		INSERT INTO temp_independencia2 VALUES(nombre, poblacion, f_indep);
		SET x=x+1;
    END LOOP;
    SELECT * FROM temp_independencia2;
    DROP TABLE IF EXISTS temp_independencia2;
END$$
DELIMITER ;

CALL independencia2("Asia");