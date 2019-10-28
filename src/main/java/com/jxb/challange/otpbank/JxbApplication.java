package com.jxb.challange.otpbank;

import com.jxb.challange.otpbank.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class JxbApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxbApplication.class, args);
    }

}
