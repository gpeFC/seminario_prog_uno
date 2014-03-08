/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 4: Programa que calcule el volumen de una esfera.
 ******************************************************************************/

import java.util.Scanner;

public class Esfera{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		float radio;

		System.out.print("Ingresa la longitud del radio de la esfera: ");
		radio = entrada.nextFloat();

		System.out.printf("\nVolumen: %.2f\n", ((4*Math.PI*Math.pow(radio, 3))/3));
	}
}