package com.fish.esdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EsdemoApplication {

    /****
     * https://docs.spring.io/spring-data/elasticsearch/docs/3.1.10.RELEASE/reference/html/
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EsdemoApplication.class, args);
    }

}
