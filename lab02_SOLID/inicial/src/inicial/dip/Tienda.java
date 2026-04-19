/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP;

/**
 *
 * @author diego
 */
public class Tienda {
    private ProveedorLocal proveedor;

    public Tienda(ProveedorLocal proveedor) {
        this.proveedor = proveedor;
    }


    public void reabastecer(String producto, int cantidad) {
        proveedor.abastecerProducto(producto, cantidad);
    }
}
