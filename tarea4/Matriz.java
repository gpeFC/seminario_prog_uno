/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 24 / Febrero / 2014
 *
 * Practica: Determinante de una Matriz cuadrada de nxn.
 ******************************************************************************/

import java.util.Scanner;

public class Matriz{
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int orden, deltha, matrix[][];

		System.out.print("Indica el orden(n) de la matriz: ");
		orden = entrada.nextInt();
		matrix = creaMatriz(orden);
		deltha = obtenerDeterminante(matrix, orden);
		System.out.printf("\nDeterminante: %d\n", deltha);
		if(deltha != 0){
			obtenerMatrizInversa(matrix, orden);
		}
	}

	public static int[][] creaMatriz(int num){
		int[][] matriz = new int[num][num];
		for(int i=0;i<num;i++)
			for(int j=0;j<num;j++)
				matriz[i][j] = (int)(Math.random()*10);
		System.out.printf("\n");
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++)
				System.out.printf("%d ", matriz[i][j]);
			System.out.printf("\n");
		}
		return matriz;
	}

	public static int[][] obtenerSubMatriz(int[][] matriz, int y, int x, int num){
		int matrix[][], f, c;
		matrix = new int[num-1][num-1];
		f = 0;
		for(int i=0;i<num;i++){
			if(i != y){
				c = 0;
				for(int j=0;j<num;j++){
					if(j != x){
						matrix[f][c] = matriz[i][j];
						c++;
					}
				}
				f++;
			}
		}
		return matrix;
	}

	public static int obtenerDeterminante(int[][] matriz, int num){
		if(num == 1){
			return matriz[0][0];
		}
		else if(num == 2){
			return ((matriz[0][0]*matriz[1][1])-(matriz[0][1]*matriz[1][0]));
		}
		else{
			int determinante;
			int positivos;
			int negativos;
			int indice;
			int index;
			index = 0;
			determinante = 0;
			for(int i=0;i<num;i++){
				positivos = 1;
				negativos = 1;
				indice = 0;
				for(int j=0;j<num;j++){
					positivos = positivos * matriz[indice][(i+j)%num];
					index = i-j;
					if(index<0){
						index = index + num;
					}
					else{
						index = index % num;
					}
					negativos = negativos * matriz[indice][index];
					indice++;
				}
				determinante = determinante + positivos - negativos;
			}
			return determinante;	
		}
	}

	public static void obtenerMatrizInversa(int[][] matriz, int num){
		int adjunta[][], cofactores[][], determinante, cofactor, deltha;
		double inversa[][];
		inversa = new double[num][num];
		adjunta = new int[num][num];
		cofactores = new int[num][num];
		determinante = obtenerDeterminante(matriz, num);

		System.out.printf("\nCofactores.\n");
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				deltha = obtenerDeterminante(obtenerSubMatriz(matriz,i,j,num),num-1);
				cofactores[i][j] = ((int)(Math.pow((-1), (i+j))) * deltha);
				System.out.printf("%d ", cofactores[i][j]);
			}
			System.out.printf("\n");
		}
		System.out.printf("\nAdjunta.\n");
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				adjunta[i][j] = cofactores[j][i];
				System.out.printf("%d ", adjunta[i][j]);
			}
			System.out.printf("\n");
		}
		System.out.printf("\nInversa.\n");
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				inversa[i][j] = (adjunta[i][j]) / (double)(determinante);
				System.out.printf("%f ", inversa[i][j]);
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}
}