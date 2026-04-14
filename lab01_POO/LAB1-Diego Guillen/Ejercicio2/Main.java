/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author diego
 */
public class Main {
    
    public static void main(String[] args) {
        ProductoFisico p1 = new ProductoFisico("Mouse", 50.3, 10, 0.2);
        ProductoDigital p2 = new ProductoDigital("Hamblet - ebook", 100.2, 100, "www.amazon.com/hamblet-ebook");
    
        Carrito carrito = new Carrito();
        
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.mostrarResumen();
        
    }  
}
