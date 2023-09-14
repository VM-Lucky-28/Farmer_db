package com.example.Farm.service;

import com.example.Farm.entity.Farm;

import java.util.List;

public interface FarmService {
    public Farm postData(Farm farm);
    public List<Farm> getDetails();
    public Farm update(Farm farm);
    public void delete(Integer id);
}
