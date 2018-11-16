package ejercicios_T4;

import java.util.Scanner;

public class ejer_extra_repaso_2 {

	private static final int[][] matrizA = new int[4][4];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;
		boolean formulario = false;
		boolean matrizLlena = false;

		Scanner kb = new Scanner(System.in);

		while (formulario == false) {

			System.out.println("¿Que desea hacer?\n");

			System.out.println("1 = Rellenar matriz");
			System.out.println("2 = Suma filas");
			System.out.println("3 = Suma columnas");
			System.out.println("4 = Suma diagonal (principal)");
			System.out.println("4 = Suma diagonal (inversa)");
			System.out.println("5 = Media de todos los valor de la matriz");

			opcion = kb.nextInt();

			switch (opcion) {
			case 1:

				int relleno = 0;

				for (int i = 0; i < matrizA.length; i++) { // rellenamos la matriz manualmente
					for (int j = 0; j < matrizA[i].length; j++) {
						System.out.println("Introduce los valores de la matriz (valor " + relleno + ")");
						matrizA[i][j] = kb.nextInt();
						relleno++;

					}

				}

				System.out.println("");
				System.out.println("Esta es su matriz:");

				for (int i = 0; i < matrizA.length; i++) { // leemos la linea
					for (int j = 0; j < matrizA[i].length; j++) { // leemos la columna
						System.out.print(matrizA[i][j] + " "); // imprimimos la 1º linea

					}
					System.out.println(""); // con esto saltamos la siguiente linea

				}

				System.out.println("");
				matrizLlena = true;

				break;
				
			case 2: 
				if (matrizLlena==true) {
					int eleccionFila=0;
					System.out.println("¿Que fila desea sumar?\n1\n2\n3\n4");
					eleccionFila=kb.nextInt();
					
					switch (eleccionFila) {
					case 1:
						for (int i = 0; i < matrizA.length; i++) {
							for (int j = 0; j < matrizA[i].length; j++) {
								
								
							}
							
						}
						
						break;

					default:
						break;
					}
				
			}

			}

		}
	}
}
