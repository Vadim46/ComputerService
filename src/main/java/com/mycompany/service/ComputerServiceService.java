package com.mycompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ComputerServiceService {
    @Autowired private ComputerServiceRepository repo;

    public List<ComputerService> ListAll(){

        return (List<ComputerService>) repo.findAll();
    }

    public void save(ComputerService user) {

        repo.save(user);
    }
    public Optional<ComputerService> get(Integer id) {
       return repo.findById(id);

    }

    public boolean delete(Integer id) {
        Long count = repo.countById(id);
        if (count == null || count == 0){
           return false;
        }
        repo.deleteById(id);
        return true;

    }
}
