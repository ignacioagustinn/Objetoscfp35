package ar.org.curso.java.trabajo2.entities;

public class Auto extends Vehiculo {

    private int puertas;

    public Auto(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);  
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s // Modelo: %s // Puertas: %d // Precio: $%,.2f",
                getMarca(), getModelo(), puertas, getPrecio());
    }
}