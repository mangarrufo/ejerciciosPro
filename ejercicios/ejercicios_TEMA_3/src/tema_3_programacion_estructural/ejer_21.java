package tema_3_programacion_estructural;

import java.util.Scanner;

public class ejer_21 {

	static final int kNUMERO_SUMA = 4;
	static final int kNUMERO_RESTA = 3;

	public static void main(String[] args) {

		int numero = 0;

		Scanner kb = new Scanner(System.in);

		System.out.println("Se va a preguntar un numero y se le sumara 4 y restara 3 hasta el valor de 100.\n");

		System.out.println("Introduzca el numero\n"); //filtro de que sea un entero
		while (!kb.hasNextInt()) {
			System.out.println("Introduzca numero entero\n");
			kb.next();
		}
		numero = kb.nextInt();
		kb.close();

		while (numero < 100) { //minetras el numero sea menor que 100
			numero = numero + kNUMERO_SUMA;//sumamnos 4
			System.out.println(numero);
			numero = numero - kNUMERO_RESTA;//restamos 3
			System.out.println(numero);
		}

	}

}
