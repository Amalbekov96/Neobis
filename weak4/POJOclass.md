
# My pojo class on Comics_shop
## Users

```java
public class Users {
    private int ID;
    private String Name;
    private String DateOfBirth;
    private String email;
    private String phone;

    public Users(int ID,
                 String Name,
                 String DateOfBirth,
                 String email,
                 String phone
    )
    {
        this.ID = ID;
        this.Name = Name;
        this.DateOfBirth = DateOfBirth;
        this.email = email;
        this.phone = phone;
    }
    public int getID() { return ID; }
    public String getName()
    {
        return Name;
    }
    public String getPrice()
    {
        return DateOfBirth;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPhone()
    {
        return phone;
    }
}

```
## Categories

```java

public class Categories {
    private int ID;
    private String Name;
    private String Description;


    public Categories(int ID,
                 String Name,
                 String DateOfBirth
    )
    {
        this.ID = ID;
        this.Name = Name;
        this.Description = Description;
    }
    public int getID() { return ID; }
    public String getName()
    {
        return Name;
    }
    public String getDescription()
    {
        return Description;
    }
}

```

## Prices

```java

public class Prices {
    private int ID;
    private double Amount;

    public Prices(int ID,
                      String Name)
    {
        this.ID = ID;
        this.Amount = Amount;
    }
    public int getID() { return ID; }
    public double getAmount()
    {
        return Amount;
    }
}

```
## Banks

```java

public class Banks {
    private int ID;
    private String Name;
    private String Address;


    public Banks(int ID,
                      String Name,
                      String Address
    )
    {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
    }
    public int getID() { return ID; }
    public String getName()
    {
        return Name;
    }
    public String getAddress()
    {
        return Address;
    }
}
```

## Products

```java
public class Products {
    private int ID;
    private String Name;
    private int categoryID;
    private int priceID;
    private String phone;

    public Products(int ID,
                 String Name,
                 int categoryID,
                 int priceID,
                 String phone
    )
    {
        this.ID = ID;
        this.Name = Name;
        this.categoryID = categoryID;
        this.priceID = priceID;
        this.phone = phone;
    }
    public int getID() { return ID; }
    public String getName()
    {
        return Name;
    }
    public int getCategoryID()
    {
        return categoryID;
    }
    public int getPriceID()
    {
        return priceID;
    }
    public String getPhone()
    {
        return phone;
    }
}
```

## Purchases

```java

public class Purchases {
    private int ID;
    private int userID;
    private int productID;
    private int priceID;
    private String date;

    public Purchases(int ID,
                    int userID,
                    int productID,
                    int priceID,
                    String date
    )
    {
        this.ID = ID;
        this.userID = userID;
        this.productID = productID;
        this.priceID = priceID;
        this.date = date;
    }
    public int getID() { return ID; }
    public int getUserID()
    {
        return userID;
    }
    public int getProductID()
    {
        return productID;
    }
    public int getPriceID()
    {
        return priceID;
    }
    public String getDate()
    {
        return date;
    }
}
```

## creditCards

```java
public class creditCards {
    private int ID;
    private int userID;
    private int bankID;
    private String cardNum;
    private String expirationDate;

    public creditCards(int ID,
                    int userID,
                    int bankID,
                    String cardNum,
                    String expirationDate
    )
    {
        this.ID = ID;
        this.userID = userID;
        this.bankID = bankID;
        this.cardNum = cardNum;
        this.expirationDate = expirationDate;
    }
    public int getID() { return ID; }
    public int getUserID() { return userID; }
    public int getProductID() { return bankID; }
    public String getPriceID() { return cardNum; }
    public String getDate() { return expirationDate; }
}
```
