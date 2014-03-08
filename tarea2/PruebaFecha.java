/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 30 / Enero / 2014
 *
 * Ejercicio 3.15 <PruebaFecha>
 * (Como programar en Java, Deitel.)
 ******************************************************************************/

import java.util.Scanner;

public class PruebaFecha{
	public static void main(String[] args) {

		int mes, dia, anio;

		Scanner entrada = new Scanner(System.in);

		Fecha fecha1 = new Fecha(3, 12, 2014);
		Fecha fecha2 = new Fecha(0, 0, 0);

		System.out.printf("\nFecha1:");
		fecha1.mostrarFecha();

		System.out.print("Escriba el mes(indicado por el numero de mes): ");
		mes = entrada.nextInt();
		fecha2.establecerMes(mes);
		System.out.print("Escriba el dia(indicado por el numero de dia): ");
		dia = entrada.nextInt();
		fecha2.establecerDia(dia);
		System.out.print("Escriba el año(indicado por el numero de año): ");
		anio = entrada.nextInt();
		fecha2.establecerAnio(anio);

		System.out.printf("\nFecha2: %d / %d / %d \n", fecha2.obtenerMes(), fecha2.obtenerDia(),
						  fecha2.obtenerAnio());
	}
}