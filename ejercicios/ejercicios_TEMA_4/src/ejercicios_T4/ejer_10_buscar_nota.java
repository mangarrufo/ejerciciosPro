
package ejercicios_T4;

import java.util.Scanner;

public class ejer_10_buscar_nota {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int cantidadNotas = 0;
		int[] notas;
		int calificacion = 0;
		int valor = 0;
		int orden = 1;
		int busquedaNota = 0;
		boolean encontrado = false;

		System.out.println("Introduzca la cantidad de notas que desea saber\n");// vector dimensionado
		while (!kb.hasNextInt()) {
			System.out.println("Un numero entero, por favor\n");
			kb.next();
		}

		cantidadNotas = kb.nextInt();
		notas = new int[cantidadNotas];

		System.out.println("Introduzca el valor de las notas\n");
		while (valor < notas.length) { // rellenamos vector con filtro

			while (!kb.hasNextInt()) {
				System.out.println("Un numero entero, por favor\n");
				kb.next();
			}
			if (kb.hasNext()) {
				calificacion = kb.nextInt();
				System.out.println("La nota " + orden + " tiene un calificacion de " + calificacion);
				notas[valor] = calificacion;
				orden++;
				valor++;
			}

			else {
				kb.next();
			}

		}

		for (int i = 0; i < notas.length; i++) { // impresion de vector/array
			System.out.print("Su nota es: " + notas[i] + " \n");
		}

		System.out.println("Introduzca en vaor de la nota que desea buscar\n");
		while (!kb.hasNextInt()) {
			System.out.println("Un numero entero, por favor\n");
			kb.next();
		}
		busquedaNota = kb.nextInt();

		for (int i = 0; i < notas.length && encontrado == false; i++) {
			if (busquedaNota == notas[i]) {
				System.out.println("Se a encontrado la coincidencia " + busquedaNota + " en el vector");
				encontrado = true;// booleano hace que no se repita, esto es un semaforo
			} else {
				System.out.println("numero no encontrado");
			}

		}

	}

}