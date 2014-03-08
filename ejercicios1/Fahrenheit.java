/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 1: Programa que lea una cantidad de grados centigrados y la pase
 				a grados Fahrenheit. Formula: F = 32 + (9 * C / 5)
 ******************************************************************************/

import java.util.Scanner;

public class Fahrenheit{
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float celsius, fahr;

		System.out.print("Ingresa una temperatura en grados Celsius: ");
		celsius = entrada.nextFloat();

		fahr = 32 + (9*(celsius/5));

		System.out.printf("\nCelsius: %f <==> Fahrenheit: %f.\n", celsius, fahr);
	}
}