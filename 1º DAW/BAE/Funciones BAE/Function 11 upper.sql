USE world;
DROP FUNCTION IF EXISTS mayuscula;
SET sql_mode=PIPES_AS_CONCAT;    
DELIMITER $$
CREATE FUNCTION mayuscula(cadena varchar(100))
RETURNS varchar(100) DETERMINISTIC
BEGIN
    DECLARE cont int DEFAULT 1;
    DECLARE result varchar(100) DEFAULT "";
    DECLARE letra varchar(1) DEFAULT "";
    WHILE cont<=LENGTH(cadena) DO
		SET letra=SUBSTR(cadena,cont,1);
		IF ASCII(letra) BETWEEN ASCII('a') AND ASCII('z') THEN
            SET letra=CHR(ASCII(letra)-32);
		END IF;
        SET result=result || letra;
        SET cont=cont+1;
	END WHILE;
    RETURN result;
END$$
DELIMITER ;

select mayuscula("34a aJK");