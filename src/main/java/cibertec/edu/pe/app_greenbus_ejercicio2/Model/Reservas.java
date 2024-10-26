package cibertec.edu.pe.app_greenbus_ejercicio2.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int idRes;
    @Getter
    @Setter
    private int NroRes;
    @Getter
    @Setter
    private String metodopago;
    @ManyToOne
    @JoinColumn (name="idcliente", nullable = false)
    @Getter
    @Setter
    private Cliente cliente;
    @ManyToOne
    @JoinColumn (name="idbus", nullable = false)
    @Getter
    @Setter
    private Bus bus;

}
