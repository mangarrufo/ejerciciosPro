package ejercicios_T4;

import java.util.Scanner; /*paquete de escribir y grabar en teclado*/

public class ejer_2_longitud {

	public static void main(String[] args) {

		int[] A = { 10, 20, 30, 40, 50 }; //la longitud es 5 pero los valores empiezan en 0, es decir de 0 a 5
		int[] B = { 50, 60, 70, 80, 90 };
		int[] C = new int[5]; // un vector de 5 posiciones //el valor por defecto de un indix es 0
		int suma = 0;

		Scanner kb = new Scanner(System.in);
		kb.close();

		suma = A[3] + B[4];
		C[1] = suma + A[0];

		System.out.println(C[2]);
		System.out.println(suma);
		System.out.println(C[1]);

		if (A.length > 5) {
			System.out.println("Error de lectura");
		} else {
			System.out.println("Esta es la longitud del vector A: " + A.length); //esto muestra la longitud del Vector

		}

	}

}
