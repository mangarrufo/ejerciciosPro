package tema_3_programacion_estructural;

import java.util.Scanner; /*paquete de escribir y grabar en teclado*/

public class ejer_4 {
	/* Aqui se declaras las estaticas */
	public static void main(String[] args) {

		float nota = 0.0F;

		Scanner teclado = new Scanner(System.in); /* declarar este valor */

		System.out.println("Introduzca su nota");
		nota = teclado.nextFloat();

		if (nota > 10 || nota < 0) { /*Asi se establece el rango*/
			System.out.println("Su calificación no es valida");
		} else if (nota >= 9) {
			System.out.println("Su calificación es EXCELENTE");
		} else if (nota >= 6.5) {
			System.out.println("Su calificación es NOTABLE");
		} else if (nota >= 5) {
			System.out.println("Su calificación es APROBADO");
		} else {
			System.out.println("Su calificación es SUSTENDIDO");
		}
		teclado.close();
	}

}

/*
 * En el codigo los decimales se expresan con un "." pero a la hora de arrancar
 * se especifica en ","
 */
