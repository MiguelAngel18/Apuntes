USE world;
DROP PROCEDURE IF EXISTS porcentajesPoblacionLengua3;
DELIMITER $$
CREATE PROCEDURE porcentajesPoblacionLengua3(IN pais varchar(100))
BEGIN
    DECLARE bandera boolean DEFAULT false;
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
        IF sumaHablantes=poblacion THEN
			SELECT language, percentage, ROUND(poblacion*percentage/100) as hablantes FROM countrylanguage
			WHERE countrycode LIKE codigo ORDER BY hablantes DESC;
		ELSE
			SELECT language, ROUND(poblacion*percentage/100) as hablantes FROM countrylanguage 
			WHERE countrycode LIKE codigo 
			UNION
			SELECT "Otras", ROUND(poblacion*(100-sumaPorcientos)/100)
			ORDER BY hablantes DESC;
		END IF;
    END IF;
END$$
DELIMITER ;

CALL porcentajesPoblacionLengua3("Japan");