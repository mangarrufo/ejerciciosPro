package ejercicios_T4;

import java.util.Scanner;

public class ejer_18_minus_a_mayus {

	public static void main(String[] args) {

		String texto = "";
		char letras = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce una cadena de texto: ");
		texto = teclado.nextLine();
		teclado.close();

		System.out.println("--------------------------------");

		texto = texto.toUpperCase();

		for (int i = 0; i < texto.length(); i++) {

			letras = texto.charAt(i);
			System.out.print(letras);
		}
		System.out.println();
	}

}