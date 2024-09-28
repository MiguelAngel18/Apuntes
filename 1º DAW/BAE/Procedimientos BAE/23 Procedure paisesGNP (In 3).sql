USE world;
DROP PROCEDURE IF EXISTS paisesGNP;
DELIMITER $$
CREATE PROCEDURE paisesGNP(IN continente varchar(100))  
BEGIN
	DECLARE cuantos int DEFAULT 0;
	SELECT name, gnpold, gnp, (gnp-gnpold) AS 'incremento real', 
    CONCAT(ROUND((gnp-gnpold)*100/gnpOld,2),"%") AS porcentaje FROM country 
    WHERE continent LIKE continente AND (gnp-gnpold)*100/gnpOld<-1;
	SELECT COUNT(*) INTO cuantos FROM country 
    WHERE continent LIKE continente AND (gnp-gnpold)*100/gnpOld<-1;
    SELECT cuantos;
END$$
DELIMITER ;
CALL paisesGNP("Asia");