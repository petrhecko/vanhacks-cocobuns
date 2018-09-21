package com.swiftavenue.vanhacks2018.repositories;

import java.util.List;
import com.swiftavenue.vanhacks2018.repositories.dao.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByLastName(String lastName);
}
