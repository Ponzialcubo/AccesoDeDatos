package com.example.demo.service;

import com.example.demo.entity.Reserva;
import java.util.List;
import java.util.Optional;

public interface ReservaService {

    List<Reserva> findAll();

    Optional<Reserva> findById(Integer id);

    Reserva save(Reserva reserva);

    void deleteById(Integer id);
}