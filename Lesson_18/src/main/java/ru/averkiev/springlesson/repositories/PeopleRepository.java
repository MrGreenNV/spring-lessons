package ru.averkiev.springlesson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.averkiev.springlesson.models.Person;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

    List<Person> findByName(String name);
    List<Person> findByNameOrderByAge(String name);
    List<Person> findByNameStartingWith(String startingWith);

}
