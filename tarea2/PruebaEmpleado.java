/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 30 / Enero / 2014
 *
 * Ejercicio 3.14 <PruebaEmpleado>
 * (Como programar en Java, Deitel.)
 ******************************************************************************/

import java.util.Scanner;

public class PruebaEmpleado{
	public static void main(String[] args) {

		String nombre, apellido;
		double salario;

		Scanner entrada = new Scanner(System.in);

		Empleado empleado1 = new Empleado("Emanuel", "Garcia", 3000.0);
		Empleado empleado2 = new Empleado("Roberto", "Cuellar", 5000.0);
		Empleado empleado3 = new Empleado("Nuevo", "Nuevo", 0.0);

		System.out.printf("\nEmpleado: %s, Salario anual: %.2f\n", empleado1.obtenerNombreEmpleado(),
						 (12*empleado1.obtenerSalarioMensual()));
		System.out.printf("\nEmpleado: %s, Salario anual: %.2f\n", empleado2.obtenerNombreEmpleado(),
						 (12*empleado2.obtenerSalarioMensual()));

		empleado1.establecerSalarioMensual(0.10*empleado1.obtenerSalarioMensual());
		empleado2.establecerSalarioMensual(0.10*empleado2.obtenerSalarioMensual());

		System.out.printf("\nEmpleado: %s, Salario anual: %.2f\n", empleado1.obtenerNombreEmpleado(),
						 (12*empleado1.obtenerSalarioMensual()));
		System.out.printf("\nEmpleado: %s, Salario anual: %.2f\n\n", empleado2.obtenerNombreEmpleado(),
						 (12*empleado2.obtenerSalarioMensual()));

		System.out.print("Escriba el nombre de pila del empleado: ");
		nombre = entrada.nextLine();
		empleado3.establecerNombreEmpleado(nombre);
		System.out.print("Escriba el apellido del empleado: ");
		apellido = entrada.nextLine();
		empleado3.establecerApellidoEmpleado(apellido);
		System.out.print("Escriba el salario mensual del empleado: ");
		salario = entrada.nextDouble();
		empleado3.establecerSalarioMensual(salario);

		System.out.printf("\nEmpleado: %s, Salario anual: %.2f\n", empleado3.obtenerNombreEmpleado(),
						 (12*empleado3.obtenerSalarioMensual()));
	}
}