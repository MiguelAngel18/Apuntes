USE world;
DROP PROCEDURE IF EXISTS cuantosEuropeos;
DELIMITER $$
CREATE PROCEDURE cuantosEuropeos()
BEGIN
	DECLARE paisesEuropeos int DEFAULT 0;
	DECLARE poblacionEuropea int;
    
	SET poblacionEuropea=0;
	SELECT COUNT(*) INTO paisesEuropeos FROM country WHERE continent LIKE "Europe";
	SELECT SUM(population) INTO poblacionEuropea FROM country WHERE continent LIKE "Europe";
    
	SELECT paisesEuropeos, poblacionEuropea;
END$$
DELIMITER ;
CALL cuantosEuropeos();