/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 30 / Enero / 2014
 *
 * Ejercicio 3.15 <Fecha>
 * (Como programar en Java, Deitel.)
 ******************************************************************************/

public class Fecha{
	private int mes;
	private int dia;
	private int anio;

	public Fecha(int mes, int dia, int anio){
		this.mes = mes;
		this.dia = dia;
		this.anio = anio;
	}

	public void establecerMes(int mes){
		this.mes = mes;
	}
	public int obtenerMes(){
		return mes;
	}

	public void establecerDia(int dia){
		this.dia = dia;
	}
	public int obtenerDia(){
		return dia;
	}

	public void establecerAnio(int anio){
		this.anio = anio;
	}
	public int obtenerAnio(){
		return anio;
	}

	public void mostrarFecha(){
		System.out.printf("\nFecha: %d / %d / %d\n", mes, dia, anio);
	}
}