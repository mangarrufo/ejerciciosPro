package tema_3_programacion_estructural;

import java.util.Scanner;

public class separar_nuemeros {

	public static void main(String[] args) {

		int numero = 0;
		int valorPosicion = 0;
		int total = 0;

		Scanner kb = new Scanner(System.in);

		System.out.println("Escribe un numero");

		numero = kb.nextInt();
		kb.close();

		while (numero != 0) {
			valorPosicion = numero % 10;
			System.out.println("el numero es: " + valorPosicion);
			kb.next();

		}

	}

}
