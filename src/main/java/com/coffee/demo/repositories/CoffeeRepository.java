package com.coffee.demo.repositories;

import com.coffee.demo.entities.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
