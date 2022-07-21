package application;

import java.util.Scanner;

public class Soma_Acima_diagonal_principal {

	/*
	 * Ler um inteiro N (máximo = 10) e uma matriz quadrada de ordem N contendo
	 * números inteiros. Mostrar a soma dos elementos acima da diagonal principal.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n,somaAcima;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] matriz = new int [n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i,j);
				matriz[i][j]= sc.nextInt();
			}
		}
		
		somaAcima= 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if (i < j) {
					somaAcima = somaAcima +matriz[i][j];
					
				}
				
			}
		}
		
		System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL= %d\n",somaAcima);

		sc.close();

	}

}

