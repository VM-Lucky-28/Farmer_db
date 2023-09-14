package com.example.Farm.service;

import com.example.Farm.entity.Farm;
import com.example.Farm.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmServiceImpl implements FarmService {
    @Autowired
    private FarmRepository frs;

    @Override
    public Farm postData(Farm farm) {
        return frs.save(farm);
    }

    @Override
    public List<Farm> getDetails() {
        return frs.findAll();
    }

    @Override
    public Farm update(Farm farm) {
        return frs.save(farm);
    }

    @Override
    public void delete(Integer id) {
        frs.deleteById(id);

    }
}
