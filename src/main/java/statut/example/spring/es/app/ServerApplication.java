package statut.example.spring.es.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import statut.example.spring.es.config.ApplicationConfiguration;

@SpringBootApplication
@Import(ApplicationConfiguration.class)
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
