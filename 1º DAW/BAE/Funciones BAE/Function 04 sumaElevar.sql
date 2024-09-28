USE world;
DROP FUNCTION IF EXISTS sumaElevar;
DELIMITER $$
CREATE FUNCTION sumaElevar(valor1 int unsigned ,valor2 int unsigned) RETURNS int DETERMINISTIC
BEGIN
	DECLARE res1,res2 int DEFAULT 1;
    DECLARE cont int DEFAULT 0;
    WHILE cont<valor2 DO
		SET res1=res1*valor1;
        SET cont=cont+1;
	END WHILE;
    SET cont=0;
    WHILE cont<valor1 DO
		SET res2=res2*valor2;
        SET cont=cont+1;
	END WHILE;
	RETURN res1+res2;
END$$
DELIMITER ;

SELECT sumaElevar(5,4);