package com.diegolinkk.postgresteste.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegolinkk.postgresteste.repositories.TodoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import com.diegolinkk.postgresteste.entities.Todo;

@RestController
@RequestMapping(value = "/")
public class TodoResource {
    @Autowired
    private TodoRepository repository;

    @GetMapping
    public ResponseEntity<List<Todo>> findAll(){
        List<Todo> todos = repository.findAll();
        return ResponseEntity.ok().body(todos);

    }
}
