package ar.org.curso.java.trabajo2.test;
import ar.org.curso.java.trabajo2.entities.Auto;
import ar.org.curso.java.trabajo2.entities.Moto;
import ar.org.curso.java.trabajo2.entities.Vehiculo;


import java.util.ArrayList;
import java.util.List;



public class TestVehiculo {

    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<>();

         vehiculos.add (new Auto("Peugeot", "206", 200000, 4));
         vehiculos.add (new Moto("Honda", "Titan", 60000, 125));
         vehiculos.add (new Auto("Peugeot", "208", 250000, 5));
         vehiculos.add (new Moto("Yamaha", "Ybr", 80500, 160));

        

          vehiculos.stream().forEach(System.out::println);

         System.out.println("-------------------------------------");

         System.out.println("El vehiculo mas caro es: " +
                vehiculos.stream()
                        .max((v1, v2) -> Double.compare(v1.getPrecio(), v2.getPrecio()))
                        .orElse(null));
                 /*vehiculos.stream()
                 .filter(v -> v.getPrecio() > 210000)
                 .forEach(System.out::println);*/
                 System.out.println("el vehiculo mas barato es: " +
                            vehiculos.stream()
                             .min((v1, v2) -> Double.compare(v1.getPrecio(), v2.getPrecio()))
                             .orElse(null));
                 System.out.println("el vehiculo que contiene en el modelo la letra y " +
                          vehiculos.stream()
                         .filter(v -> v.getModelo().toLowerCase().contains("y"))
                         .findFirst().orElse(null));
            
                                  
                         
        
                 System.out.println("-------------------------------------");
         
                 System.out.println("Vehiculos ordenados por precio de mayor a menor: ");
                         vehiculos.stream()
                         .sorted((v1, v2) -> Double.compare(v2.getPrecio(), v1.getPrecio()))
                         .forEach(System.out::println);
            
                    System.out.println("-------------------------------------");
                    vehiculos.stream()
                              .filter(v -> v.getModelo().equalsIgnoreCase("Titan"))
                              .forEach(System.out::println);
                 
        

        
        
    }

}
