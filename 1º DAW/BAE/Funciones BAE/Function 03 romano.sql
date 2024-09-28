USE world;
DROP FUNCTION IF EXISTS romano;
DELIMITER $$
CREATE FUNCTION romano(valor int(2)) RETURNS varchar(8) DETERMINISTIC
BEGIN
	DECLARE decenas, unidades int(1) DEFAULT 0;
    DECLARE numRomano varchar(8) DEFAULT "";
    SET decenas=valor DIV 10; -- SET decenas=FLOOR(valor/10);
    SET unidades=valor%10;    -- SET unidades=valor MOD 10;
	CASE decenas
		WHEN 0 THEN SET numRomano="";
		WHEN 1 THEN SET numRomano="X";
        WHEN 2 THEN SET numRomano="XX";
        WHEN 3 THEN SET numRomano="XXX";
        WHEN 4 THEN SET numRomano="XL";
        WHEN 5 THEN SET numRomano="L";
        WHEN 6 THEN SET numRomano="LX";
        WHEN 7 THEN SET numRomano="LXX";
        WHEN 8 THEN SET numRomano="LXXX";
        WHEN 9 THEN SET numRomano="XC";
        ELSE BEGIN END;
	END CASE;
    CASE unidades
		WHEN 0 THEN SET numRomano=CONCAT(numRomano,"");
		WHEN 1 THEN SET numRomano=CONCAT(numRomano,"I");
        WHEN 2 THEN SET numRomano=CONCAT(numRomano,"II");
        WHEN 3 THEN SET numRomano=CONCAT(numRomano,"III");
        WHEN 4 THEN SET numRomano=CONCAT(numRomano,"IV");
        WHEN 5 THEN SET numRomano=CONCAT(numRomano,"V");
        WHEN 6 THEN SET numRomano=CONCAT(numRomano,"VI");
        WHEN 7 THEN SET numRomano=CONCAT(numRomano,"VII");
        WHEN 8 THEN SET numRomano=CONCAT(numRomano,"VIII");
        WHEN 9 THEN SET numRomano=CONCAT(numRomano,"IX");
        ELSE BEGIN END;
	END CASE;
RETURN numRomano;
END$$
DELIMITER ;

SELECT romano(88);