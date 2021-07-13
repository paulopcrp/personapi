
package com.github.paulocesar.personapi.repository;

import com.github.paulocesar.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
