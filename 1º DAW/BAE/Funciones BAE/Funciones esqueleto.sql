
-- Esqueleto de una función MySQL

DROP FUNCTION IF EXISTS nombreFuncion; -- Borrado de la función
SET sql_mode=PIPES_AS_CONCAT; -- Caombio del modelo de concatenación de MySQL en la función (Solo si se requiere concatener algo sin usar el concat o el concat_ws)

DELIMITER $$  -- Cambio del delimitador
CREATE FUNCTION nombreFuncion(valorIntroducir varchar(100)) RETURNS varchar(1000) DETERMINISTIC -- Creación de la función. Se introducen las variables de entrada y se indica que tiene un resultado determinista o indeterminista (no hemos dado ninguno de estos últimos)
BEGIN
	 RETURN cade;
END €€
DELIMITER ;

SELECT lowerPelo("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ") as Resultado;