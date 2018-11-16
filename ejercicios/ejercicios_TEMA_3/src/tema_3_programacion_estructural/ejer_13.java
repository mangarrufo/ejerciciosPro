package tema_3_programacion_estructural;

import java.util.Scanner; /*paquete de escribir y grabar en teclado*/

public class ejer_13 {

	static final int kCODIGO_SECRETO = 952;

	public static void main(String[] args) {

		int intento = 0;

		Scanner kb = new Scanner(System.in); /* declarar este valor */

		System.out.print("Introduzca su apuesta\n");
		while (!kb.hasNextInt()) {
			System.out.println("Error, introduzca un entero\n");
			kb.next();
		}

		intento = kb.nextInt();

		while (intento != kCODIGO_SECRETO) {
			System.out.print("Numero incorrecto, vuelva a probar\n");
			while (!kb.hasNextInt()) {
				System.out.println("Error, introduzca un entero\n");
				kb.next();
			}

			intento = kb.nextInt();

		}

		System.out.print("Numero correcto\n");

		kb.close();

	}

}