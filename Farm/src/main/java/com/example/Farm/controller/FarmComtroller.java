package com.example.Farm.controller;

import com.example.Farm.entity.Farm;
import com.example.Farm.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class FarmComtroller {
    @Autowired
    private FarmService fs;
    @PostMapping("/postData")
    public Farm postData(@RequestBody Farm farm){
        return fs.postData(farm);
    }
    @GetMapping("/getDetails")
    public List<Farm> getDetails(@RequestBody Farm farm){
        return fs.getDetails();
    }
    @PutMapping("/update")
    public Farm update(@RequestBody Farm farm){
        return fs.update(farm);
    }
    public void delete(@PathVariable("id") Integer id){
        fs.delete(id);
    }

}
