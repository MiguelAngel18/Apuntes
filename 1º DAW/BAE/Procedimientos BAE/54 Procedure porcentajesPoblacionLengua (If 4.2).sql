USE world;
DROP PROCEDURE IF EXISTS porcentajesPoblacionLengua2;
DELIMITER $$
CREATE PROCEDURE porcentajesPoblacionLengua2(IN pais varchar(100))
BEGIN
    DECLARE codigo char(3) DEFAULT "";
    DECLARE poblacion, sumaHablantes int(15) DEFAULT 0;
    DECLARE sumaPorcientos decimal(3,1) DEFAULT 0;
    SELECT code INTO codigo FROM country WHERE name LIKE pais;
    IF codigo LIKE "" THEN 
		SELECT CONCAT("El pais ",pais, " no se encuentra en la base de datos") AS mensaje;
    ELSE
		SELECT population INTO poblacion FROM country WHERE name LIKE pais;
        SELECT sum(percentage) INTO sumaPorcientos FROM countrylanguage WHERE countrycode LIKE codigo;
        SET sumaHablantes=ROUND(sumaPorcientos*poblacion/100);
        DROP TABLE IF EXISTS temp;
        CREATE TEMPORARY TABLE temp(
        lengua varchar(100),
        hablantes int(15)
        );
        INSERT INTO temp SELECT language, ROUND(poblacion*percentage/100) FROM countrylanguage 
        WHERE countrycode LIKE codigo;
        IF poblacion!=sumaHablantes THEN
			INSERT INTO temp VALUES ("Otras",ROUND(poblacion*(100-sumaPorcientos)/100));
		END IF;
        SELECT lengua, hablantes FROM temp ORDER BY hablantes DESC;
        DROP TABLE temp;
    END IF;
END$$
DELIMITER ;

CALL porcentajesPoblacionLengua2("Spain");