/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 03 / Marzo / 2014
 *
 * Practica: Complejos(Complejos)
 ******************************************************************************/

public class Complejos{

	private double parteReal;
	private double parteImaginaria;

	public Complejos(double real, double imaginaria){
		parteReal = real;
		parteImaginaria = imaginaria;
	}

	public Complejos(){
		parteReal = 0;
		parteImaginaria = 0;
	}

	public void establecerReal(double real){
		parteReal = real;
	}
	public void establecerImaginaria(double imaginaria){
		parteImaginaria = imaginaria;
	}

	public double obtenerReal(){
		return parteReal;
	}
	public double obtenerImaginaria(){
		return parteImaginaria;
	}

	public void sumaComplejos(Complejos complejo1, Complejos complejo2){
		parteReal = complejo1.obtenerReal() + complejo2.obtenerReal();
		parteImaginaria = complejo1.obtenerImaginaria() + complejo2.obtenerImaginaria();
	}

	public void restaComplejos(Complejos complejo1, Complejos complejo2){
		parteReal = complejo2.obtenerReal() - complejo1.obtenerReal();
		parteImaginaria = complejo2.obtenerImaginaria() - complejo1.obtenerImaginaria();
	}

	public void productoComplejos(Complejos complejo1, Complejos complejo2){
		parteReal = (complejo1.obtenerReal()*complejo2.obtenerReal()) - (complejo1.obtenerImaginaria()*complejo2.obtenerImaginaria());
		parteImaginaria = (complejo1.obtenerReal()*complejo2.obtenerImaginaria()) + (complejo2.obtenerReal()*complejo1.obtenerImaginaria());
	}
	
	public void divisionComplejos(Complejos complejo1, Complejos complejo2){
		parteReal =((complejo1.obtenerReal()*complejo2.obtenerReal())+(complejo1.obtenerImaginaria()*complejo2.obtenerImaginaria()))/((Math.pow(complejo2.obtenerReal(), 2))+(Math.pow(complejo2.obtenerImaginaria(), 2)));
		parteImaginaria = (((complejo1.obtenerImaginaria()*complejo2.obtenerReal())-(complejo1.obtenerReal()*complejo2.obtenerImaginaria()))/((Math.pow(complejo2.obtenerReal(), 2))+(Math.pow(complejo2.obtenerImaginaria(), 2))));
	}

	public void imprimirComplejos(int num){
		System.out.printf("\nComplejo[%d]: (%.3f , %.3fi)", num, obtenerReal(), obtenerImaginaria());
	}
}