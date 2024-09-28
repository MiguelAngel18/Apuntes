USE world;
DROP PROCEDURE IF EXISTS productoNacionalBrutoRepeat;
DELIMITER $$
CREATE PROCEDURE productoNacionalBrutoRepeat(IN continente varchar(100))
alfa: BEGIN
    DECLARE x, cuantos int DEFAULT 0;
    DECLARE nombre, mens varchar(100) DEFAULT "";
    DECLARE pnbv, pnba, dif double DEFAULT 0;
    DROP TABLE IF EXISTS temp_PNB;
    CREATE TEMPORARY TABLE temp_PNB(pais varchar(100) PRIMARY KEY, 
    pnbViejo double, pnbActual double, diferencia double, mensaje varchar(25)); 
    SELECT COUNT(*) into cuantos FROM country WHERE continent LIKE continente;  
    IF cuantos=0 THEN
            SELECT "No hay paises en ese continente" AS mensaje;
	LEAVE alfa;
    END IF; 
    REPEAT
		SELECT name, gnpold, gnp, (gnp-gnpold) INTO nombre, pnbv, pnba, dif 
		FROM country WHERE continent LIKE continente ORDER BY name LIMIT x,1;
		IF dif<0 THEN SET mens="Ha bajado";
        ELSEIF dif>0 THEN SET mens="Ha subido";
		ELSEIF dif=0 THEN SET mens="No se ha modificado";
		ELSE SET mens="No hay datos suficientes";
		END IF;
		INSERT INTO temp_PNB VALUES(nombre, pnbv,pnba,dif,mens);
		SET x=x+1;
	UNTIL x=cuantos
    END REPEAT;
    SELECT * FROM temp_PNB;
    DROP TABLE IF EXISTS temp_PNB;
END$$
DELIMITER ;

CALL productoNacionalBrutoRepeat("Europe");