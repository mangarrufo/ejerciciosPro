package ejercicios_T4;

import java.util.Scanner;

public class ejer_20_buscar_en_string {

	public static void main(String[] args) {

		String texto = "";
		char busqueda = '/'; // declaracion de char
		boolean comprobacion = false;

		Scanner kb = new Scanner(System.in);

		System.out.println("Introduzca una frase");
		texto = kb.nextLine();

		System.out.println("Introduzca el caracter que quieres buscar");
		busqueda = kb.next().charAt(0); // leer un char

		if (texto.indexOf(busqueda) != -1) {
			System.out.println(texto.indexOf(busqueda)); //busca la primera coincidencia
			System.out.println(texto.lastIndexOf(busqueda)); //busca la ultima coincidencia

		} else {
			System.out.println("No hay coincidencia");
		}

	}

}
