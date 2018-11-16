package tema_3_programacion_estructural;

import java.util.Scanner;

public class ejer_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dividendo = 0;//establecemos lo que vamos a utilizar
		int divisor = 0;
		int cociente = 0;
		int resto = 0;

		Scanner kb = new Scanner(System.in);

		System.out.print("Introduzca dividendo\n");
		while (!kb.hasNextInt()) {
			System.out.println("Error, introduzca un entero\n");
			kb.next();
		}
		dividendo = kb.nextInt();

		System.out.print("Introduzca divisor\n");
		while (!kb.hasNextInt()) {
			System.out.println("Error, introduzca un entero\n");
			kb.next();
		}
		divisor = kb.nextInt();

		cociente = dividendo / divisor;
		resto = (cociente * divisor) - dividendo;

		System.out.println("El resto es: " + resto);

		kb.close();
	}

}
