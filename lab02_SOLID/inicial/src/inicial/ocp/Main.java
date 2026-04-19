/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP;

/**
 *
 * @author l33211
 */
public class Main {
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Diego Guillen");
    Empleado empleadoPorHora = new EmpleadoPorHora("Guillen Diego");

    
    System.out.println("Salario del empleado asalariado: " + empleadoAsalariado.calcularSalario());
    System.out.println("Salario del empleado por hora: " + empleadoPorHora.calcularSalario());
    }
}
