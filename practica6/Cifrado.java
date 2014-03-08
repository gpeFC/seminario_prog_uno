/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 6.3 (Cifrado)
 ******************************************************************************/

import java.util.Scanner;

public class Cifrado{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int msj_p, msj_c, num, num2, tmp1, tmp2, tmp3, tmp4, aux;
		boolean continua;
		do{
			continua = false;
			System.out.println("Ingrese un numero entero de 4 digitos: ");
			msj_p = entrada.nextInt();
			if(msj_p < 1000 || msj_p > 9999)
				continua = true;
		}while(continua);
		num = msj_p;
		num2 = 0;
		aux=0;
		tmp1 = 0; tmp2 = 0; tmp3 = 0; tmp4 = 0;
		do{
			num2 = (num2*10) + (num % 10);
			num2 += 7;
			num2 %= 10;
			num = (int)(num/10);
			if(aux==0){
				tmp1 = num2;
				System.out.printf("\n%d", num2);
			}
			else if(aux==1){
				tmp2 = num2;
				System.out.printf("\n%d", num2);
			}
			else if(aux==2){
				tmp3 = num2;
				System.out.printf("\n%d", num2);
			}
			else if(aux==3){
				tmp4 = num2;
				System.out.printf("\n%d", num2);
			}
			aux++;
		}while(num != 0);
		aux = tmp1;
		tmp1 = tmp3;
		tmp3 = aux;
		aux = tmp2;
		tmp2 = tmp4;
		tmp4 = aux;
		msj_c = tmp1 + tmp2*10 + tmp3*100 + tmp4*1000;

		System.out.printf("\nMensaje cifrado: %d\n", msj_c);
	}
}