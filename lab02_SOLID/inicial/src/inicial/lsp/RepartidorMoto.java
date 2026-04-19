/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LSP;

/**
 *
 * @author l33211
 */
public class RepartidorMoto extends Repartidor implements IUsaCombustible {

    public RepartidorMoto(String nombre) {
        super(nombre);
    }

    @Override
    public void entregarPedido() {
        System.out.println(getNombre() + " está entregando el pedido en moto.");
    }

    @Override
    public void recogerPedido() {
        System.out.println(getNombre() + " está recogiendo el pedido en moto.");
    }

    @Override
    public void repostarCombustible() {
        System.out.println(getNombre() + " está repostando combustible para la moto.");
    }
    
    
}
