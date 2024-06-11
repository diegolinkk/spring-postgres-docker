package com.diegolinkk.postgresteste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.diegolinkk.postgresteste.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
