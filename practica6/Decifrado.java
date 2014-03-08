/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 23 / Enero / 2014
 *
 * Ejercicio 6.3 (Decifrado)
 ******************************************************************************/

import java.util.Scanner;

public class Decifrado{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int msj_p, msj_c, num, num2, tmp1, tmp2, tmp3, tmp4, aux;
		boolean continua;
		do{
			continua = false;
			System.out.println("Ingrese el numero entero cifrado de 4 digitos: ");
			msj_c = entrada.nextInt();
			if(msj_c > 9999)
				continua = true;
		}while(continua);
		if(msj_c == 0){
			msj_p = 3333;
		}
		else{
			num = msj_c;
			num2 = 0;
			aux=0;
			tmp1 = 0; tmp2 = 0; tmp3 = 0; tmp4 = 0;
			do{
				num2 = (num2*10) + (num % 10);
				System.out.printf("\nOp1:%d", num2);
				num2 -= 7;
				System.out.printf("\nOp2:%d", num2);
				num2 %= 10;
				System.out.printf("\nOp3:%d", num2);
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
			msj_p = tmp1 + tmp2*10 + tmp3*100 + tmp4*1000;
		}
		

		System.out.printf("\nMensaje decifrado: %d\n", msj_p);
	}
}