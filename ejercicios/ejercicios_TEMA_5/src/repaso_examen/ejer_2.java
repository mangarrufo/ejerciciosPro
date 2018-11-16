package repaso_examen;

public class ejer_2 {

	public static void main(String[] args) {

		int[][] matrizA = { { 1, 2, 3, 4 }, { 1, 2, 4, 3 }, { 3, 4, 2, 1 } };
		int[][] matrizB = new int[matrizA[0].length][matrizA.length];


		for (int i = 0; i < matrizA.length; i++) { // imprimir matriz
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");

			}
			System.out.println("");
		}

		System.out.println("");


		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizB[i][j] = matrizA[j][i];

			}

		}

		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.print(matrizB[i][j] + " ");

			}
			System.out.println();

		}

	}

}
