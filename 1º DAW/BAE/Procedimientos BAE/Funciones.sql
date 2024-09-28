
-- Esqueleto de una función MySQL

DROP FUNCTION IF EXISTS nombreFuncion; -- Borrado de la función
SET sql_mode=PIPES_AS_CONCAT; -- Caombio del modelo de concatenación de MySQL en la función (Solo si se requiere concatener algo sin usar el concat o el concat_ws)

DELIMITER $$  -- Cambio del delimitador
-- Creación de la función. Se introducen las variables de entrada y se indica que tiene un resultado determinista o indeterminista (no hemos dado ninguno de estos últimos).
CREATE FUNCTION nombreFuncion(valorIntroducir varchar(100)) RETURNS varchar(1000) DETERMINISTIC -- NOT DETERMINISTIC 
BEGIN
	 RETURN result; -- Valor de retorno (Obligatorio para que compile la función)
END €€ -- Fin de la función
DELIMITER ; -- Cambio del delimitador

SELECT nombreFuncion("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ") as Resultado; -- Select que haga uso de la función recién creada