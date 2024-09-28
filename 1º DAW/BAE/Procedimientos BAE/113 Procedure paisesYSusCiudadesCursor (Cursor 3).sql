USE world;
DROP PROCEDURE IF EXISTS paisesYSusCiudadesCursor;
DELIMITER $$
CREATE PROCEDURE paisesYSusCiudadesCursor(IN continente varchar(100))
BEGIN
    DECLARE errorPais,errorCiudad,enPais int DEFAULT 0;
    DECLARE nPais, nCiudad varchar(100) DEFAULT "";
    DECLARE codigo varchar(3) DEFAULT "";
    DECLARE idTotal varchar(10) DEFAULT "";
    DECLARE paisCursor CURSOR FOR 
		SELECT name, code FROM country WHERE continent LIKE continente ORDER BY name;
    DECLARE ciudadCursor CURSOR FOR 
		SELECT name, CONCAT(countrycode,"_",id)
	FROM city WHERE countrycode LIKE codigo ORDER BY name;
    DECLARE CONTINUE HANDLER FOR NOT FOUND
    BEGIN
		IF enPais=0 THEN SET errorCiudad=1;
		ELSE SET errorPais=1;
		END IF;
    END;
    DROP TEMPORARY TABLE IF EXISTS temp_PYSC;
    CREATE TEMPORARY TABLE temp_PYSC(id varchar(10) PRIMARY KEY,
    pais varchar(100),ciudad varchar(100)); 
    OPEN paisCursor;
    buclePais:LOOP 
        SET enPais=1;
        FETCH paiscursor INTO nPais, codigo;
        IF errorPais=1 THEN LEAVE buclePais; END IF;
        SET enPais=0;
        OPEN ciudadCursor;
        bucleCiudad:LOOP
		FETCH ciudadCursor INTO nCiudad, idTotal;
		IF errorCiudad=1 THEN LEAVE bucleCiudad; END IF;
		INSERT INTO temp_PYSC VALUES(idTotal,nPais,nCiudad);
        END LOOP;
        CLOSE ciudadCursor;
        SET errorCiudad=0;
    END LOOP;
    CLOSE paisCursor;
    SELECT * FROM temp_PYSC;
    DROP TEMPORARY TABLE IF EXISTS temp_PYSC;
END$$
DELIMITER ;
CALL paisesYSusCiudadesCursor("Europe");