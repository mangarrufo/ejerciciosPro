package ejercicios_T4;

import java.util.Scanner;

public class ejer_22_ordenar_array_strings {

	private static final int kDIMENSION = 5;

	public static void main(String[] args) {

		String[] vector = new String[kDIMENSION];
		String palabra = "";
		String auxiliar = "";
		int comparacion = 0;

		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < vector.length; i++) {
			System.out.println("Escirba la palabra");
			palabra = kb.nextLine();
			vector[i] = palabra; // se asigna asi

		}

		System.out.println("Se van a imprimir por pantalla sus palabras:\n");

		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");

		}
		
		System.out.println("");
		System.out.println("Se va imprimeir ordenado\n");

		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length - 1; j++) {
				comparacion = vector[i].compareTo(vector[j + 1]);
				if (comparacion > 0) {
					auxiliar = vector[i];
					vector[i] = vector[j + 1];
					vector[j + 1] = auxiliar;

				}

			}

			System.out.print(vector[i] + " ");
		}

		kb.close();

	}

}
