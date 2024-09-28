IF expresion THEN

Bloque de comandos acabado en ;

END IF ;
_____________________________________________________________

IF expresion THEN

Bloque TRUE

ELSE

Bloque FALSE

END IF ;
______________________________________________________________

IF expresion THEN

Bloque de comandos acabado en ;

ELSEIF

Bloque de comandos acabado en ;

ELSEIF

Bloque de comandos acabado en ;

ELSE
Bloque de comandos acabado en ;

END IF ;


CASE (expresión)

when valor1 THEN BLOQUE1;
when valor2 THEN BLOQUE2;
when valor3 THEN BLOQUE3;
when valor4 THEN BLOQUE4;

ELSE bloqueN; BEGIN - END; (No es ninguno del los casos anteriores)
END CASE;


CASE PAIS

	WHEN "SPAIN" THEN SET DIAS=1;
	WHEN "FRANCE" THEN SET DIAS=5;
    
    ELSE bloqueN;

END CASE;




