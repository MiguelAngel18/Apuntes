USE world;
DROP PROCEDURE IF EXISTS porcentajesPoblacionLengua;
DELIMITER $$
CREATE PROCEDURE porcentajesPoblacionLengua(IN pais varchar(100))
BEGIN
    DECLARE bandera boolean DEFAULT false;
    DECLARE codigo char(3) DEFAULT "";
    DECLARE poblacion, sumaHablantes int(15) DEFAULT 0;
    DECLARE sumaPorcientos float(3,1) DEFAULT 0;
    SELECT code INTO codigo FROM country WHERE name LIKE pais;
    IF codigo LIKE "" THEN 
		SELECT CONCAT("El pais ",pais, " no se encuentra en la base de datos") AS mensaje;
    ELSE
		SELECT population INTO poblacion FROM country WHERE name LIKE pais;
        SELECT sum(percentage) INTO sumaPorcientos FROM countrylanguage WHERE countrycode LIKE codigo;
        SET sumaHablantes=ROUND(sumaPorcientos*poblacion/100);
		IF sumaHablantes!=poblacion THEN 
			SET bandera=true;
			INSERT INTO countrylanguage VALUES(codigo,"Otras",'F',100-sumaPorcientos);
		END IF;
		SELECT language, ROUND(poblacion*percentage/100) AS hablantes FROM countrylanguage 
        WHERE countrycode LIKE codigo ORDER BY hablantes DESC;
		IF bandera=true THEN 
			DELETE FROM countrylanguage WHERE countrycode LIKE codigo AND language LIKE "Otras";
		END IF;
    END IF;
END$$
DELIMITER ;

CALL porcentajesPoblacionLengua("Spain");