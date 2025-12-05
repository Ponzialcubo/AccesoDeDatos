package com.example.demo.entity;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Schema(accessMode = Schema.accessMode.READ_ONLY)
    private Integer id;

    // añadir mínimo 3 atributos (ejemplo: fecha, horaInicio, horaFin, aulaId)
    // TODO: constructor con parámetros

    @Column(nullable = false, length = 20)
    private LocalDate fecha;

    @Column(nullable = false) 
    private LocalTime horaInicio;

    @Column
    private LocalTime horaFin;

    @Column(name = "aula_id", nullable = false)
    private Integer aulaId;

    public Reserva() {
    }

    public Reserva(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, Integer aulaId) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.aulaId = aulaId;
    }

    public LocalDate getFecha () {
        return fecha;
    }

    public void setFecha (LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio () {
        return horaInicio;
    }

    public void setHoraInicio (LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraInicio () {
        return horaInicio;
    }

    public void setHoraFin (LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public int getAulaId () {
        return aulaId;
    }

    public void setAulaId (int aulaId) {
        this.aulaId = aulaId;
    }
}
