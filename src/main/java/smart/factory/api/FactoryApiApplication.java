package smart.factory.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FactoryApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoryApiApplication.class, args);
    }

}
