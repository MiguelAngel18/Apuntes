USE world;
DROP PROCEDURE IF EXISTS poblacionPorContinente;
DELIMITER $$
CREATE PROCEDURE poblacionPorContinente()
BEGIN
    DECLARE error int DEFAULT 0;
    DECLARE nContinente varchar(100) DEFAULT "";
    DECLARE supTotal decimal(12,2) DEFAULT 0;
    DECLARE x,nLenguas,numPaises,numCiudades,lenguasTotales int DEFAULT 0;
    DECLARE pobTotal bigint DEFAULT 0;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET error=1;
    DROP TEMPORARY TABLE IF EXISTS temp_PPC;
    CREATE TEMPORARY TABLE temp_PPC(continente varchar(100) PRIMARY KEY, paises int,
    ciudades int, superficie decimal(12,2), poblacion bigint, lenguas int); 
    bucle:LOOP
		SELECT DISTINCT continent INTO nContinente FROM country ORDER BY continent LIMIT x,1;
		IF error=1 THEN LEAVE bucle; END IF;
		SELECT SUM(population), SUM(surfacearea), COUNT(name) INTO pobTotal, supTotal, numPaises FROM country WHERE continent LIKE nContinente;
		SELECT COUNT(city.name) INTO numCiudades FROM country INNER JOIN city ON code=countrycode WHERE continent LIKE nContinente;
		SELECT COUNT(DISTINCT language) INTO nLenguas FROM countrylanguage INNER JOIN country ON code=countrycode WHERE continent LIKE nContinente;
		INSERT INTO temp_PPC VALUES(nContinente, numPaises, numCiudades, supTotal, pobTotal, nLenguas);
		SET x=x+1;
    END LOOP;
    SELECT COUNT(DISTINCT language) INTO lenguasTotales FROM countrylanguage;
    SELECT SUM(paises),SUM(ciudades),SUM(superficie),SUM(poblacion) into numPaises, numCiudades, supTotal, pobTotal FROM temp_PPC;
    INSERT INTO temp_PPC VALUES ("TotalMundo", numPaises, numCiudades, supTotal, pobTotal, lenguasTotales);
    SELECT * FROM temp_PPC;
    DROP TEMPORARY TABLE IF EXISTS temp_PPC;
END$$
DELIMITER ;

CALL poblacionPorContinente();