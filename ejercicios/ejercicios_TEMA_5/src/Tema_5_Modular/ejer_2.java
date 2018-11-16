package Tema_5_Modular;

import java.util.Scanner;

/* ejercicio 1
 * @author Raúl
 * @version BETA
 */

public class ejer_2 {

	private int[] vector = new int[10]; // como esta variables se va a utilizar siempre, se declara aqui

	public static void main(String[] args) {
		ejer_2 programa = new ejer_2(); // aqui decclaramos el nombre del ejercicio
		programa.inicio(); // aqui ejecutamos el inicio
	}

	public void inicio() {
		rellenarVector(); // ejecutamos el rellenar
		imprimirVector(); // ejecutamos el imprimir
		vectorOrdenado();
	}

	public void rellenarVector() { // aqui declaramos para rellenarlo

		int entero = 0;

		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < vector.length; i++) {
			System.out.println("Escribe un valor");
			entero = kb.nextInt();
			vector[i] = entero;

		}

		kb.close();

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
}