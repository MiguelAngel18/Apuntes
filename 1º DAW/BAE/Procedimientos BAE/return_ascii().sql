DROP FUNCTION IF EXISTS exceptionÑ;
SET sql_mode=PIPES_AS_CONCAT;

CREATE FUNCTION exceptionÑ(cadena varchar(100)) RETURNS varchar(1000) DETERMINISTIC 
RETURN ascii(cadena);

SELECT exceptionÑ("Ñ") as Resultado;