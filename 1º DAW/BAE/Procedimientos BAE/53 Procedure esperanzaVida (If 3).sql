USE world;
DROP PROCEDURE IF EXISTS esperanzaVida;
DELIMITER $$
CREATE PROCEDURE esperanzaVida(IN pais varchar(100))
BEGIN
    DECLARE mensaje varchar(100) DEFAULT "";
    DECLARE cuantos int DEFAULT 0;
    DECLARE esperanza float(3,1);
    SELECT lifeexpectancy INTO esperanza FROM country WHERE name LIKE pais;
    SELECT COUNT(*) INTO cuantos FROM country WHERE lifeexpectancy=esperanza;
    IF cuantos=1 THEN 
		SELECT CONCAT("no hay mas paises con esperanza de vida igual a ", esperanza) AS mensaje;
    ELSE
		IF esperanza<50 THEN
			SET mensaje="media de vida baja";
		ELSEIF esperanza<=70 THEN
			SET mensaje="media de vida normal";
		ELSE
			SET mensaje="media de vida alta";
		END IF;
		SELECT name, mensaje FROM country WHERE lifeexpectancy=esperanza;
    END IF;    
END$$
DELIMITER ;

CALL esperanzaVida("France");