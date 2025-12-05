package com.example.demo.entity;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name= "aula")

public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Schema(accessMode = Schema.accessMode.READ_ONLY)
    private Integer id;

    // añadir mínimo 3 atributos (ejemplo: nombre, capacidad, edificio)
    @Column(nullable = false, lenght = 100)
    private String nombre;

    @Column(nullable = false, lenght = 10)
    private int capacidad;
  
    @Column(length = 50)
    private String edificio;

    public Aula() {
    }

    public Aula(String nombre, int capacidad, String edificio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.edificio = edificio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }
}
