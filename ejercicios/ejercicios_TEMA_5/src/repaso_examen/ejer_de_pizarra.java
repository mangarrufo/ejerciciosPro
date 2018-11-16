package repaso_examen;

import java.util.Scanner;

public class ejer_de_pizarra {

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {

		ejer_de_pizarra programa = new ejer_de_pizarra();

		int[][] matriz = null;
		int columnas = 0;
		int filas = 0;

		columnas = programa.nColumnas();
		filas = programa.nFilas();

		matriz = new int[filas][columnas];

		programa.imprimirMatriz(matriz);
		programa.llenarMatriz(matriz);
		programa.cantidadNumeros(matriz);

	}

	public int nColumnas() {
		int columnas = 0;
		System.out.println("Escribe el numero de columnas que quieras");
		columnas = kb.nextInt();
		return columnas;

	}

	public int nFilas() {
		int filas = 0;
		System.out.println("Escribe el numero de filas que quieras");
		filas = kb.nextInt();
		return filas;
	}

	public void imprimirMatriz(int[][] matriz) {
		System.out.println("");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");

		}
	}

	public void llenarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Escriba el valor de la posicion");
				matriz[i][j] = kb.nextInt();
			}

		}
		System.out.println("");
		System.out.println("Asi es su matriz");
		System.out.println("");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");

			}

			System.out.println("");

		}
	}

	public void cantidadNumeros(int[][] matriz) {
		int repeticion = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j]==matriz[i][j+1]) {
					repeticion++;
					if (matriz[i][j]==matriz[i+1][j]) {
						repeticion++;
						
					}
					
				}
				
				
			}
		}
		System.out.println(repeticion);
		
	}
}
