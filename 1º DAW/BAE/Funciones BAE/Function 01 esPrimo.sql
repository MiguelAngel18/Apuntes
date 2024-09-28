USE world;
DROP FUNCTION IF EXISTS esPrimo;
DELIMITER $$
CREATE FUNCTION esPrimo(valor int) RETURNS boolean DETERMINISTIC
BEGIN
	DECLARE cont INT DEFAULT 2;
    WHILE cont<=valor/2 DO
		IF valor%cont=0 THEN RETURN false; END IF;
        SET cont=cont+1;
	END WHILE;
RETURN true;
END$$
DELIMITER ;

SELECT IF(esPrimo(1567), "Sí", "No") AS primo;