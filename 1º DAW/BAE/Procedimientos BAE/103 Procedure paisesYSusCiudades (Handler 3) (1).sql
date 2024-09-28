USE world;
DROP PROCEDURE IF EXISTS paisesYSusCiudades;
DELIMITER $$
CREATE PROCEDURE paisesYSusCiudades(IN continente varchar(100))
BEGIN
    DECLARE errorPais,errorCiudad,enPais int DEFAULT 0;
    DECLARE nPais, nCiudad varchar(100) DEFAULT "";
    DECLARE codigo varchar(3) DEFAULT "";
    DECLARE idTotal varchar(10) DEFAULT "";
    DECLARE x,y int DEFAULT 0;
    DECLARE CONTINUE HANDLER FOR NOT FOUND
    BEGIN
		IF enPais=1 THEN SET errorPais=1;
		ELSE SET errorCiudad=1;
		END IF;
    END;
    DROP TEMPORARY TABLE IF EXISTS temp_PYSC;
    CREATE TEMPORARY TABLE temp_PYSC(id varchar(10) PRIMARY KEY,
    pais varchar(100),ciudad varchar(100)); 
    buclePais:LOOP 
		SET enPais=1;
		SELECT name, code INTO nPais, codigo FROM country WHERE continent LIKE continente ORDER BY name LIMIT x,1;
		IF errorPais=1 THEN LEAVE buclePais; END IF;
		SET enPais=0;
		SET y=0;
		bucleCiudad:LOOP
			SELECT name, CONCAT(countrycode,"_",id) INTO nCiudad, idTotal FROM city WHERE countrycode LIKE codigo ORDER BY name LIMIT y,1;
			IF errorCiudad=1 THEN LEAVE bucleCiudad; END IF;
			INSERT INTO temp_PYSC VALUES(idTotal,nPais,nCiudad);
			SET y=y+1;
        END LOOP;
        SET errorCiudad=0;
        SET x=x+1;
    END LOOP;
    SELECT * FROM temp_PYSC;
    DROP TEMPORARY TABLE IF EXISTS temp_PYSC;
END$$
DELIMITER ;

CALL paisesYSusCiudades("Africa");
