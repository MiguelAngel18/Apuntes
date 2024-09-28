USE world;
DROP FUNCTION IF EXISTS cambiarCaso;
SET sql_mode=PIPES_AS_CONCAT;
DELIMITER $$
CREATE FUNCTION cambiarCaso(cadena varchar(100))
RETURNS varchar(100) DETERMINISTIC
BEGIN
    DECLARE cont int DEFAULT 1;
    DECLARE result varchar(100) DEFAULT "";
    DECLARE letra varchar(1) DEFAULT '\0';
    WHILE cont<=LENGTH(cadena) DO
		SET letra=SUBSTR(cadena,cont,1);
		IF ASCII(letra)>=ASCII('A') AND ASCII(letra)<=ASCII('Z') THEN
			SET letra=CHR(ASCII(letra)+32);
        ELSEIF ASCII(letra) BETWEEN ASCII('a') AND ASCII('z')THEN
			SET letra=CHR(ASCII(letra)-32);
		END IF;
        SET result=result || letra;
        SET cont=cont+1;
	END WHILE;
    RETURN result;
END$$
DELIMITER ;

select cambiarCaso("$$    ROD3odENDRO");