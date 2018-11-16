package tema_3_programacion_estructural;

import java.util.Scanner;

public class ejer_23_factorial {

	public static void main(String[] args) {

		int numero = 0;
		int operacion = 0;

		Scanner kb = new Scanner(System.in);

		System.out.println("Escriba el numero del que desea el factorial\n");
		while (!kb.hasNextInt()) {
			System.out.println("Introduzca numero entero\n");
			kb.next();
		}
		numero = kb.nextInt();
		kb.close();
		operacion = numero;

		for (int i = operacion - 1; i > 0; i--)

		{
			operacion = operacion * i;

		}

		System.out.println("El factorial de " + numero + " es " + operacion);

	}

}
