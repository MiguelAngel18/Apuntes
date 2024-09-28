USE world;
DROP FUNCTION IF EXISTS impares;
DELIMITER $$
CREATE FUNCTION impares(valor int) RETURNS varchar(300) DETERMINISTIC
BEGIN
    DECLARE cont int DEFAULT 1;
    DECLARE res varchar(300) DEFAULT "";
    WHILE cont<=valor DO
		IF cont=1 THEN SET res=cont;
		ELSE SET res=CONCAT(res,",",cont);
        END IF;
        SET cont=cont+2;
	END WHILE;
	RETURN res;
END$$
DELIMITER ;

SELECT impares(100);