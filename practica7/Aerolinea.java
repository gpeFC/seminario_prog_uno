/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 20 / Febrero / 2014
 *
 * Ejercicio 7.19 (Aerolinea)
 ******************************************************************************/

import java.util.Scanner;

public class Aerolinea{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int contador = 10;
		int seccion;
		int asiento;
		boolean[] asientos = new boolean[10];

		for(int i=0;i<10;i++)
			asientos[i] = false;

		do{
			System.out.printf("\nBienvenido al sistema de reservaciones.\n");
			System.out.printf("\nPor favor escriba 1 para Primera Clase.\nPor favor escriba 2 para Economico.\n");
			seccion = entrada.nextInt();
			if(seccion == 1){
				if(asientoDisponible(asientos, 0, 5)){
					asiento = asignaAsiento(asientos, 0, 5);
					contador -= 1;
					imprimePase(asiento);
				}
				else{
					System.out.printf("\nLa seccion de Primera Clase esta llena. ¿Desea ser puesto en la seccion Economico?\n");
					System.out.printf("\n1)SI\n2)NO\n");
					seccion = entrada.nextInt();
					if(seccion == 1){
						asiento = asignaAsiento(asientos, 5, 10);
						contador -= 1;
						imprimePase(asiento);
					}
					else{
						System.out.printf("\nEl proximo vuelo sale en 3 horas.\n");
					}
				}
			}
			else if(seccion == 2){
				if(asientoDisponible(asientos, 5, 10)){
					asiento = asignaAsiento(asientos, 5, 10);
					contador -= 1;
					imprimePase(asiento);
				}
				else{
					System.out.printf("\nLa seccion Economico esta llena. ¿Desea ser puesto en la seccion de Primera Clase?\n");
					System.out.printf("\n1)SI\n2)NO\n");
					seccion = entrada.nextInt();
					if(seccion == 1){
						asiento = asignaAsiento(asientos, 0, 5);
						contador -= 1;
						imprimePase(asiento);
					}
					else{
						System.out.printf("\nEl proximo vuelo sale en 3 horas.\n");
					}
				}
			}
		}while(contador > 0);
		System.out.printf("\nVuelo completo. El proximo vuelo sale en 3 horas.\n");
	}

	public static boolean asientoDisponible(boolean[] arreglo, int min, int max){
		for(int i=min;i<max;i++)
			if(arreglo[i] == false)
				return true;
		return false;
	}

	public static int asignaAsiento(boolean[] arreglo, int min, int max){
		int i;
		for(i=min;i<max;i++)
			if(arreglo[i] == false){
				arreglo[i] = true;
				break;
			}
		return i;
	}

	public static void imprimePase(int num){
		if(num>=0 && num<5){
			System.out.printf("\nPASE DE ABORDAR.\nAsiento: %d.\nSeccion: PRIMERA CLASE\n.", num+1);
		}
		else{
			System.out.printf("\nPASE DE ABORDAR.\nAsiento: %d.\nSeccion: ECONOMICO\n.", num+1);
		}
	}
}