/*
-- Esquelete de todo procedimiento --

USE world; -- Base de Datos a Usar
DROP PROCEDURE IF EXISTS nombreProcedimiento; -- Borrado del procedimiento
DELIMITER $$ -- Cambio de delimitador
CREATE PROCEDURE nombreProcedimiento(IN valor1 int, OUT valor2 int,INOUT valor3 int) -- Creación del precedimiento, junto con los parámetros de entrada, salida y entrada-salida
BEGIN
-- Conjunto de acciones que se realizan en el procedimiento. Todo procedimiento ha de acabar en un 'select' que llame a ver los valores requeridos
	SELECT * FROM tabla;
END$$
DELIMITER ; -- Cambio de delimitador

CALL nombreProcedimiento(); -- Llamada del procedure



*/
-- Ejemplo de un procedimiento con valores de entrada IN,OUT y INOUT.

-- Ignorar

use bdclientes;
DROP PROCEDURE IF EXISTS actualizar_saldo; -- Borrado del procedimiento
CREATE PROCEDURE actualizar_saldo(IN cli_id INT, INOUT saldo DOUBLE, OUT mensaje VARCHAR(255))
BEGIN

    UPDATE clientes c SET saldo = (saldo - 100); WHERE cliente_id = cli_id;
    IF(saldo >= 0) THEN
        SET mensaje = 'Saldo actualizado correctamente.';
    ELSE
        SET mensaje = 'Saldo insuficiente.';
        SET saldo = 0;
    END IF;

END;

-- cliente_id: Es una variable de entrada (IN), por lo que su valor se introduce y, en esta ocación no se modifica.
-- saldo: Es una variable de entrada-salida (INOUT), por lo que su valor se introduce, por norma general se modificará y se devolverá.
-- mensaje: Es una variable de salida (OUT), por lo que su valor se devolverá y/o se mostrará por pantalla.

CALL actualizar_saldo;