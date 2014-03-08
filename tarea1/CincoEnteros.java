/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 2.24 (Como programar en Java, Deitel.)
 ******************************************************************************/

import java.util.Scanner;

public class CincoEnteros{
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num1, num2, num3, num4, num5, menor, mayor;

		System.out.print("Escriba el primer entero: ");
		num1 = entrada.nextInt();
		menor = num1;
		mayor = num1;
		System.out.print("Escriba el segundo entero: ");
		num2 = entrada.nextInt();
		if(num2 < menor)
			menor = num2;
		if(num2 > mayor)
			mayor = num2;
		System.out.print("Escriba el tercer entero: ");
		num3 = entrada.nextInt();
		if(num3 < menor)
			menor = num3;
		if(num3 > mayor)
			mayor = num3;
		System.out.print("Escriba el cuarto entero: ");
		num4 = entrada.nextInt();
		if(num4 < menor)
			menor = num4;
		if(num4 > mayor)
			mayor = num4;
		System.out.print("Escriba el quinto entero: ");
		num5 = entrada.nextInt();
		if(num5 < menor)
			menor = num5;
		if(num5 > mayor)
			mayor = num5;

		System.out.printf("\nMenor: %d", menor);
		System.out.printf("\nMayor: %d\n", mayor);
	}
}