USE world;
DROP FUNCTION IF EXISTS calcular;
DELIMITER $$
CREATE FUNCTION calcular(signo char(1),valor1 int,valor2 int) RETURNS int DETERMINISTIC
BEGIN
	DECLARE result int DEFAULT 0;
	CASE signo
		WHEN '+' THEN SET result=valor1+valor2;
        WHEN '-' THEN SET result=valor1-valor2;
        WHEN '*' THEN SET result=valor1*valor2;
        WHEN '/' THEN SET result=valor1/valor2;
        WHEN '%' THEN SET result=valor1%valor2;
        ELSE BEGIN END;
	END CASE;
RETURN result;
END$$
DELIMITER ;

SELECT calcular("+",12,6) AS resultado;
