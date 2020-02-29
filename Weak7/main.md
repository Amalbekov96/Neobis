# Main

```java 

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

//        Bank bank = new Bank();
//        bank.setName("Bob");
//        bank.setAddress("Chui/Sovetskaya");
//
        Users user = new Users();

        user.setName("Jane");
        user.setDateOfBirth("1996-05-19");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
    }
}


```
