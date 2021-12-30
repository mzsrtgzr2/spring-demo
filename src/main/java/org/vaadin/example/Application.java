package org.vaadin.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * The entry point of the Spring Boot application.
 * https://github.com/vaadin/flow-crm-tutorial/blob/main/src/main/java/com/example/application/data/entity/Status.java
 * https://www.youtube.com/watch?v=_109sgFRgA0&list=PLcRrh9hGNallPtT2VbUAsrWqvkQ-XE22h&index=8&ab_channel=vaadinofficial
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
