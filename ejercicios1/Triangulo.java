/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 5: Programa que calcule el area de un triangulo a partir de la
 				longitud de sus lados.
 ******************************************************************************/

import java.util.Scanner;

public class Triangulo{
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		float lado_a, lado_b, lado_c;

		System.out.print("Ingresa la longitud del lado 1: ");
		lado_a = entrada.nextFloat();
		System.out.print("Ingresa la longitud del lado 2: ");
		lado_b = entrada.nextFloat();
		System.out.print("Ingresa la longitud del lado 3: ");
		lado_c = entrada.nextFloat();

		System.out.printf("\nArea del Triangulo: %.2f\n", 
						  Math.sqrt((((lado_a+lado_b+lado_c)*(-lado_a+lado_b+lado_c)
						  *(lado_a-lado_b+lado_c)*(lado_a+lado_b-lado_c)))/16));
	}
}