package com.udea.apifestivos.entities;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "festivo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")


public class Festivo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "dia")
    private int dia;

    @Column(name = "mes")
    private int mes;

    @Column(name = "diaspascua")
    private int diasPascua;
    
    @ManyToOne
    @JoinColumn(name = "idtipo", referencedColumnName = "id")
    private Tipo tipo;

    @Transient 
    private Date fecha;

    public Festivo(String nombre, int dia, int mes, int diasPascua, Tipo tipo) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.diasPascua = diasPascua;
        this.tipo = tipo;
    }
    

}



