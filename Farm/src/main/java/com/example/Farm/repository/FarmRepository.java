package com.example.Farm.repository;

import com.example.Farm.entity.Farm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmRepository extends JpaRepository<Farm,Integer> {
}
