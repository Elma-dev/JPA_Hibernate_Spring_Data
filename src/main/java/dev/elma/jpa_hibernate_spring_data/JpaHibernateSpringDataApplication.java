package dev.elma.jpa_hibernate_spring_data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaHibernateSpringDataApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JpaHibernateSpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
