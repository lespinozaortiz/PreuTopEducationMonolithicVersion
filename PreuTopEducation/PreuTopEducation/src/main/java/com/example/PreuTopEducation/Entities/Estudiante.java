package com.example.PreuTopEducation.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    @Id
    @Column(name = "rut", nullable = false, unique = true)
    private Long rut;
    private String nombres;
    private String apellidos;
    private LocalDate fecha_nacimiento;
    private String tipo_colegio_proc;
    private String nombre_colegio;
    private int egreso;
    private String tipopago;
    private int arancel_estudiante;
    private int cantidad_cuotas;
    private int promedio_examen;




}
