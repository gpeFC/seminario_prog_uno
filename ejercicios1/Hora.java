/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 6: Programa que lea tres numeros enteros H, M, S que contienen la
 				hora, minutos y segundos respecticamente, y comprueba si la
 				hora que indican es una hora valida.
 ******************************************************************************/

import java.util.Scanner;

public class Hora{
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		int h, m, s;

		System.out.print("Ingresa las horas: ");
		h = entrada.nextInt();
		System.out.print("Ingresa los minutos: ");
		m = entrada.nextInt();
		System.out.print("Ingresa los segundos: ");
		s = entrada.nextInt();

		if((h<=23&&h>=0)&&(m<=59&&m>=0)&&(s<=59&&s>=0)){
			System.out.printf("\nLa hora " + h + ":" + m + ":" + s + " es una hora valida.\n");
		}
		else{
			System.out.printf("\nLa hora " + h + ":" + m + ":" + s + " no es una hora valida.\n");
		}

	}
}