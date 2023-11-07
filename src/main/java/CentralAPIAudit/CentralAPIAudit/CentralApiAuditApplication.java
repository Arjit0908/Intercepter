package CentralAPIAudit.CentralAPIAudit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;


@EnableJpaRepositories
@SpringBootApplication

public class CentralApiAuditApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralApiAuditApplication.class, args);
	}

}
