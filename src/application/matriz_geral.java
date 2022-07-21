package application;

import java.util.Locale;
import java.util.Scanner;

public class matriz_geral {
	/*
	 * Ler uma matriz quadrada de ordem N (máximo = 10), contendo números reais. Em
	 * seguida, fazer as seguintes ações: a) calcular e imprimir a soma de todos os
	 * elementos positivos da matriz. b) fazer a leitura do índice de uma linha da
	 * matriz e, daí, imprimir todos os elementos desta linha. c) fazer a leitura do
	 * índice de uma coluna da matriz e, daí, imprimir todos os elementos desta
	 * coluna. d) imprimir os elementos da diagonal principal da matriz. e) alterar
	 * a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida
	 * imprimir a matriz alterada.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, indlinha, indcoluna;
		double somaPositivos;

		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();

		double[][] matriz = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]:", i, j);
				matriz[i][j] = sc.nextDouble();

			}
		}

		somaPositivos = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] > 0) {
					somaPositivos = somaPositivos + matriz[i][j];

				}

			}
		}

		System.out.printf("\nSOMA DOS POSITIVOS:%.1f\n\n", somaPositivos);

		System.out.print("Escolha uma linha:");
		indlinha = sc.nextInt();

		System.out.print("LINHA ESCOLHIDA:");

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f", matriz[indlinha][i]);
		}

		System.out.printf("\n\n Escolha uma coluna:");
		indcoluna = sc.nextInt();

		System.out.print("COLUNA ESCOLHIDA: ");

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f", matriz[i][indcoluna]);
		}
		System.out.printf("\n\nDiagonal PRINCIPAL:");

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f", matriz[i][i]);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					matriz[i][j] = Math.pow(matriz[i][j], 2);
				}
			}
		}

		System.out.println("\n\nMATRIZ ALTERADA: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%.1f", matriz[i][j]);

			}
			System.out.println();
		}

		sc.close();
	}

}
