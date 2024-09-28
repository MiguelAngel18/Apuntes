USE world;
DROP PROCEDURE IF EXISTS ciudadesDeUnPais;
DELIMITER $$
CREATE PROCEDURE ciudadesDeUnPais(IN pais varchar(100))
BEGIN
	SELECT ci.name FROM city ci INNER JOIN 
    country co ON code=countrycode
    WHERE co.name LIKE pais;
END$$
DELIMITER ;
CALL ciudadesDeUnPais("Spain");