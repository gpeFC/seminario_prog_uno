/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 6.1 (Palindromo)
 ******************************************************************************/

import java.util.Scanner;

public class Palindromo{
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num, num2, original;
		boolean continua;

		do{
			continua = false;
			System.out.println("Ingrese un numero entero de 5 digitos: ");
			original = entrada.nextInt();
			if(original < 10000 || original > 99999)
				continua = true;
		}while(continua);
		num = original;
		num2 = 0;
		do{
			num2 = (num2*10) + (num % 10);
			num = (int)(num/10);
		}while(num != 0);

		if(original == num2){
			System.out.printf("\nEl numero %d es palindromo...\n", original);
		}
		else{
			System.out.printf("\nEl numero %d no es palindromo...\n", original);
		}
	}
}