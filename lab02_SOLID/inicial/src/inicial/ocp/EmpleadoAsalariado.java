/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP;

/**
 *
 * @author l33211
 */
public class EmpleadoAsalariado extends Empleado{

    public EmpleadoAsalariado(String tipoEmpleado) {
        super(tipoEmpleado);
    }
    
    
    @Override
    public double calcularSalario() {
        return 5000;
    }
    
}
