/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 2.28 (Como programar en Java, Deitel.)
 ******************************************************************************/

import java.util.Scanner;

public class Circulo{
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int radio;

		System.out.print("Escribe el radio del circulo: ");
		radio = entrada.nextInt();

		System.out.printf("\nDiametro del circulo: %d", (2*radio));
		System.out.printf("\nCircunferencia del circulo: %f", (2*Math.PI*radio));
		System.out.printf("\nArea del circulo: %f\n", (radio*radio*Math.PI));
	}
}