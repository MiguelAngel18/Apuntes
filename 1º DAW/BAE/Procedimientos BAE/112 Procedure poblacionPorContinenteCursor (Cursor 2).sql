USE world;
DROP PROCEDURE IF EXISTS poblacionPorContinenteCursor;
DELIMITER $$
CREATE PROCEDURE poblacionPorContinenteCursor()
BEGIN
    DECLARE error boolean DEFAULT false;
    DECLARE nContinente varchar(100) DEFAULT "";
    DECLARE supTotal decimal(12,2) DEFAULT 0;
    DECLARE nLenguas,numPaises,numCiudades,lenguasTotales int DEFAULT 0;
    DECLARE pobTotal bigint DEFAULT 0;
    DECLARE miCursor CURSOR FOR 
		SELECT DISTINCT continent FROM country ORDER BY continent;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET error=true;
    DROP TEMPORARY TABLE IF EXISTS temp_PPC;
    CREATE TEMPORARY TABLE temp_PPC(continente varchar(100) PRIMARY KEY, paises int,
    ciudades int, superficie decimal(12,2),poblacion bigint, lenguas int); 
    OPEN miCursor;
    bucle:LOOP
		FETCH miCursor INTO nContinente;
		IF error=true THEN LEAVE bucle; END IF;
		SELECT SUM(population), SUM(surfacearea), COUNT(name) INTO pobTotal, supTotal,
		numPaises FROM country WHERE continent LIKE nContinente;
		SELECT COUNT(city.name) INTO numCiudades FROM country INNER JOIN city 
		ON code=countrycode WHERE continent LIKE nContinente;
		SELECT COUNT(DISTINCT language) INTO nLenguas FROM countrylanguage 
		INNER JOIN country ON code=countrycode WHERE continent LIKE nContinente;
		INSERT INTO temp_PPC VALUES(nContinente, numPaises, numCiudades, supTotal,
		pobTotal, nLenguas);
    END LOOP;
    CLOSE miCursor;
    SELECT COUNT(DISTINCT language) INTO lenguasTotales FROM countrylanguage;
    SELECT SUM(paises),SUM(ciudades),SUM(superficie),SUM(poblacion) INTO numPaises,
    numCiudades, supTotal, pobTotal FROM temp_PPC;
    INSERT INTO temp_PPC VALUES ("TotalMundo", numPaises, numCiudades, supTotal,
    pobTotal, lenguasTotales);
    SELECT * FROM temp_PPC;
    DROP TEMPORARY TABLE IF EXISTS temp_PPC;
END$$
DELIMITER ;
CALL poblacionPorContinenteCursor();