package client;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.internal.database.base.Database;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Migration {

    private static final Logger LOGGER = LoggerFactory.getLogger(Database.class);
    private Configuration configuration;

    public void migrate() {
        Flyway flyway = Flyway
                .configure()
                .dataSource("jdbc:h2:tcp://localhost/~/test", "sa", "")
                .load();

        flyway.migrate();
        ClientService clientService = new ClientService();
    }
}


