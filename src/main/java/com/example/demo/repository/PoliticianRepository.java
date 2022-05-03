package com.example.demo.repository;

import com.example.demo.model.Politician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoliticianRepository extends JpaRepository<Politician,Integer> {
}
