# Main class
```java
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

public class Main {
    public static void main(String [] args)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("one");
        Bank bank = new Bank();

        bank.setId(4);
        bank.setName("KICB");
        bank.setAddress("Chui/Sovetskaya");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.persist(bank);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
    }
}
```
