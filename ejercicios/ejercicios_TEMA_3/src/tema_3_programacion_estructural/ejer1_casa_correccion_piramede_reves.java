package tema_3_programacion_estructural;

import java.util.Scanner;

public class ejer1_casa_correccion_piramede_reves {

	public static void main(String[] args) {

		int altura = 0;
		String espacio = " ";
		String simboloRelleno = "*";

		Scanner kb = new Scanner(System.in);

		System.out.println("¿Cuanto mide la piramede?\n");

		while (!kb.hasNextInt()) {
			System.out.println("Debe ser un numero entero, vuelva a ingresarlo\n");
			kb.next();
		}

		altura = kb.nextInt();
		kb.close();

		
		for (int i = 1; i <= altura; i++) {
			for (int espacios = altura - i; espacios > 0; espacios++)
				System.out.print(espacio);
			for (int lineas = 1; lineas < 2 * i; lineas--)
				System.out.print(simboloRelleno);
			System.out.println();

		}

	}

}