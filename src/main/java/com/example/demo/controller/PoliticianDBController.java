package com.example.demo.controller;

import com.example.demo.model.Politician;
import com.example.demo.service.PoliticianDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PoliticianDBController {

    //Create
    @Autowired
    PoliticianDBService service;

    @RequestMapping(value = "add_politician_db", method = RequestMethod.POST)
    public String add(@RequestBody Politician politician){
       return service.add(politician);


    }


    //Get

    @RequestMapping(value= "get_politician_db", method = RequestMethod.GET)
    public List<Politician> getAll(){
        return service.getAll();
    }


    //Update

    @RequestMapping(value = "update_politician_db/{age}/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable int age, @PathVariable Integer id){
        service.update(72,144);
        return "politician age updated in db successfully...";
    }


    //Delete

    @RequestMapping(value = "delete_politician_db", method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        service.delete(144);
        return "politician deleted in db successfully...";

    }

    }
