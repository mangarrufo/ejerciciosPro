package ejercicios_T4;

import java.util.Scanner;

public class ejer_19_intrucir_palabras_mostrar_longitud {

	private static final int kDIMENSION = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] vector = new String[kDIMENSION];
		String palabra = "";

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < kDIMENSION; i++) {
			System.out.println("Introduce la palabra " + (i + 1) + ":");
			palabra = sc.nextLine();
			vector[i] = palabra;
		}

		for (int i = 0; i < kDIMENSION; i++) {
			System.out.println("La palabra " + vector[i] + " posee " + vector[i].length() + " letra/s");
		}

		sc.close();

	}

}