/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 6.4 (Adivina)
 ******************************************************************************/

import java.util.Scanner;

public class Adivina{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int aleatorio;
		int numero, continua;
		boolean continuar=true;

		while(continuar){
			aleatorio = (int)(Math.random()*1000 + 1);
			do{
				System.out.println("Adivine un numero entre 1 y 1000: ");
				numero = entrada.nextInt();
				if(numero > aleatorio){
					System.out.println("Demasiado alto. Intente de nuevo.");
				}
				else if(numero < aleatorio){
					System.out.println("Demasiado bajo. Intente de nuevo.");
				}
				else{
					System.out.println("Felicidades. Adivino el numero!");
				}
			}while(numero != aleatorio);
			do{
				System.out.println("¿Desea jugar otra vez?. Para salir escriba <0>. Si desea jugar escriba <1>.");
				continua = entrada.nextInt();
				if(continua == 0){
					continuar = false;
					break;
				}
				else if(continua == 1){
					continuar =  true;
					break;
				}
			}while(true);
		}
	}
}