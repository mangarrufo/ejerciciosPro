package ejercicios_T4;

import java.util.Scanner;

public class ejer_12_rellenar_vector_con_otro {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		kb.close();

		int[] A = { 5, 4, 6, 5, 8, 7, 9, 3, 2, 15 };
		int[] B = new int[10];

		for (int i = 0; i < A.length; i++) { // recorremos el vectror A
			B[i] = A[i]; //asiganimo el valor de A a B

		}

		for (int j = 0; j < B.length; j++) { // imprimimos el B
			System.out.print(B[j] + " ");

		}
	}

}