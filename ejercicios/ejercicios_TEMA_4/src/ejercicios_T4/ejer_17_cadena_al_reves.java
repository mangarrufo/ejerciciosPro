package ejercicios_T4;

import java.util.Scanner;

public class ejer_17_cadena_al_reves {

	public static void main(String[] args) {

		String texto = "";
		char letras = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce una cadena de texto: ");
		texto = teclado.nextLine();
		teclado.close();

		System.out.println("------------------------------");

		for (int i = texto.length() - 1; i >= 0; i--) {

			letras = texto.charAt(i);
			System.out.print(letras);

		}
	}
}