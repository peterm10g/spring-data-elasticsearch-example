package statut.example.spring.es.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@ComponentScan("statut.example.spring.es")
@PropertySource("classpath:application.properties")
@EnableElasticsearchRepositories(basePackages = "statut/example/spring/es/repository")
public class ApplicationConfiguration {

}

