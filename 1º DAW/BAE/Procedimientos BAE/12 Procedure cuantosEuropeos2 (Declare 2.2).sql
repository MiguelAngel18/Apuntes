USE world;
DROP PROCEDURE IF EXISTS cuantosEuropeos2;
DELIMITER $$
CREATE PROCEDURE cuantosEuropeos2()
BEGIN
	DECLARE paisesEuropeos, poblacionEuropea int DEFAULT 0;
    
	SELECT COUNT(*), SUM(population) INTO paisesEuropeos, poblacionEuropea FROM country 
    WHERE continent LIKE "Europe";
    
	SELECT paisesEuropeos, poblacionEuropea;
END$$
DELIMITER ;
CALL cuantosEuropeos2();