use world;
drop procedure if exists ejercicioCASE1;


DELIMITER €€
create procedure ej5()
BEGIN

    DECLARE random INT default 0;
    DECLARE inversa INT default 0;
    DECLARE capicua boolean default false;
    
    
    select RAND(1000) INTO random;
	

    IF(random<=100) THEN
		select * from city where city.ID <= random;
    END IF;
    
    IF((random/inversa)=0) THEN
		set capicua = true;
    END IF;
    

    IF(capicua = true) THEN
		select Name,ID from city where (random/inversa)=0;
        
		IF(random=max(city.ID) || random=min(city.ID)) THEN
			
            select name into ciudad from city where city.ID = random;
            select countryCode into codigo from city where city.id like ciudad;
			select name into pais from country where CountryCode like codigo;
			select Continent into continente from country where pais like pais;
            
			select ciudad, pais, continente;
        END IF;
    END IF;
    
    
END €€

DELIMITER ;



