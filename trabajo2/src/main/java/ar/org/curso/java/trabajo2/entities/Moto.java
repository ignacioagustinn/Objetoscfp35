package ar.org.curso.java.trabajo2.entities;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);  
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
     public String toString() {
        return String.format("Marca: %s // Modelo: %s // Cilindrada: %dc // Precio: $%,.2f",
               getMarca(), getModelo(), cilindrada, getPrecio());
    }
}