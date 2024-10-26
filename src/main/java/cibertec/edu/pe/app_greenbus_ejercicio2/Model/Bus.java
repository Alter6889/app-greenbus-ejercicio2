package cibertec.edu.pe.app_greenbus_ejercicio2.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int idbus;
    @Getter
    @Setter
    private String empresa;
    @Getter
    @Setter
    private int calificacion;
    @Getter
    @Setter
    private String Destino;
    @Getter
    @Setter
    private String Inicio;
    @Getter
    @Setter
    private String fecviaje;
    @Getter
    @Setter
    private double Precio;

    @OneToMany(mappedBy = "Bus")
    @Getter
    @Setter
    private Set<Reservas> reservas;
}
