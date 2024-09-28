USE world;
DROP FUNCTION IF EXISTS izquierda;
SET sql_mode=PIPES_AS_CONCAT;    
DELIMITER $$
CREATE FUNCTION izquierda(texto varchar(100), longi int) RETURNS varchar(100) DETERMINISTIC
BEGIN
	DECLARE cont int DEFAULT 1;
    DECLARE letra varchar(1) DEFAULT '\0'; -- debe ser varchar, con char no funciona
    DECLARE result varchar(100) DEFAULT "";
	IF longi < 0 THEN SET longi=-longi; END IF;
    IF longi>=LENGTH(texto) THEN RETURN texto; END IF;
    WHILE cont<=longi DO
		SET letra=SUBSTR(texto,cont,1);
        SET result=result || letra;
        SET cont=cont+1;
	END WHILE;
    RETURN result;
END$$
DELIMITER ;

SELECT izquierda("H ola",3);