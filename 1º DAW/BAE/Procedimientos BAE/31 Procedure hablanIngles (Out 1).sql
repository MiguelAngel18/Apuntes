USE world;
DROP PROCEDURE IF EXISTS hablanIngles;
DELIMITER $$
CREATE PROCEDURE hablanIngles(OUT cuantos int)
BEGIN
    SELECT COUNT(*) INTO cuantos FROM country INNER JOIN countrylanguage ON code=countrycode 
    WHERE language LIKE "english" AND continent LIKE "europe";
END$$
DELIMITER ;
CALL hablanIngles(@g);
SELECT @g;