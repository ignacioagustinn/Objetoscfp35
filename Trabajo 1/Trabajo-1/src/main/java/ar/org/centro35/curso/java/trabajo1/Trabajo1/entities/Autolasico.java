package ar.org.centro35.curso.java.trabajo1.Trabajo1.entities;

import lombok.Data;
import lombok.Getter;

@Getter

public class Autolasico extends Vehiculo {

   public Autolasico(String color, String marca, String modelo, Double precio, Radio radio) {
    
    super(color, marca, modelo, precio, radio){

        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        
        
        
    }

    
   
}
}
