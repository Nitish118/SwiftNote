package com.swiftnote.swiftNote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SwiftNoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiftNoteApplication.class, args);
	}

	@Bean
	public PlatformTransactionManager db(MongoDatabaseFactory dbFactory) {
		return new MongoTransactionManager(dbFactory);
	}

}

// PlatformTransactionManager
// MongoTransactionManager