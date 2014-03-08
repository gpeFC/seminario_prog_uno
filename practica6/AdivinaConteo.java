/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 6.5 (AdivinaConteo)
 ******************************************************************************/

import java.util.Scanner;

public class AdivinaConteo{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int aleatorio, intentos;
		int numero, continua;
		boolean continuar=true;

		while(continuar){
			intentos = 0;
			aleatorio = (int)(Math.random()*1000 + 1);
			do{
				System.out.println("Adivine un numero entre 1 y 1000: ");
				numero = entrada.nextInt();
				if(numero > aleatorio){
					System.out.println("Demasiado alto. Intente de nuevo.");
					intentos++;
				}
				else if(numero < aleatorio){
					System.out.println("Demasiado bajo. Intente de nuevo.");
					intentos++;
				}
				else{
					System.out.println("Felicidades. Adivino el numero!");
					intentos++;
				}
			}while(numero != aleatorio);
			do{
				if(intentos == 10){
					System.out.println("Aja!. Sabia usted el secreto!.");
				}
				else if(intentos < 10){
					System.out.println("Ya sabia usted el secreto o tuvo suerte!.");
				}
				else{
					System.out.println("Deberia haberlo hecho mejor!.");
				}
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