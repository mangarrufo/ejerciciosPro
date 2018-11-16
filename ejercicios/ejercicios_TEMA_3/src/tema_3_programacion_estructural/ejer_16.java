package tema_3_programacion_estructural;

import java.util.Scanner;

public class ejer_16 {

	public static void main(String[] args) {

		int numero = 0;
		Scanner kb = new Scanner(System.in);

		do {
			System.out.println("Introduce numero entero");
			while (!kb.hasNextInt()) {
				System.out.println("No es un numero entero: ");
				kb.next();
			}
			numero = kb.nextInt();
		} while (numero < 0 || numero > 10);

		System.out.println("Has acertado");
		kb.close();

	}

}
