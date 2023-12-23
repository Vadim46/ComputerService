package com.mycompany.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerServiceRepository extends CrudRepository<ComputerService, Integer> {
     Long countById(Integer id);
}
