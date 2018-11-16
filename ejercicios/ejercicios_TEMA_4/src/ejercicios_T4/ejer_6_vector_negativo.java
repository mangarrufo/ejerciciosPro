package ejercicios_T4;

import java.util.Scanner;

public class ejer_6_vector_negativo {

	public static final int kNUM_VALORES = 10;

	public static void main(String[] args) {

		int[] vector = new int[kNUM_VALORES]; // aunque vaya de de 0 a 9, tiene 10 posiciones
		int valor = 0;

		Scanner kb = new Scanner(System.in);

		System.out.println("Escribe " + kNUM_VALORES + " enteros. Puedes hacerlo en diferentes lineas");

		int numValoresLeidos = 0;

		while (numValoresLeidos < kNUM_VALORES && valor != -1) { // rellenamos vector con filtro
			if (kb.hasNext()) {
				valor = kb.nextInt();
				System.out.println("Posicion " + numValoresLeidos + " leido " + valor);
				if (valor != -1) {
					vector[numValoresLeidos] = valor;
				}

				numValoresLeidos++;
			}

			else {
				kb.next();
			}

		}
		kb.close();

		System.out.println("Ya se han leido " + numValoresLeidos + " valores");

		for (int i = 0; i < vector.length; i++) { // impresion de vector/array
			System.out.print(vector[i] + " ");
		}

	}

}