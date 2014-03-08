/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 7: Programa que lea un numero entero e imprima todos los numeros
 				impares menores que el.
 ******************************************************************************/

import java.util.Scanner;

public class Impares{
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		int num;

		System.out.print("Ingresa un numero entero: ");
		num = entrada.nextInt();

		for(int i=1;i<num;i+=2)
			System.out.printf("\n%d", i);
		System.out.printf("\n");
	}
}