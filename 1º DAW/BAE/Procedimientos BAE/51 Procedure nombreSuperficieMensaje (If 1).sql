drop procedure if exists nombreSuperficieMensaje;
DELIMITER $$
CREATE PROCEDURE nombreSuperficieMensaje(IN pais varchar(100))
BEGIN
	DECLARE superficie double DEFAULT 0;
    DECLARE mensaje varchar(100) DEFAULT "";
    SELECT surfacearea INTO superficie FROM country WHERE name LIKE pais;
    IF superficie<=10000 THEN SET mensaje="Pais pequeño";
    ELSEIF superficie<=500000 THEN SET mensaje="Pais normal";
    ELSEIF superficie<=1000000 THEN SET mensaje="Pais grande";
    ELSEIF superficie<=5000000 THEN SET mensaje="Pais muy grande";
    ELSE SET mensaje="Pais enorme";
    END IF;
	SELECT pais, superficie, mensaje;
END$$
DELIMITER ;

CALL nombreSuperficieMensaje("India");