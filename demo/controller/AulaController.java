package com.example.demo.controller;

import com.example.demo.entity.Aula;
import com.example.demo.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aulas")
public class AulaController {

    @Autowired 
    private AulaService aulaService;

    // Devolver todas las aulas
    @GetMapping
    public List<Aula> getAll() {
        return aulaService.findAll();
    }

    // Devolver una Aula
    @GetMapping("/{id}")
    public Aula getOne(@PathVariable Integer id) {
        return aulaService.findById(id);
    }

    // Crear un aula
    @PostMapping
    public Aula create(@RequestBody Aula aula) {
        return aulaService.save(aula);
    }

    // Actualizar un aula
    @PutMapping("/{id}")
    public Aula update(@PathVariable Integer id, @RequestBody Aula aula) {
        aula.setId(id);
        return aulaService.save(aula);
    }

    // Eliminar un aula
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        aulaService.deleteById(id);
    }
}