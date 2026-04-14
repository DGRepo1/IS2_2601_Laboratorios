/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Carrito {
    private ArrayList<Producto> productos = new ArrayList<>();
 
    public void agregarProducto(Producto prod){
        if(prod.getStock() > 0){
            productos.add(prod);
            prod.restaStock();
        }else{
            System.out.println("No hay stock disponible");
        }
    }
    
    
    public void mostrarResumen(){
        double total = 0;
        
        System.out.println(" Resumen total:");
        
        for(Producto p: productos){
            p.mostrarInfo();
            total += p.getPrecio();
        }
        System.out.println("------------------");
        System.out.println("Total: " + total);
    }
    
}
