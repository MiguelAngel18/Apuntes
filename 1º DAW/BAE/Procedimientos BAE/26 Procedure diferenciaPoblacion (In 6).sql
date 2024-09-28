USE world;
DROP PROCEDURE IF EXISTS diferenciaPoblacion;
DELIMITER $$
CREATE PROCEDURE diferenciaPoblacion(IN ciudad1 varchar(100),IN ciudad2 varchar(100))
BEGIN
	DECLARE pobla1, pobla2 int DEFAULT 0;
    SELECT population INTO pobla1 FROM city WHERE name LIKE ciudad1 LIMIT 1;
	SELECT population INTO pobla2 FROM city WHERE name LIKE ciudad2 LIMIT 1;
    SELECT ABS(pobla1-pobla2) AS diferencia;
END$$
DELIMITER ;
CALL diferenciaPoblacion("Madrid","Barcelona");