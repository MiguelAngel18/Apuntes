USE world;
DROP PROCEDURE IF EXISTS nombreConMasLetras;
DELIMITER $$
CREATE PROCEDURE nombreConMasLetras(IN pais varchar(100), INOUT cuantas int)
BEGIN
	SELECT ci.name FROM city ci INNER JOIN country co ON code=countrycode 
    WHERE co.name LIKE pais AND LENGTH(ci.name)>cuantas;
    SELECT COUNT(*) INTO cuantas FROM city ci INNER JOIN country co ON code=countrycode 
    WHERE co.name LIKE pais AND LENGTH(ci.name)>cuantas;
END$$
DELIMITER ;

SET @g=10;
CALL nombreConMasLetras("Spain",@g);
SELECT @g;