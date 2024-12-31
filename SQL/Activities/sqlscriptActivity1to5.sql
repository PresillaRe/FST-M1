REM   Script: Activity1,2,3,4,5
REM   This is for FST SQL

CREATE TABLE salesman(salesman_id int PRIMARY KEY,salesman_name varchar2(20), salesman_city varchar2(20),commission int);

DESCRIBE salesman


DESCRIBE salesman


CREATE TABLE salesman(salesman_id int PRIMARY KEY,salesman_name varchar2(20), salesman_city varchar2(20),commission int);

DESCRIBE salesman


INSERT ALL  
    INTO salesman VALUES(1000,'Ruchi','Mumbai',20);

    SELECT 1 FROM DUAL;

SELECT * FROM salesman;

DESCRIBE salesman


SELECT * FROM salesman;

DESCRIBE salesman


INSERT ALL;

SELECT * FROM salesman;

  DROP TABLE salesman 
--Create the salesman table 
CREATE TABLE salesman(salesman_id int PRIMARY KEY,salesman_name varchar2(20), salesman_city varchar2(20),commission int);

DESCRIBE salesman


INSERT ALL  
    INTO salesman VALUES(1000,'Ruchi','Mumbai',20) 
    INTO salesman VALUES(1001,'Ricky','Pune',10) 
    INTO salesman VALUES(1002,'Shilpa','Karwar',11) 
    INTO salesman VALUES(1003,'Druv','Meghalay',15)      
    SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id,salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city ='Pune';

SELECT samesman_id,commision FROM salesman WHERE salesman_name ='Ricky';

SELECT samesman_id,commission FROM salesman WHERE salesman_name ='Ricky';

SELECT salesman_id,commission FROM salesman WHERE salesman_name ='Ricky';

SELECT salesman_id,salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city ='Pune';

SELECT salesman_id,commission FROM salesman WHERE salesman_name ='Ricky';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

Update the grade score of salesmen from meghalay to 200. 
  UPDATE salesman SET  garde= 200 WHERE salesman_city='Meghalay';

Update the grade score of Ricky to 300. 
   UPDATE salesman SET  garde= 300 WHERE salesman_name='Ricky';

Update the name Druv to Sudesh. 
 UPDATE salesman SET  salesman_name= 'Sudesh' WHERE salesman_city='Meghalay';

SELECT * FROM salesman;

Update the grade score of salesmen from meghalay to 200. 
  UPDATE salesman SET  garde= 200 WHERE salesman_city='Meghalay';

Update the grade score of Ricky to 300. 
   UPDATE salesman SET  garde= 300 WHERE salesman_name='Ricky';

Update the name Druv to Sudesh. 
 UPDATE salesman SET  salesman_name= 'Sudesh' WHERE salesman_name='Druv';

  UPDATE salesman SET  garde= 200 WHERE salesman_city='Meghalay';

   UPDATE salesman SET  garde= 300 WHERE salesman_name='Ricky';

 UPDATE salesman SET  salesman_name='Sudesh' WHERE salesman_name='Druv';

UPDATE salesman SET  grade= 200 WHERE salesman_city='Meghalay';

   UPDATE salesman SET  grade= 300 WHERE salesman_name='Ricky';

 UPDATE salesman SET  salesman_name='Sudesh' WHERE salesman_name='Druv';

SELECT * FROM salesman;

