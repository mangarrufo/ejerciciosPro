package tema_3_programacion_estructural;

import java.util.Scanner; //paquete de escribir y grabar en teclado

public class ejer_6 {

	public static void main(String[] args) { // despues de public static se pone las variables

		int valorUno = 0;
		int valorDos = 0;
		int opcion = 0;
		int operacion = 0;

		Scanner teclado = new Scanner(System.in); // declarar este valor

		System.out.println("Escriba un valor entero");// Declaramos el primer while
		while (!teclado.hasNextInt()) {
			System.out.println("Numero incorrecto, indroduzca de nuevo");
			teclado.next();//esto hace que no se repita el error sin parar
		}
		valorUno = teclado.nextInt();// terminamos de declararlo

		System.out.println("Escriba el segundo valor entero");// Declaramos el segundo while
		while (!teclado.hasNextInt()) {
			System.out.println("Numero incorrecto, indroduzca de nuevo");
			teclado.next();
		}
		valorDos = teclado.nextInt();

		System.out.println("Operacion deseada:\n 1 - Suma\n 2 - Resta\n 3 - Multiplicacion\n 4 - Division ");
		opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			operacion = valorUno + valorDos;
			break;
		case 2:
			operacion = valorUno - valorDos;
			break;
		case 3:
			operacion = valorUno * valorDos;
			break;
		case 4:
			operacion = valorUno / valorDos;
			break;
		default:
			System.out.println("Operacion erronea");
			break;
		}

		System.out.println("El resultado es: " + operacion);

		teclado.close();

	}

}