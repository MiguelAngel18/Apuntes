
-- Métodos de MySQL

/*

1. Procedimientos:

DROP PROCEDURE IF EXISTS nombreProcedure;
_________________________________________________________________________________________________________

DELIMITER €€
CREATE PROCEDURE nombreProcedure(IN parametro1 INT, INOUT parametro1 DOUBLE, OUT parametro1 VARCHAR(100))
BEGIN
			(Content)
END €€
DELIMITER ;
_________________________________________________________________________________________________________
CALL nobmreProcedure(Parametros);



1. Variables (DECLARE nombreVariable tipoDeValor DEFAULT valor).
   
   Externa: SET @nombreVarable = valorVariable;

   Interna: declare variableEjemplo int default 0;
   
   
2. Parámetros (IN,OUT,INOUT)
   
   Ejem: IN cliente_id INT, INOUT saldo DOUBLE, OUT mensaje VARCHAR(100)

   cliente_id: Es una variable de entrada (IN), por lo que su valor se introduce y, en esta ocación no se modifica.
   saldo: Es una variable de entrada-salida (INOUT), por lo que su valor se introduce, por norma general se modificará y se devolverá.
   mensaje: Es una variable de salida (OUT), por lo que su valor se devolverá y/o se mostrará por pantalla.

	
    Ejemplo de IN:
    
    Ejemplo de OUT:
    
    Un procedure que devuelve cuantas lenguas se hablan en un país dado.

	CREATE PROCEDURE cuantasLenguasPais(IN pais VARCHAR(100), OUT lenguas INT)
	...
	
    SET @l=0;

	CALL cuantasLenguasPais(“Spain”, @l);  
    
    o también
	
    CALL cuantasLenguasPais(“France”, @otra);

	Podemos ver el resultado de las formas siguientes:
	
    - SELECT @l;
    - SELECT @otra;
    
    
    
    Ejemplo de INOUT:
    
    DELIMITER $$
	CREATE PROCEDURE incremento(INOUT cont INT, IN inc INT)
	BEGIN
	SET cont=cont+inc;
	END$$
	DELIMITER ;

	Este procedimiento incrementa la variable ‘cont’ en una cantidad dada por ‘inc’.
    La llamada a este procedimiento deberá hacerse con una variable del sistema creada anteriormente:
	SET @c=20;
	CALL incremento(@c, 10);
	y podemos ver el resultado así:
	SELECT @c; -- Resultado de la suma de la variable inout @c y la variable in incremento =(30)

    
    
3. Sentencias de control (IF, ELSE, ELSEIF | CASE Simple y Complejo| While | REPEAT | LOOP | SHOW)
   
	IF(distancia <= 2) THEN SET precio=2.50;
   
	ELSEIF(distancia <= 10) THEN SET precio = 2.50 + (distancia - 2) * 1.80;
   
	ELSE SET precio=0;
   
    END IF;
_________________________________________________________________________________________________________________________________________________

   CASE
        WHEN nota_promedio >= 90 THEN set mensaje='Sobresaliente';
	    WHEN nota_promedio >= 80 THEN set mensaje='Notable';
		WHEN nota_promedio >= 70 THEN set mensaje='Bueno';
		WHEN nota_promedio >= 60 THEN set mensaje='Suficiente';
		DEFAULT 'Insuficiente'
   END CASE;
_________________________________________________________________________________________________________________________________________________
    
    WHILE (CONDICION) THEN
    END WHILE;
_________________________________________________________________________________________________________________________________________________    
    
    REPEAT
	
		Bloque de comandos;
	
    UNTIL expresión (no lleva “;” aquí)
	END REPEAT;
	
    El REPEAT itera y ejecuta su bucle en tanto la expresión de salida sea false. Si en alguna iteración la 
	expresión devuelve true, termina y pasa el control a la instrucción siguiente. Dado que la 
	comprobación se realiza después de pasar por su bloque, éste se ejecutará al menos una vez.
    
_________________________________________________________________________________________________________________________________________________

    etiqueta: LOOP
	
		IF expresión THEN LEAVE etiqueta; END IF; -- Expresión que sirve para salir del bucle
	
		IF expresión THEN ITERATE etiqueta; END IF; -- Expresión que sirve para volver al comienzo del bucle
	
		Bloque de comandos;
	
    END LOOP
    
    El LOOP itera y ejecuta su bucle (para siempre), a menos que añadamos un IF con una 
    condición de salida con LEAVE. Análogamente se puede añadir otro IF con una condición que
    implique volver a empezar con el bucle sin seguir adelante con ITERATE. La etiqueta se
    hace necesaria ya que tanto el LEAVE como el ITERATE la deben llevar en su sintaxis,
    debido a que podemos anidar varios LOOP y se debe siempre saber cuál es el LOOP que están
    referenciando (de cuál se quieren ir o continuar).
_________________________________________________________________________________________________________________________________________________
    
    SHOW PROCEDURE STATUS [LIKE pattern | WHERE expresión];
    
    Para mostrar las características de todos los PA de todas las BBDD:
    
    SHOW PROCEDURE STATUS WHERE db=”world”
    
    SHOW PROCEDURE STATUS WHERE name LIKE “testWhile”;
    
    

4. Manejadores de errores (Handler)

	Formato:  DECLARE nombreHandler HANDLER FOR tipo_de_error bloque_de_comandos;
    
	Este comando siempre va detrás de cualquier otra linea de DECLARE.
    Tiene un código que se ejecutará cuando se produzca el error que se esté manejador (tipo_de_error),
    puede ser una única instrucción SQL o todo un bloque entre BEGIN – END.
	
    
    La acción puede ser de dos tipos:
    
    - EXIT (después de ejecutarse el bloque_de_comandos se termina el PA)
    
	- CONTINUE (tras ejecutarse el bloque_de_comandos, el PA continúa su ejecución en la línea siguiente a la que produjo el error).
    
	
    
    'Tipo_de_error' es la condición o error que activará el handler y acepta uno de estos 4 formatos:
    
	- Un código de error, por ejemplo: DECLARE EXIT HANDLER FOR 1062 (Refiere a un código de error específico)
    
		SELECT “Error: intento de insertar una clave duplicada”;
	
    la palabra SQLSTATE seguida de una string que representa un estado de error concreto de
	SQL (varios números de errores pueden provocar el mismo estado), por ejemplo:
	DECLARE CONTINUE HANDLER FOR SQLSTATE “23000”
	SELECT “Error: intento de insertar una clave duplicada”;
	una de estas tres palabras: SQLEXCEPTION (que representaría una excepción en general sin 
	especificar cuál), SQLWARNING (lo mismo, pero un aviso) o NOT FOUND (que implica 
	cualquier condición de error producida en el caso de que se pida un dato en un query o un 
	cursor y no exista o simplemente porque se ha llegado al final del set), por ejemplo:
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
	ROLLBACK;
	SELECT “ERROR!! Se ha deshecho la última operación y el PA ha terminado”;
	END;
	 Un nombre asociado a un número de error concreto o a un estado SQLSTATE, asignado por el 
	usuario por ejemplo:
	DECLARE tabla_inexistente CONDITION FOR 1051; (asignamos un nombre al error 1051 
	para mayor legibilidad del código)
	DECLARE EXIT HANDLER FOR tabla_inexistente SELECT “Tabla inexistente”;
		
	Ejem: 




   
5. Cursor





7. Funciones



*/