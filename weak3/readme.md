# part 1  

### some of the codes i have not saved so i had no time to write them all over again just submitted the ones i had

## Select all
```sql 
SELECT * FROM City
```


##Select by Id

```sql 
SELECT * FROM CITY 
    WHERE ID = 1661;
```


##Japanese Cities’ Attributes


```sql 
SELECT * FROM CITY 
    WHERE COUNTRYCODE = 'JPN';
```


##Japanese Cities’ Names


```sql 
SELECT NAME FROM CITY 
    WHERE COUNTRYCODE = 'JPN';
```


##Weather Observation Station 1

```sql 
SELECT CITY, STATE FROM STATION;
```

##Weather Observation Station 3


```sql 
SELECT DISTINCT CITY FROM STATION 
    WHERE MOD(ID,2) = '0';
```



##Weather Observation Station 5


```sql 
SELECT TOP 1 CITY, MIN(LEN(CITY)) FROM STATION 
GROUP BY CITY
HAVING MIN(LEN(CITY)) = (SELECT MIN(LEN(CITY)) FROM STATION)
UNION
SELECT TOP 1 CITY, MIN(LEN(CITY)) FROM STATION 
GROUP BY CITY
HAVING MIN(LEN(CITY)) = (SELECT MAX(LEN(CITY)) FROM STATION)
```

##Weather Observation Station 7


```sql 
SELECT DISTINCT CITY FROM STATION WHERE RIGHT(CITY, 1) = 'a'
                        OR RIGHT(CITY, 1) = 'e'
                        OR RIGHT(CITY, 1) = 'i'
                        OR RIGHT(CITY, 1) = 'o'
                        OR RIGHT(CITY, 1) = 'u';
```



##Higher Than 75 Marks

```sql 
SELECT NAME FROM STUDENTS WHERE MARKS > 75 
    ORDER BY SUBSTRING(NAME,LEN(NAME) - 2, LEN(NAME)-1), ID ASC;
```

##Employee Names


```sql 
 SELECT NAME FROM Employee ORDER BY NAME ASC;
```

## Update sem Where

```sql
select name, price from
    (select id,name, CASE type WHEN 'A' THEN 20.0
                        WHEN 'B' THEN 70.0
                        ELSE 530.5
                        END as price
    , DENSE_RANK () OVER(PARTITION BY type 
        ORDER BY id desc
    ) as Den
    FROM products) b 
order by price asc, Den asc
```
 
# Part 2
