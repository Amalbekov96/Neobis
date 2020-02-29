# Users

```java

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "Users")


public class Users {
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

    @Column(name = "dateOfBirth")

    private String dateOfBirth;

    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
}


```
