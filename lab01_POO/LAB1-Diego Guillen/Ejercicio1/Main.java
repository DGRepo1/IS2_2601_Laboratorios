

package Ejercicio1;

/**
 *
 * @author diego
 */
public class Main {

    public static void main(String[] args) {
        Producto prod1 = new Producto("latop", 1500.4, 2);
        Producto prod2 = new Producto("Cargador", 45.2, 4);
   
        prod1.mostrarInfo();
        prod2.mostrarInfo();
    }
}
