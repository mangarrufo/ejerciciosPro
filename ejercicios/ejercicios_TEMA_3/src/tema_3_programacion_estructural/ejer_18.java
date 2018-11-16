package tema_3_programacion_estructural;

import java.util.Scanner; //paquete de escribir y grabar en teclado

public class ejer_18 {

	public static void main(String[] args) { // despues de public static se pone las variables

		int numeroA = 0;
		int resultado = 0;

		Scanner kb = new Scanner(System.in); // declarar este valor

		System.out.println("Escriba el numero del que desea ver la tabla");

		while (!kb.hasNextInt()) {
			System.out.println("Numero incorrecto, indroduzca un entero");
			kb.next();// esto hace que no se repita el error sin parar
		}

		numeroA = kb.nextInt();

		for (int i = 0; i <= 10; i++) {

			resultado = numeroA * i;
			System.out.println(numeroA+"x"+i+"="+resultado);
		}

		kb.close();
		
	}

}
