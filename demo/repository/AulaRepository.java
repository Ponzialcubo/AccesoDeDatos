package com.example.demo.repository;

import com.example.demo.entity.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer> {

    Aula findByNombre(String nombre);
    
}