/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 3: Programa que lea la longitud de los catetos de un triangulo 
 				rectangulo y calcule la longitud de la hipotenusa segun el 
 				Teorema de Pitagoras.
 ******************************************************************************/

import java.util.Scanner;

public class Pitagoras{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		float cat1, cat2, hip;

		System.out.print("Ingresa la longitud del cateto 1: ");
		cat1 = entrada.nextFloat();
		System.out.print("Ingresa la longitud del cateto 2: ");
		cat2 = entrada.nextFloat();

		System.out.printf("\nHipotenusa: %.2f\n", Math.sqrt((Math.pow(cat1, 2))+Math.pow(cat2, 2)));
	}
}