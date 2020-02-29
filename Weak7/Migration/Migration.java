package Data_migration;
import org.flywaydb.core.Flyway;

public class Migrate_app {
    public static void main(String[] args) {

        Flyway flyway = Flyway.configure().dataSource("jdbc:mysql://localhost:3306/Nature?currentSchema=recods", "root", "mysql2019").load();
        flyway.migrate();
    }
}

