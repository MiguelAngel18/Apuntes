USE world;
DROP PROCEDURE IF EXISTS poblacionPorContinente;
DELIMITER $$
CREATE PROCEDURE poblacionPorContinente()
BEGIN

	/* Variables */
    DECLARE error int DEFAULT 0;
    DECLARE continentes,CURSOREJEMPLO varchar(100) DEFAULT "";
    DECLARE supTotal decimal(12,2) DEFAULT 0;
    DECLARE x,nLenguas,numPaises,numCiudades,lenguasTotales int DEFAULT 0;
    DECLARE pobTotal bigint DEFAULT 0;
      
 	/* Cursor */ DECLARE CURSOR_1 cursor for select   ;

    /* Handler */ DECLARE CONTINUE HANDLER FOR NOT FOUND SET error=1;
    
    DROP TEMPORARY TABLE IF EXISTS temp;
    CREATE TEMPORARY TABLE temp(
    CONTINENTE varchar(100) PRIMARY KEY, 
    PAISES int,
    CIUDADES int, 
    SUPERFICIE decimal(12,2), 
    POBLACION bigint, /* Int con mayor capacidad */
    LENGUAS int
    );
    
    OPEN CURSOR_1;
    FETCH CURSOR_1 INTO CURSOREJEMPLO;
    
		/* Bucle */
		beta:LOOP
		
		/* Aquí debería ir el FETCH */
			
			/* Salida del bucle */ IF error=1 THEN LEAVE beta; END IF;
		
			SELECT sum(population), sum(surfacearea), count(name) into pobTotal, supTotal, numPaises from country co where continent like continentes;
			SELECT count(city.name) into numCiudades from country INNER JOIN city ON code=countrycode where continent like continentes;
			SELECT count(distinct language) into nLenguas from countrylanguage INNER JOIN country ON code=countrycode where continent like continentes;
			INSERT INTO temp VALUES(continentes, numPaises, numCiudades, supTotal, pobTotal, nLenguas);
		
			/* Contador de vueltas */ SET x=x+1;
        
		END LOOP;
    CLOSE CURSOR_1;
    
    SELECT COUNT(DISTINCT language) INTO lenguasTotales FROM countrylanguage;
    SELECT SUM(PAISES),SUM(CIUDADES),SUM(SUPERFICIE),SUM(POBLACION) into numPaises, numCiudades, supTotal, pobTotal FROM temp;
    
    INSERT INTO temp VALUES ("TotalMundo", numPaises, numCiudades, supTotal, pobTotal, lenguasTotales);
    
    SELECT * FROM temp;
    DROP TEMPORARY TABLE IF EXISTS temp;
END$$
DELIMITER ;

CALL poblacionPorContinente();