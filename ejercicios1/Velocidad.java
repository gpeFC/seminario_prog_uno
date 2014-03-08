/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 2: Programa que pase una velocidad en Km/h a m/s. La velocidad se
 				lee por teclado.
 ******************************************************************************/

import java.util.Scanner;

public class Velocidad{
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float velk, velm;

		System.out.print("Ingresa la velocidad en km/h: ");
		velk = entrada.nextFloat();

		velm = (velk/3600)*1000;

		System.out.printf("\n%.2fKm/h  <==>  %.2fm/s\n", velk, velm);
	}
}