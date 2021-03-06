package br.com.carlettisolucoes.dishes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="br.com.carlettisolucoes.dishes")
@EnableJpaRepositories("br.com.carlettisolucoes.dishes")
@ImportResource("applicationContext.xml")
public class App {
    public static void main( String[] args ) {
    	SpringApplication.run(App.class, args);
    }
}
