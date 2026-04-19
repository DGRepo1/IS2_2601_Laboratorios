/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP;

/**
 *
 * @author l33211
 */
public class EmpleadoPorHora extends Empleado {

    public EmpleadoPorHora(String tipoEmpleado) {
        super(tipoEmpleado);
    }

    @Override
    public double calcularSalario() {
        return 20*40;
    }
    
}
