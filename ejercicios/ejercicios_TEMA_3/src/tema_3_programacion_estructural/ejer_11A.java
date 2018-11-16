package tema_3_programacion_estructural;

import java.util.Scanner;

public class ejer_11A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0; // rango de numero en los que queremos buscar los multiplos de 3
		int i = 0; // contador, por defecto empezamos en 0, para que el contador inicie ahi
		int suma = 0;
		Scanner kb = new Scanner(System.in);

		System.out.print("Introduzca el inervalo");
		while (!kb.hasNextInt()) {
			System.out.println("Introduzca numero entero");
			kb.next();
		}
		num = kb.nextInt();

		while (i <= num) {
			if (i % 3 == 0)
				suma = suma + i;
			i++;
		}

		System.out.println("La suma es: " + suma);

		kb.close();
	}

}