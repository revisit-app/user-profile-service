package io.github.revisit_app.userprofileservice;

import com.datastax.oss.driver.api.core.CqlSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import io.github.revisit_app.userprofileservice.connection.DataStaxAstraProperties;

@EnableConfigurationProperties(DataStaxAstraProperties.class)
@SpringBootApplication
public class UserProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProfileServiceApplication.class, args);
	}

	@Bean
	public CqlSession connectToAstra(DataStaxAstraProperties astraProperties) {

		CqlSession cqlSession = CqlSession.builder()
				.withCloudSecureConnectBundle(astraProperties.getSecureConnectBundle().toPath())
				.withAuthCredentials(astraProperties.getUsername(),
						astraProperties.getPassword())
				.withKeyspace(astraProperties.getKeyspace())
				.build();

		return cqlSession;
	}
}
