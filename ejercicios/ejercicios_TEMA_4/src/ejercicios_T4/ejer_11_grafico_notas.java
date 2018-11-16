package ejercicios_T4;

import java.util.Scanner;

public class ejer_11_grafico_notas {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int cantidadNotas = 0;
		int[] notas;
		int calificacion = 0;
		int valor = 0;
		int orden = 1;
		int grafico = 0;
		int contadorSuspendido=0;
		int contadorAprobado=0;
		int contadorNotable=0;
		int contadorExcelente=0;

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

		

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
			while (notas[i] <= 4) {
				contadorSuspendido = contadorSuspendido +1;
				System.out.println("Se han encontrado "+contadorSuspendido+" suspenso**");
				kb.next();
				
			} 

		}

	}

}