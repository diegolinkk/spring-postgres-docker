package com.diegolinkk.postgresteste.config;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.diegolinkk.postgresteste.entities.Todo;
import com.diegolinkk.postgresteste.repositories.TodoRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{

    @Autowired
    private TodoRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Todo t1 = new Todo(null, "Diego");
        Todo t2 = new Todo(null, "Aline");
        Todo t3 = new Todo(null, "Isaque");

        repository.saveAll(Arrays.asList(t1,t2,t3));
        
    }
    
}
