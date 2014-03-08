/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 2.17 (Como programar en Java, Deitel.)
 ******************************************************************************/

import java.util.Scanner;

public class TresEnteros{
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		int num1, num2, num3, menor, mayor;
		// Suma, Promedio, Producto, Menor y Mayor.

		System.out.print("Escriba el primer entero: ");
		num1 = entrada.nextInt();
		System.out.print("Escriba el segundo entero: ");
		num2 = entrada.nextInt();
		System.out.print("Escriba el tercer entero: ");
		num3 = entrada.nextInt();

		menor = num1;
		if(num2 < num1){
			menor = num2;
			if(num3 < num2)
				menor = num3;
		}
		else{
			if(num3 < num1)
				menor = num3;
		}
		mayor = num1;
		if(num2 > num1){
			mayor = num2;
			if(num3 > num2)
				mayor = num3;
		}
		else{
			if(num3 > num1)
				mayor = num3;
		}

		System.out.printf("\nSuma: %d\n", (num1+num2+num3));
		System.out.printf("Producto: %d\n", (num1*num2*num3));
		System.out.printf("Promedio: %d\n", (int)((num1+num2+num3)/3));
		System.out.printf("Menor: %d\n", menor);
		System.out.printf("Mayor: %d\n", mayor);
	}
}