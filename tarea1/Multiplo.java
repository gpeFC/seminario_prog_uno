/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 2.26 (Como programar en Java, Deitel.)
 ******************************************************************************/

import java.util.Scanner;

public class Multiplo{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int num1, num2;

		System.out.print("Escribe el primer entero: ");
		num1 = entrada.nextInt();
		System.out.print("Escribe el segundo entero: ");
		num2 = entrada.nextInt();

		if((num1%num2)==0){
			System.out.printf("\nEl numero %d es multiplo del numero %d.\n", num1, num2);
		}
		else{
			System.out.printf("\nEl numero %d no es multiplo del numero %d.\n", num1, num2);
		}
	}
}