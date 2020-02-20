# My Banks Class

```java 
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "Banks")

public class Bank {



    @Id
    @Column(name = "Id")
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name = "incrementator", strategy = "increment")

    private int Id;
    public int getId()
    {
        return Id;
    }
    public void setId(int Id)
    {
        this.Id = Id;
    }

    @Column(name = "name")
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    @Column(name = "address")
    private String address;
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String Address)
    {
        this.address = address;
    }
}


```
