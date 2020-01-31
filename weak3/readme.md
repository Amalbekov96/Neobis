# part 1

## Select all
```sql 
SELECT * FROM City
```


Select by Id

SELECT * FROM CITY 
    WHERE ID = 1661;

//-------------------------------------------------

Japanese Cities’ Attributes

SELECT * FROM CITY 
    WHERE COUNTRYCODE = 'JPN';

//------------------------------------------------

Japanese Cities’ Names

SELECT NAME FROM CITY 
    WHERE COUNTRYCODE = 'JPN';

//-----------------------------------------------------

Weather Observation Station 1

SELECT CITY, STATE FROM STATION;

//---------------------------------------------------

Weather Observation Station 3

SELECT DISTINCT CITY FROM STATION 
    WHERE MOD(ID,2) = '0';

//----------------------------------------------------

Weather Observation Station 5

SELECT TOP 1 CITY, MIN(LEN(CITY)) FROM STATION 
GROUP BY CITY
HAVING MIN(LEN(CITY)) = (SELECT MIN(LEN(CITY)) FROM STATION)
UNION
SELECT TOP 1 CITY, MIN(LEN(CITY)) FROM STATION 
GROUP BY CITY
HAVING MIN(LEN(CITY)) = (SELECT MAX(LEN(CITY)) FROM STATION)

//-------------------------------------------------------------

Weather Observation Station 7

SELECT DISTINCT CITY FROM STATION WHERE RIGHT(CITY, 1) = 'a'
                        OR RIGHT(CITY, 1) = 'e'
                        OR RIGHT(CITY, 1) = 'i'
                        OR RIGHT(CITY, 1) = 'o'
                        OR RIGHT(CITY, 1) = 'u';


//--------------------------------------------------------------

Higher Than 75 Marks

SELECT NAME FROM STUDENTS WHERE MARKS > 75 
    ORDER BY SUBSTRING(NAME,LEN(NAME) - 2, LEN(NAME)-1), ID ASC;

 //-------------------------------------------------------------


 Employee Names

 SELECT NAME FROM Employee ORDER BY NAME ASC;

 
