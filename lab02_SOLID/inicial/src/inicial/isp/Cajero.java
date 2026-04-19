/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISP;

/**
 *
 * @author diego
 */
public class Cajero implements IRegistradorVentas{
    private String nombre;

    public Cajero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void registrarVenta(String producto, double monto) {
        System.out.println(nombre + " registró la venta de " + producto + " por S/ " + monto);        
    }


}
