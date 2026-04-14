/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author diego
 */
public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(String nombre, double precio, int stock) {
        
        if (precio < 0 || stock < 0){
            throw new IllegalArgumentException("Precio y stock deben ser positivos");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public abstract void mostrarInfo();
    
    public double getPrecio(){
        return precio;
    }
    
    public int getStock(){
        return stock;
    }
    
    public void restaStock(){
        stock--;
    }
    
}
