package Tema_5_Modular;

import java.util.Scanner;

public class ejer_13_metodos {

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		ejer_13_metodos programa = new ejer_13_metodos();
		programa.inicio();

	}

	public void inicio() {
		menu();
		cerrar();
	}

	public void menu() {
		int opcion = 0;
		boolean estadoPro = false;

		while (estadoPro == false) {
			System.out.println("");
			System.out.println(
					"Elige una opcion:\n[1] Valor maximo de una array\n[2] Media de los valores de una array\n[3] Valor de una nota\n[4] Dias del mes\n[5] Buscar valor en un array");
			estadoPro = true;
			opcion = kb.nextInt();
		}

		switch (opcion) {
		case 1:
			maxArray(); // completado
			estadoPro = false;
			break;

		case 2:
			mediaArray(); // completado
			estadoPro = false;
			break;

		case 3:
			valorNota(); // completado
			estadoPro = false;
			break;

		case 4:
			diaMes(); // completado
			estadoPro = false;
			break;

		case 5:
			buscarValorArray();
			estadoPro = false;
			break;
		default:
			menu();
		}

	}

	public void maxArray() {
		int[] arrayA = null;
		int longitud = 0;
		System.out.println("Escriba la cantidad de valores que quiere saber");
		longitud = kb.nextInt();
		arrayA = new int[longitud];

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Escriba el valor de la posicion");
			arrayA[i] = kb.nextInt();
		}
		System.out.println("");
		System.out.println("Los valores de su array son:");

		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}

		for (int i = 0; i < arrayA.length; i++) {
			for (int j = i + 1; j < arrayA.length; j++) {
				int aux = 0;
				if (arrayA[j] > arrayA[i]) {// orden de meno a mayor, si cambias el simbolo es al reves
					aux = arrayA[j]; // aqui empieza el intercambio de nuemeros
					arrayA[j] = arrayA[i];
					arrayA[i] = aux;

				}

			}

		}
		System.out.println("");
		System.out.println("Su valor maximo es: " + arrayA[0]);
		System.out.println("");
		menu();

	}

	public void mediaArray() {
		int[] arrayB = null;
		int longitud = 0;
		System.out.println("Escriba la cantidad de valores que quiere saber");
		longitud = kb.nextInt();
		arrayB = new int[longitud];

		for (int i = 0; i < arrayB.length; i++) {
			System.out.println("Escriba el valor de la posicion");
			arrayB[i] = kb.nextInt();
		}
		System.out.println("");
		System.out.println("Los valores de su array son:");

		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i] + " ");
		}

		int total = 0;
		int media = 0;
		for (int i = 0; i < arrayB.length; i++) {// recorremos
			total = total + arrayB[i];// sumamos todos los huecos del vector
		}

		System.out.println("");

		System.out.println("La suma total del vector es: " + total);

		System.out.println("");

		media = total / longitud;// hacemos la media de la suma e todos los huecos del vector

		System.out.println("La media es " + media);
		menu();

	}

	public void valorNota() {
		int nota = 0;
		System.out.println("Escriba el valor de su nota:");
		nota = kb.nextInt();

		switch (nota) {
		case 1:
			System.out.println(nota + " es suspendido");
			break;

		case 2:
			System.out.println(nota + " es suspendido");
			break;

		case 3:
			System.out.println(nota + " es suspendido");
			break;

		case 4:
			System.out.println(nota + " es suspendido");
			break;

		case 5:
			System.out.println(nota + " es aprovado");
			break;

		case 6:
			System.out.println(nota + " es aprovado");
			break;

		case 7:
			System.out.println(nota + " es aprovado");
			break;

		case 8:
			System.out.println(nota + " es aprovado");
			break;

		case 9:
			System.out.println(nota + " es aprovado");
			break;

		case 10:
			System.out.println(nota + " es aprovado");
			break;

		default:
			valorNota();
			break;
		}
		menu();

	}

	public void diaMes() {
		String mes = "";
		System.out.println("Escriba el mes del que desea saber los dias (en minuscula)");
		mes = kb.nextLine();

		switch (mes) {
		case "enero":
			System.out.println("31 dias");
			break;

		case "febrero":
			System.out.println("28 o 29");
			break;

		case "marzo":
			System.out.println("31 dias");
			break;

		case "abril":
			System.out.println("30 dias");
			break;

		case "mayo":
			System.out.println("31 dias");
			break;

		case "junio":
			System.out.println("30 dias");
			break;

		case "julio":
			System.out.println("31 dias");
			break;

		case "agosto":
			System.out.println("31 dias");
			break;

		case "septiembre":
			System.out.println("30 dias");
			break;

		case "octubre":
			System.out.println("31 dias");
			break;

		case "noviembre":
			System.out.println("30 dias");
			break;

		case "diciembre":
			System.out.println("31 dias");
			break;

		default:
			diaMes();
			break;
		}
		menu();

	}

	public void buscarValorArray() {
		int[] arrayD = null;
		int longitud = 0;
		int busqueda = 0;
		System.out.println("Escriba la cantidad de valores que quiere saber");
		longitud = kb.nextInt();
		arrayD = new int[longitud];

		for (int i = 0; i < arrayD.length; i++) {
			System.out.println("Escriba el valor de la posicion");
			arrayD[i] = kb.nextInt();
		}
		System.out.println("");
		System.out.println("Los valores de su array son:");

		for (int i = 0; i < arrayD.length; i++) {
			System.out.print(arrayD[i] + " ");
		}
		System.out.println("");

		System.out.println("Escriba el valor que desee buscar:");
		busqueda = kb.nextInt();

		for (int i = 0; i < arrayD.length; i++) {
			if (busqueda == arrayD[i]) {
				System.out.println("numero encontrado");
			}
		}
		menu();
		
	}

	public void cerrar() {
		kb.close();
	}

}
