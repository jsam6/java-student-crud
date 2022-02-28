package com.firstcode.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args-> {
            Student ping = new Student( "ping1",  "ping1@ping.com", LocalDate.of(2000, Month.JANUARY, 5));

            Student ping2 = new Student( "ping2",  "ping2@ping.com", LocalDate.of(2000, Month.JANUARY, 5));

            repository.saveAll(
                List.of(ping, ping2)
            );
        };
    }
    
}
