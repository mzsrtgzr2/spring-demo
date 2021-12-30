package org.vaadin.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * The entry point of the Spring Boot application.
 * https://github.com/vaadin/flow-crm-tutorial/blob/main/src/main/java/com/example/application/data/entity/Status.java
 * https://www.youtube.com/watch?v=bxy2JgqqKDU&t=0s&ab_channel=vaadinofficial
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
