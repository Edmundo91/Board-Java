package com.Board_Java;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Board_Java.persistence.config.ConnectionConfig;
import com.Board_Java.persistence.migration.MigrationStrategy;
import com.Board_Java.ui.MainMenu;

@SpringBootApplication
public class BoardJavaApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(BoardJavaApplication.class, args);
	
	
		try (var connection = ConnectionConfig.getConnection()) { 
	        new MigrationStrategy(connection).executeMigration();
	    }
	
		new MainMenu().execute();
	
	
	
	}

}
