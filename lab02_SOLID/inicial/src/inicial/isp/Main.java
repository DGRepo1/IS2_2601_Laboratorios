/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ISP;

/**
 *
 * @author diego
 */
public class Main {

    public static void main(String[] args) {
        IRegistradorVentas cajero = new Cajero("Carlos");
        IGestionInventario almacenero = new Almacenero("Alvaro");
        ISupervisionOperativa supervisor = new Supervisor("Susana");

        cajero.registrarVenta("Pistola de agua P== ", 67.0);

        System.out.println();

        almacenero.actualizarInventario("Cables Ethernet Cat 6a", 322);

        System.out.println();

        supervisor.supervisarOperacion();
    }
}
