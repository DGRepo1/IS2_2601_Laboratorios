/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISP;

/**
 *
 * @author diego
 */


public class Almacenero implements IGestionInventario {
    private String nombre;

    public Almacenero(String nombre) {
        this.nombre = nombre;
    }

    
    @Override
    public void actualizarInventario(String producto, int cantidad) {
        System.out.println(nombre + " no gestiona inventario.");
        
    }

}
