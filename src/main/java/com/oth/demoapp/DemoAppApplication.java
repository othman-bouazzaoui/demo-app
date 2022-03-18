package com.oth.demoapp;

import com.oth.demoapp.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAppApplication {

    @GetMapping("")
    public String hello() {
        Person person = new Person(1L,"Othman BOUAZZAOUI");
        return "Hello " + person.getName() + " your ID is " + person.getId();
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }

}
