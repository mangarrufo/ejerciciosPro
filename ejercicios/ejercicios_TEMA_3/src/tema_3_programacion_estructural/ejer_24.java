package tema_3_programacion_estructural;

import java.util.Scanner;

public class ejer_24 {

	public static void main(String[] args) {

		int numero = 0;

		Scanner kb = new Scanner(System.in);

		System.out.println("Escriba la longitud de la cadena numerica\n");
		while (!kb.hasNextInt()) {
			System.out.println("Introduzca numero entero\n");
			kb.next();
		}
		numero = kb.nextInt();
		kb.close();

		while (numero >= 1) {

			for (int n = 1; n <= numero; n++)

			{
				System.out.print(n);

			}
			numero = numero - 1;

			System.out.println("");
		}
	}

}