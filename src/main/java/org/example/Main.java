package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creamos un HashSet para almacenar productos y evitar duplicados automáticamente[cite: 23]
        Set<Producto> productosSet = new HashSet<>();

        Producto p1 = new Producto("A001", "Notebook", 1200.0);
        Producto p2 = new Producto("A002", "Mouse", 25.5);
        // Producto con el mismo código ("A001"), por lo que hashCode() y equals() lo detectarán como duplicado[cite: 23]
        Producto p3 = new Producto("A001", "Notebook Gamer", 1500.0);

        // Agregamos los productos al HashSet[cite: 23]
        productosSet.add(p1);
        productosSet.add(p2);
        productosSet.add(p3); // Este duplicado será descartado automáticamente por el HashSet

        System.out.println("--- Productos en el HashSet ---");
        for (Producto p : productosSet) {
            System.out.println(p);
        }

        System.out.println("\nTotal de elementos en el conjunto: " + productosSet.size());
    }
}