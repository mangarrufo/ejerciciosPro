package ejercicios_T4;

import java.util.Scanner;

public class ejer_18_con_ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "";
		char letra = '\0';

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la palabra o frase:");
		cadena = sc.nextLine();

		for (int i = 0; i < cadena.length(); i++) {
			letra = cadena.charAt(i);
			if (cadena.charAt(i) >= 'a' && cadena.charAt(i) <= 'z') {
				letra = (char) (cadena.charAt(i) - 32); // Usando la tabla de codificación ASCII
			}
			System.out.print(letra);

		}

		sc.close();
	}

}
