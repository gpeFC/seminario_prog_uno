/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 30 / Enero / 2014
 *
 * Ejercicio 3.14 <Empleado>
 * (Como programar en Java, Deitel.)
 ******************************************************************************/

public class Empleado{

	private String nombreEmpleado;
	private String apellidoEmpleado;
	private double salarioMensual;

	public Empleado(String nombre, String apellido, double salario){
		nombreEmpleado = nombre;
		apellidoEmpleado = apellido;
		if(salario < 0.0){
			salarioMensual = 0.0;
		}
		else{
			salarioMensual = salario;
		}
	}

	public void establecerNombreEmpleado(String nombre){
		nombreEmpleado = nombre;
	}
	public String obtenerNombreEmpleado(){
		return nombreEmpleado;
	}

	public void establecerApellidoEmpleado(String apellido){
		apellidoEmpleado = apellido;
	}
	public String obtenerApellidoEmpleado(){
		return apellidoEmpleado;
	}

	public void establecerSalarioMensual(double salario){
		salarioMensual = salarioMensual + salario;
	}
	public double obtenerSalarioMensual(){
		return salarioMensual;
	}
}