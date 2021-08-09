package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpringController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/index")
    public List<Person> hello() {
        return personRepository.findAll();
    }
}
