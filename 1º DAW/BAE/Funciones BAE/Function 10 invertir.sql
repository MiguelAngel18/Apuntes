USE world;
DROP FUNCTION IF EXISTS invertir;
SET sql_mode=PIPES_AS_CONCAT;    
DELIMITER $$
CREATE FUNCTION invertir(cadena varchar(100)) RETURNS varchar(100) DETERMINISTIC
BEGIN
	DECLARE alReves varchar(100) DEFAULT "";
    DECLARE letra varchar(1) DEFAULT "";
    DECLARE cont int DEFAULT 1;
    WHILE cont<=LENGTH(cadena) DO
		SET letra=SUBSTRING(cadena,cont,1);
        SET alreves=letra || alreves;
        SET cont=cont+1;
    END WHILE;
    RETURN alreves;
END$$
DELIMITER ;

SELECT invertir("Hola Mundo");