package ejercicios_T4;

import java.util.Scanner;

public class ejer_extra_repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vectorA = null;
		int[] vectorB = null;
		int longitudVector = 0;
		int numeroTerminacion = 0;

		Scanner kb = new Scanner(System.in);

		System.out.println("Escirbe longitud vector");
		longitudVector = kb.nextInt();

		vectorA = new int[longitudVector];
		vectorB = new int[longitudVector];

		System.out.println("El vector mide " + vectorA.length);
		System.out.println("");

		for (int i = 0; i < vectorA.length; i++) {
			vectorA[i] = (int) (Math.random() * 300 + 1); // rellenamos el vector con numeros aleatrios hasta 300
			System.out.print(vectorA[i] + " ");

		}

		for (int i = 0; i < vectorA.length; i++) { // recorremos el vectror A
			vectorB[i] = vectorA[i]; // asiganimo el valor de A a B

		}

		System.out.println("");
		System.out.println("Escribe la terminacion de los numeros que quieras ver");
		numeroTerminacion = kb.nextInt();

		for (int i = 0; i < vectorB.length; i++) {
			if (vectorB[i] % 10 == numeroTerminacion) {
				System.out.print(vectorB[i] + " ");
			}

		}
		kb.close();

	}

}
