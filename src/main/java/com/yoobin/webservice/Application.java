package com.yoobin.webservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Application {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
            + System.getenv("HOMEPATH")==null?System.getenv("HOME"):System.getenv("HOMEPATH")+"/app/config/spring-webservice/real-application.yml";

    public static void main(String[] args) {

//        System.setProperty("spring.devtools.add-properties", String.valueOf(false));
        new SpringApplicationBuilder(Application.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }

}
