/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LSP;

/**
 *
 * @author l33211
 */
public class Main {
    public static void main(String[] args) {
        RepartidorMoto repartidorMoto = new RepartidorMoto("Carlos");
        Repartidor repartidorBici = new RepartidorBicicleta("Lucía");

        repartidorMoto.recogerPedido();
        repartidorMoto.entregarPedido();
        repartidorMoto.repostarCombustible();

        System.out.println();

        repartidorBici.recogerPedido();
        repartidorBici.entregarPedido();
    }
 
}
