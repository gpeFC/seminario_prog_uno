/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 2.25 (Como programar en Java, Deitel.)
 ******************************************************************************/

import java.util.Scanner;

public class Paridad{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int num;

		System.out.print("Escribe un entero: ");
		num = entrada.nextInt();

		if((num%2)==0){
			System.out.printf("\nEl numero %d es par.\n", num);
		}
		else{
			System.out.printf("\nEl numero %d es impar.\n", num);
		}

	}
}