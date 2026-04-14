/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author diego
 */
public class ProductoDigital extends Producto{
    
    private String urlDescarga;

    public ProductoDigital(String nombre, double precio, int stock, String urlDescarga) {
        super(nombre, precio, stock);
        this.urlDescarga = urlDescarga;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " Precio: " + precio + " Stock: " + stock + " URL:" + urlDescarga);
    }
    
}
