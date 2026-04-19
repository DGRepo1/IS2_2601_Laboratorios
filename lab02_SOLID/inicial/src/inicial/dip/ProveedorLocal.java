/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP;

/**
 *
 * @author diego
 */
public class ProveedorLocal implements IProveedor{

    @Override
    public void abastecerProducto(String producto, int cantidad) {
        System.out.println("Proveedor local abasteció " + cantidad + " unidades de " + producto);
    }
    
}
