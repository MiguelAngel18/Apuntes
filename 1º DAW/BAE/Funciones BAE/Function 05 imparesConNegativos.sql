USE world;
DROP FUNCTION IF EXISTS imparesConNegativos;
DELIMITER $$
CREATE FUNCTION imparesConNegativos(valor int) RETURNS varchar(300) DETERMINISTIC
BEGIN
    DECLARE cont int DEFAULT 1;
    DECLARE res varchar(300) DEFAULT "";
    DECLARE signo boolean DEFAULT false;
    IF valor<0 THEN 
		SET signo=true;
        SET valor=-valor;
	END IF;
    WHILE cont<=valor DO
		IF cont=1 THEN
			IF signo=false THEN SET res=cont;
			ELSE SET res=-cont;
            END IF;
		ELSE 
			IF signo=false THEN SET res=CONCAT(res,",",cont);
            ELSE SET res=CONCAT(res,", ",-cont);
            END IF;
        END IF;
        SET cont=cont+2;
	END WHILE;
	RETURN res;
END$$
DELIMITER ;

SELECT imparesConNegativos(-100);