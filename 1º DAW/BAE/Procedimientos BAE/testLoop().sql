USE world;
DROP PROCEDURE IF EXISTS testLoop;

DELIMITER €€
CREATE PROCEDURE testLoop()
BEGIN
	declare X int default 0;
    declare str varchar(100) default "";
    
	beta: LOOP
		IF X>10 THEN
			leave beta;
		END IF;
        
        IF X%2=1 THEN
			set X = X+1;
            ITERATE beta;
		END IF;
        
		set str=concat(str,x,",");        
		set X = X+1;
        
    END LOOP;
     
    select str=concat(str,0,length(str));
	select str;
END €€
DELIMITER ;

call testLoop();