package tema_3_programacion_estructural;

import java.util.Scanner;

public class ejer_filtro_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2, posicion, posicion2, contador = 0, reset = 0;
		boolean v0 = false, v1 = false, v2 = false, v3 = false, v4 = false, v5 = false, v6 = false, v7 = false,
				v8 = false, v9 = false;
		String numRepetido = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Introdúceme dos números y te diré cuántos digitos son iguales");

		// Comprobación de entero 1
		while (!sc.hasNextInt()) {
			System.out.println("Por favor, introduce un entero");
			sc.next();
		}
		numero1 = sc.nextInt();

		System.out.println("Tu primer número es: " + numero1 + ", gracias.");

		// Comprobación de entero 2
		while (!sc.hasNextInt()) {
			System.out.println("Por favor, introduce un entero");
			sc.next();
		}
		numero2 = sc.nextInt();
		sc.close();
		System.out.println("Tu segundo número es: " + numero2 + ", gracias.");
		System.out.println();

		reset = numero2;// Para cuando se vuelva a comprobar el otro número en
						// el segundo while, al
		// estar descompuesto que vuelva a ser el original

		// Inicio algoritmo
		while (numero1 != 0) {
			posicion = numero1 % 10;
			while (numero2 != 0) {
				posicion2 = numero2 % 10;
				if (posicion == posicion2) {// Si el número de posicion1 se ha
											// encontrado en el otro número, es
											// decir,
					// hay un dígito repetido.
					if (posicion == 0 && v0 == false) {// Se comprueba si el
														// valor que se ha
														// repetido ya se ha
														// añadido
						// antes, si es así se desprecia.
						v0 = true;
						contador++;

					} else if (posicion == 1 && v1 == false) {
						v1 = true;
						contador++;

					} else if (posicion == 2 && v2 == false) {
						v2 = true;
						contador++;

					} else if (posicion == 3 && v3 == false) {
						v3 = true;
						contador++;

					} else if (posicion == 4 && v4 == false) {
						v4 = true;
						contador++;

					} else if (posicion == 5 && v5 == false) {
						v5 = true;
						contador++;

					} else if (posicion == 6 && v6 == false) {
						v6 = true;
						contador++;

					} else if (posicion == 7 && v7 == false) {
						v7 = true;
						contador++;

					} else if (posicion == 8 && v8 == false) {
						v8 = true;
						contador++;

					} else if (posicion == 9 && v9 == false) {
						v9 = true;
						contador++;

					}

				}
				numero2 = numero2 / 10;
			} // fin 2ª while
			numero2 = reset;
			numero1 /= 10;

		} // Fin primer while. Fin bucle(s)

		// Para mostrar el sout en singular o plural.
		if (contador == 1) {
			System.out.println("Se ha encontrado un número igual");
		} else {
			System.out.println("Se han encontrado " + contador + " números iguales");
		}

	}
}