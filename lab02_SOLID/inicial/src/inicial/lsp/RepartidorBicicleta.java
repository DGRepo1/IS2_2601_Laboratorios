/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LSP;

/**
 *
 * @author l33211
 */
public class RepartidorBicicleta extends Repartidor{

    public RepartidorBicicleta(String nombre) {
        super(nombre);
    }

    @Override
    public void entregarPedido() {
        System.out.println(getNombre() + " está entregando el pedido en bicicleta.");
    }

    @Override
    public void recogerPedido() {
        System.out.println(getNombre() + " está recogiendo el pedido en bicicleta.");
    }

    
    
    
    
}
