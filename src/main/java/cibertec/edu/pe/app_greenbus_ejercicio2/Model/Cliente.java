package cibertec.edu.pe.app_greenbus_ejercicio2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int idcliente;
    @Getter
    @Setter
    private String nomcli;
    @Getter
    @Setter
    private String dnicli;
    @Getter
    @Setter
    private String telefono;
    @Getter
    @Setter
    private int edad;
    @Getter
    @Setter
    private String DirCli;
}
