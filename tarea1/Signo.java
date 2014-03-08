/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 2.32 (Como programar en Java, Deitel.)
 ******************************************************************************/

import java.util.Scanner;

public class Signo{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int num1, num2, num3, num4, num5, pos, neg, ceros;

		pos = neg = ceros = 0;

		System.out.print("Escriba el primer entero: ");
		num1 = entrada.nextInt();
		if(num1==0){
			ceros++;
		}
		else{
			if(num1<0){
				neg++;
			}
			else{
				pos++;
			}
		}
		System.out.print("Escriba el segundo entero: ");
		num2 = entrada.nextInt();
		if(num2==0){
			ceros++;
		}
		else{
			if(num2<0){
				neg++;
			}
			else{
				pos++;
			}
		}
		System.out.print("Escriba el tercer entero: ");
		num3 = entrada.nextInt();
		if(num3==0){
			ceros++;
		}
		else{
			if(num3<0){
				neg++;
			}
			else{
				pos++;
			}
		}
		System.out.print("Escriba el cuarto entero: ");
		num4 = entrada.nextInt();
		if(num4==0){
			ceros++;
		}
		else{
			if(num4<0){
				neg++;
			}
			else{
				pos++;
			}
		}
		System.out.print("Escriba el quinto entero: ");
		num5 = entrada.nextInt();
		if(num5==0){
			ceros++;
		}
		else{
			if(num5<0){
				neg++;
			}
			else{
				pos++;
			}
		}

		System.out.printf("\nTotal/Positivos: %d", pos);
		System.out.printf("\nTotal/Ceros: %d", ceros);
		System.out.printf("\nTotal/Negativos: %d\n", neg);
	}
}