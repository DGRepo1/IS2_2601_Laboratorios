/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISP;

/**
 *
 * @author diego
 */
public class Supervisor implements ISupervisionOperativa {
    private String nombre;

    public Supervisor(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void supervisarOperacion() {
        System.out.println(nombre + " está supervisando la operación de la tienda. :D");
    }
    
}
