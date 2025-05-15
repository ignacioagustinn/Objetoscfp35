package ar.org.centro35.curso.java.trabajo1.Trabajo1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class Vehiculo {protected String color;
    protected String marca ;
    protected String modelo;
    protected Double precio;
    private Radio radio ;

    public Vehiculo(String color, String marca, String modelo, Double precio , Radio radio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.radio = radio;
    }

}
