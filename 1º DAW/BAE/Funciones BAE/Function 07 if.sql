USE world;
DROP FUNCTION IF EXISTS si;
DELIMITER $$
CREATE FUNCTION si(condicion boolean, opcionSi varchar(100), opcionNo varchar(100)) RETURNS varchar(100) DETERMINISTIC
BEGIN
	IF condicion THEN RETURN opcionSi;
    ELSE RETURN opcionNo;
    END IF;
END$$
DELIMITER ;

SELECT si(length("Hola")<4,"SI","NO");