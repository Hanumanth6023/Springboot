package com.onlineshopping.onlineshopping_mobile.Controller;

import com.onlineshopping.onlineshopping_mobile.Model.Model;
import com.onlineshopping.onlineshopping_mobile.Repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class MyController {

    @Autowired
    private MobileRepository mobilerepository;

    @GetMapping
    public List<Model> getAllModels() {
        return mobilerepository.findAll(); // list of mobiles
    }

    //build Insert mobile REST API
    @PostMapping
    public Model createModel(@RequestBody Model mobile) {
        return mobileRepository.save(employee);
    }

    //build get employee by id
    

}
