package ejercicios_T4;

import java.util.Scanner;

public class ejer_15_llenar_matriz_con_su_posicion {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int[][] matrizA;
		int filas = 0;
		int columnas = 0;

		System.out.println("Introduce cuantas filas");
		while (!kb.hasNextInt()) {
			System.out.println("Error, introduce un entero");
			kb.next();
		}
		filas = kb.nextInt();

		while (filas < 1) {
			System.out.println("Introduce un valor mayor que cero");
			while (!kb.hasNextInt()) {
				System.out.println("Error, introduce un entero");
				kb.next();
			}
			filas = kb.nextInt();
		}

		System.out.println("Introduce cuantas columnas");
		while (!kb.hasNextInt()) {
			System.out.println("Error, introduce un entero");
			kb.next();
		}
		columnas = kb.nextInt();

		while (columnas < 1) {
			System.out.println("Introduce un valor mayor que cero:");
			while (!kb.hasNextInt()) {
				System.out.println("Error, introduce un entero");
				kb.next();
			}
			columnas = kb.nextInt();
		}

		System.out.println("La matriz tiene " + filas + " filas y " + columnas + " columnas\n");
		kb.close();

		matrizA = new int[filas][columnas];// asiganamos el numero de filas y columnas

		System.out.println("El resultado de la matriz es el siguiente:\n");

		for (int i = 0; i < matrizA.length; i++) { //leemos la linea
			for (int j = 0; j < matrizA[i].length; j++) { //leemos la columna
				matrizA[i][j] = i + j; //sumamos las posiciones, lo que hace que se rellene
				System.out.print(matrizA[i][j] + " "); //imprimimos la 1º linea

			}
			System.out.println(""); //con esto saltamos la siguiente linea
		}

	}
}
