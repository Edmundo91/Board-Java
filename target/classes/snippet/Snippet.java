package snippet;

public class Snippet {
	try (var connection = ConnectionConfig.getConnection()) { // Chamando corretamente
	        new MigrationStrategy(connection).executeMigration();
	    }
}

