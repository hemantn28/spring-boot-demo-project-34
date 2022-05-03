package com.example.demo.service;

import com.example.demo.model.Politician;
import com.example.demo.repository.PoliticianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class PoliticianDBService {

    //Create
    @Autowired
    PoliticianRepository repository;

    public String add(Politician politician){
        repository.save(politician);
        return "politician added to db successfully";

    }

    //Get


    public List<Politician> getAll(){
        return repository.findAll();
    }


    //Update


    public String update(@PathVariable int age,@PathVariable Integer id){
        Politician politician=repository.getById(id);
        politician.setAge(72);
        repository.save(politician);
        return "politician age updated in db successfully...";

    }


    //Delete


    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "politician deleted in db successfully";

    }
}
