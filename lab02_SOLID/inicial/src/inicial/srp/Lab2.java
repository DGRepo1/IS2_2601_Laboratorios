/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package SRP;

/**
 *
 * @author l33211
 */
public class Lab2 {

    public static void main(String[] args) {
        Informe informe = new Informe("Rendimiento trimestral");
        informe.generarInforme();
        
        ServicioCorreo correo = new ServicioCorreo();
        correo.enviarCorreo(informe);
    }
}
