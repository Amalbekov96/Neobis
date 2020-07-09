# My Banks Class

```java 

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "Banks")


public class Bank {
    @Id
    @Column(name = "Id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy = "increment")


    private int id;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    @Column(name = "name")

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Column(name = "address")

    private String address;

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}

```
