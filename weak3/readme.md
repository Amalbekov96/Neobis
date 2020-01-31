# part 1  

### some of the codes i have not saved so i had no time to write them all over again just submitted the ones i had

## Select all
```sql 
SELECT * FROM City
```


## Select by Id

```sql 
SELECT * FROM CITY 
    WHERE ID = 1661;
```


## Japanese Cities’ Attributes


```sql 
SELECT * FROM CITY 
    WHERE COUNTRYCODE = 'JPN';
```


## Japanese Cities’ Names


```sql 
SELECT NAME FROM CITY 
    WHERE COUNTRYCODE = 'JPN';
```


## Weather Observation Station 1

```sql 
SELECT CITY, STATE FROM STATION;
```

## Weather Observation Station 3


```sql 
SELECT DISTINCT CITY FROM STATION 
    WHERE MOD(ID,2) = '0';
```

## Weather Observation Station 5

```sql 
SELECT TOP 1 CITY, MIN(LEN(CITY)) FROM STATION 
GROUP BY CITY
HAVING MIN(LEN(CITY)) = (SELECT MIN(LEN(CITY)) FROM STATION)
UNION
SELECT TOP 1 CITY, MIN(LEN(CITY)) FROM STATION 
GROUP BY CITY
HAVING MIN(LEN(CITY)) = (SELECT MAX(LEN(CITY)) FROM STATION)
```

## Weather Observation Station 7


```sql 
SELECT DISTINCT CITY FROM STATION WHERE RIGHT(CITY, 1) = 'a'
                        OR RIGHT(CITY, 1) = 'e'
                        OR RIGHT(CITY, 1) = 'i'
                        OR RIGHT(CITY, 1) = 'o'
                        OR RIGHT(CITY, 1) = 'u';
```



## Higher Than 75 Marks

```sql 
SELECT NAME FROM STUDENTS WHERE MARKS > 75 
    ORDER BY SUBSTRING(NAME,LEN(NAME) - 2, LEN(NAME)-1), ID ASC;
```

## Employee Names


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
 
## Cearense Championship

```sql


;with nm(team_1, numM) as (
select team_1, count(team_1) as numM from
    (Select team_1 from matches 
    union all 
    Select team_2 from matches) nm 
group by team_1)
, vi(team_1, numV) AS
(
select team_1, count(team_1) from
    (select team_1 from matches 
    where team_1_goals > team_2_goals
    union all 
    select team_2 from matches 
    where team_2_goals > team_1_goals) w
GROUP BY team_1
)
, def (team_1, numDe) AS
(
select team_1, count(team_1) from
    (select team_1 from matches 
    where team_1_goals < team_2_goals
    union all 
    select team_2 from matches 
    where team_2_goals < team_1_goals) w
GROUP BY team_1
)
, dra (team_1, numDr) AS
(
select team_1, count(team_1) from
    (select team_1 from matches 
    where team_1_goals = team_2_goals
    union all 
    select team_2 from matches 
    where team_2_goals = team_1_goals) w
GROUP BY team_1
)
, sco (team_1, numSc) AS
(
select team_1, sum(sc) from
    (select team_1, IIF(team_1_goals > team_2_goals, 3, 1) as sc from matches 
    where team_1_goals > team_2_goals or team_1_goals = team_2_goals
    union all 
    select team_2, IIF(team_2_goals > team_1_goals, 3, 1) from matches 
    where team_2_goals > team_1_goals or team_2_goals = team_1_goals) s
GROUP BY team_1
)

select name, numM as matches
    , IIF(numV IS NULL, 0, numV) as victories
    , IIF(numDe IS NULL, 0, numDe) as defeats 
    , IIF(numDr IS NULL, 0, numDr) as draws
    , IIF(numsc IS NULL, 0, numSc) as score
    from teams t
left join nm
on t.id = nm.team_1
left join vi 
on t.id = vi.team_1
left join def
on t.id = def.team_1
left join dra
on t.id = dra.team_1
left join sco
on t.id = sco.team_1
order by numSc desc
```
# Part 2

## My POJO class 

```java 

public class SportShop {
    String nameOfProduct;
    public String id;
    private double Price;

    public SportShop(String nameOfProduct, String id,
                    double Price)
    {
        this.nameOfProduct = nameOfProduct;
        this.id = id;
        this.Price = Price;
    }

    public String getNameOfProduct()
    {
        return nameOfProduct;
    }
    public String getId()
    {
        return id;
    }
    public Double getPrice()
    {
        return Price;
    }
}

```
