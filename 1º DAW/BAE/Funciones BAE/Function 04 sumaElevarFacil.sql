USE world;
DROP FUNCTION IF EXISTS sumaElevarFacil;
DELIMITER $$
CREATE FUNCTION sumaElevarFacil(valor1 int unsigned ,valor2 int unsigned ) RETURNS int DETERMINISTIC
	RETURN POWER(valor1,valor2)+POWER(valor2,valor1)$$
DELIMITER ;

SELECT sumaElevarFacil(5,4);