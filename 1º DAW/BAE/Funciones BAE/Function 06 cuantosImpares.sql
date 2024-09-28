USE world;
DROP FUNCTION IF EXISTS cuantosImpares;
DELIMITER $$
CREATE FUNCTION cuantosImpares(valor int) RETURNS varchar(500) DETERMINISTIC
BEGIN
    DECLARE cont, signo int DEFAULT 1;
    DECLARE res varchar(500) DEFAULT "";
    IF valor<0 THEN
		SET valor=-valor;
        SET signo=-1;
	END IF;
    WHILE cont<=2*valor DO
		IF cont=1 THEN SET res=CONCAT(res,signo*cont);
		ELSE SET res=CONCAT(res,",",signo*cont);
        END IF;
        SET cont=cont+2;
	END WHILE;
	RETURN res;
END$$
DELIMITER ;

SELECT cuantosImpares(-100);