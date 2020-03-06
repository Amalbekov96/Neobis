
# My vulnerabilities of Comics_shop.sql

```sql 
MY vulnerabilities 
1) name VARCHAR(30) NOT NULL,
2) dateOfBirth VARCHAR(30) NOT NULL,
3) amount INT NOT NULL
4) left the password and the real name of the database in the xml file

My explanations
1) Looks like my column name VARCHAR(30) is too short for some arabic names. 
2) the column consisting dateOfBirth must be date type.
3) should have been money type.
4) should be hidden 
```
