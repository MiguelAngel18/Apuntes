USE world;
DROP FUNCTION IF EXISTS derecha;
SET sql_mode=PIPES_AS_CONCAT;
DELIMITER $$
CREATE FUNCTION derecha(texto varchar(100), longi int) RETURNS varchar(100) DETERMINISTIC
BEGIN
	DECLARE cont int DEFAULT LENGTH(texto);
	DECLARE letra varchar(1) DEFAULT '\0';
	DECLARE result varchar(100) DEFAULT "";
	IF longi < 0 THEN SET longi=-longi; END IF;
	IF longi>=LENGTH(texto) THEN RETURN texto; END IF;
	WHILE cont>LENGTH(texto)-longi DO
		SET letra=SUBSTRING(texto,cont,1);
		SET result=letra || result;
		SET cont=cont-1;
	END WHILE;
	RETURN result;
END$$
DELIMITER ;

SELECT derecha("Ana cleto",7);