/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author diego
 */
public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        if (precio < 0 || stock < 0){
            throw new IllegalArgumentException("Precio y stock no pueden ser negativos");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public void mostrarInfo(){
        System.out.println("Producto: " + nombre + " Precio: " + precio + " Stock: " + stock);
    }
    
    
    
}
