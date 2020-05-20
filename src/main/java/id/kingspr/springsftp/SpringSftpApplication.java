package id.kingspr.springsftp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@IntegrationComponentScan
@EnableIntegration
public class SpringSftpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSftpApplication.class, args);
	}
}
