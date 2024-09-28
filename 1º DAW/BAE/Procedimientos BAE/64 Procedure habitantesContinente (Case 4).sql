USE world;
DROP PROCEDURE IF EXISTS habitantesContinente;
DELIMITER $$
CREATE PROCEDURE habitantesContinente()
BEGIN
    DECLARE pais, continente varchar(100) DEFAULT "";
    DECLARE maximo, valor int DEFAULT 0;
    DECLARE mensaje varchar(100) DEFAULT "La gente de allí es ";
    SELECT COUNT(*) INTO maximo FROM country;
    SELECT FLOOR(RAND()*maximo) INTO valor;
    SELECT name INTO pais FROM country ORDER BY code LIMIT valor,1;
    SELECT continent INTO continente FROM country WHERE name LIKE pais;
    CASE continente
		WHEN "Europe" THEN SET mensaje=CONCAT(mensaje,"europea");
    	WHEN "Asia" THEN SET mensaje=CONCAT(mensaje,"asiática");
		WHEN "Africa" THEN SET mensaje=CONCAT(mensaje,"africana");
    	WHEN "North America" THEN SET mensaje=CONCAT(mensaje,"americana");
        WHEN "South America" THEN SET mensaje=CONCAT(mensaje,"americana");
        WHEN "Oceania" THEN SET mensaje=CONCAT(mensaje,"oceánica");
		WHEN "Antarctica" THEN SET mensaje=CONCAT(mensaje,"antártica");
    	ELSE
			BEGIN
			END;
    END CASE;
    SELECT valor, pais, continente, mensaje;
END$$
DELIMITER ;

CALL habitantesContinente();