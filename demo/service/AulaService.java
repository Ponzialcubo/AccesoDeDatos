package com.example.demo.service;

import com.example.demo.entity.Aula;
import java.util.List;
import java.util.Optional;

public interface AulaService {

    List<Aula> findAll();

    Optional<Aula> findById(Integer id);

    Aula save(Aula aula);

    void deleteById(Integer id);
}