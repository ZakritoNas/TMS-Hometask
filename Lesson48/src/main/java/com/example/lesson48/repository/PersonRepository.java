package com.example.lesson48.repository;

import com.example.lesson48.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Integer> {
Optional<Person> findByLogin (String login);
}
