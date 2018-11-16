package Tema_5_Modular;

import java.util.Scanner;

/* ejercicio 1
 * @author Raúl
 * @version BETA
 */

public class ejer_3 {

	private int[] vector = null; // como esta variables se va a utilizar siempre, se declara aqui
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		ejer_3 programa = new ejer_3(); // aqui decclaramos el nombre del ejercicio
		programa.inicio(); // aqui ejecutamos el inicio
	}

	public void inicio() {
		dimensionarVector();
		rellenarVector(); // ejecutamos el rellenar
		imprimirVector(); // ejecutamos el imprimir
		vectorOrdenado();
		cerrar();

	}

	public void dimensionarVector() {
		int longitud = 0;

		System.out.println("Escriba la longitud del vector");
		longitud = kb.nextInt();
		vector = new int[longitud];

	}

	public void rellenarVector() { // aqui declaramos para rellenarlo

		int entero = 0;
		int ordenRelleno = 1;

		for (int i = 0; i < vector.length; i++) {
			System.out.println("Escribe un valor (" + ordenRelleno + ")");
			entero = kb.nextInt();
			vector[i] = entero;
			ordenRelleno++;

		}

	}

	public void imprimirVector() { // aqui para imprimirlo

		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");

		}

	}

	public void vectorOrdenado() {

		int aux = 0;

		System.out.println("");
		for (int i = 0; i < vector.length; i++) {
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[j] < vector[i]) {// orden de meno a mayor, si cambias el simbolo es al reves
					aux = vector[j]; // aqui empieza el intercambio de nuemeros
					vector[j] = vector[i];
					vector[i] = aux;

				}

			}

		}

		for (int i = 0; i < vector.length; i++) {// imprimimos numeros ordenados
			System.out.print(vector[i] + " ");

		}

	}

	public void cerrar() {
		kb.close();
	}
}
