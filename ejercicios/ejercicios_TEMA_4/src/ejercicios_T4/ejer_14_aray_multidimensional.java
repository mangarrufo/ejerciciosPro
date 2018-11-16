package ejercicios_T4;

import java.util.Scanner;

public class ejer_14_aray_multidimensional {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int[][] matrizA = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 },

		};

		int[][] matrizB = new int[4][4]; // otra forma de declarar la matriz sus filas y columnas, las filas primero,
											// luego columnas, las filas es lo primero, luego columnas

		for (int i = 0; i < matrizA.length; i++) { // .lenght es vertical, con solo .lenght cojes las filas
			for (int j = 0; j < matrizA[i].length; j++) { // con [0] se cojen las columnas
				System.out.print(matrizA[i][j] + " "); // se imprime todo juntos

			}
			System.out.println(""); // saltador de columnas, cuando lee .lenght, lee una linea y saltamos a otra, se debe meter dentro del primer for, pero fuera del segundo
		}
	}

}
