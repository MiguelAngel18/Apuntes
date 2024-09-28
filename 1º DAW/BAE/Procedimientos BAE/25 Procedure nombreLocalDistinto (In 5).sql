USE world;
DROP PROCEDURE IF EXISTS nombreLocalDistinto;
DELIMITER $$
CREATE PROCEDURE nombreLocalDistinto(IN continente varchar(100))
BEGIN
	-- SELECT name, localname FROM country co
    -- WHERE continent LIKE continente AND name!=localname AND "english" NOT IN
    -- (SELECT language FROM countrylanguage WHERE co.code LIKE countrycode);
    
    SELECT name, localname FROM country
    WHERE continent LIKE continente AND name!=localname AND code NOT IN
    (SELECT countrycode FROM countrylanguage WHERE language LIKE "english");
END$$
DELIMITER ;
CALL nombreLocalDistinto("Asia");