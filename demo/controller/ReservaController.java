package com.example.demo.controller;

import com.example.demo.entity.Reserva;
import com.example.demo.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    // Obtener todas
    @GetMapping
    public List<Reserva> getAll() {
        return reservaService.findAll();
    }

    // Obtener por Id
    @GetMapping("/{id}")
    public Reserva getById(@PathVariable Integer id) {
        return reservaService.findById(id);
    }

    // Guardar
    @PostMapping
    public Reserva create(@RequestBody Reserva reserva) {
        return reservaService.save(reserva);
    }

    // Modificar
    @PutMapping("/{id}")
    public Reserva update(@PathVariable Integer id, @RequestBody Reserva reserva) {
        reserva.setId(id);
        return reservaService.save(reserva);
    }

    // Borrar
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        reservaService.deleteById(id);
    }
}