package tema_3_programacion_estructural;

import java.util.Scanner;

public class ejer_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0; // rango de numero en los que queremos buscar los multiplos de 3
		int suma = 0;
		Scanner kb = new Scanner(System.in);

		System.out.print("Introduzca el inervalo\n");
		while (!kb.hasNextInt()) {
			System.out.println("Introduzca numero entero\n");
			kb.next();
		}
		num = kb.nextInt();

		for (int i = 0; i <= num; i++) {
			if (i % 3 == 0)
				suma = suma + i;
		}

		System.out.println("La suma es: " + suma);

		kb.close();
	}

}
