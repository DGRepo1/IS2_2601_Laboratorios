/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author diego
 */
public class ProductoFisico extends Producto {
    
    private double peso;

    public ProductoFisico(String nombre, double precio, int stock, double peso) {
        super(nombre, precio, stock);
        this.peso = peso;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " Precio: " + precio + " Stock: " + stock + " Peso: " + peso + "kg");
    }
    
    
    
    
}
