USE world;
DROP PROCEDURE IF EXISTS ciudadesEspañolas;
DELIMITER $$
CREATE PROCEDURE ciudadesEspañolas()
BEGIN
	SELECT ci.name, ci.population FROM city ci INNER JOIN country co
	ON code=countrycode WHERE co.name LIKE "Spain";
END$$
DELIMITER ;
CALL ciudadesEspañolas();