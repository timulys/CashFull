package my.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CashfullApplication {

	public static void main(String[] args) {
		SpringApplication.run(CashfullApplication.class, args);
	}
}
