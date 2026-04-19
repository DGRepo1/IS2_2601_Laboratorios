/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        ProveedorLocal proveedor = new ProveedorLocal();
        Tienda tienda = new Tienda(proveedor);
        tienda.reabastecer("Arroz", 50);
    }
}
