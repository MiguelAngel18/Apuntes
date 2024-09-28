USE world;
DROP PROCEDURE IF EXISTS paisesAsiaticos;
DELIMITER $$
CREATE PROCEDURE paisesAsiaticos(IN poblacion int)
BEGIN
	SELECT name, population FROM country 
    WHERE continent LIKE "Asia" AND population>poblacion;
END$$
DELIMITER ;
CALL paisesAsiaticos(9999999);
