package repaso_examen;

import java.util.Scanner;

public class ejer_1 {

	public static void main(String[] args) {

		ejer_1 programa = new ejer_1();

		boolean comparacionAB = false;
		boolean comparacionCD = false;
		boolean comparacionEF = false;

		int[] arrayA = { 1, 2, 3 }; // primera comparacion
		int[] arrayB = { 1, 2, 3 };

		int[] arrayC = { 1, 2, 3, 4 }; // segunda comparacion
		int[] arrayD = { 1, 2, 3 };

		int[] arrayE = { 1, 2, 3 }; // tercera compracion
		int[] arrayF = { 1, 2, 2 };

		comparacionAB = programa.primeraComparacion(arrayA, arrayB); // primera comparacion
		if (comparacionAB == true) {
			System.out.println("Los vectores A y B son IGUALES");
		} else {
			System.out.println("Los vectores A y B son DISTINTOS");
		}

		System.out.println(""); // salto de linea

		comparacionCD = programa.segundaComparacion(arrayC, arrayD); // segunda comparacion
		if (comparacionCD == true) {
			System.out.println("Los vectores C y D son IGUALES");
		} else {
			System.out.println("Los vectores C y D son DISTINTOS");
		}

		System.out.println("");

		comparacionEF = programa.terceraComparacion(arrayE, arrayF);
		if (comparacionEF == true) {
			System.out.println("Los vectores E y F son IGUALES");
		} else {
			System.out.println("Los vectores E y F son DISTINTOS");
		}

	}

	public boolean primeraComparacion(int[] arrayA, int[] arrayB) {
		boolean comparacionAB = false;
		if (arrayA.length == arrayB.length) {
			for (int i = 0; i < arrayA.length; i++) {
				if (arrayA[i] == arrayB[i]) {
					comparacionAB = true;
				} else {
					comparacionAB = false;
				}

			}
		}

		return comparacionAB;

	}

	public boolean segundaComparacion(int[] arrayC, int[] arrayD) {
		boolean comparacionCD = false;
		if (arrayC.length == arrayD.length) {
			for (int i = 0; i < arrayC.length; i++) {
				if (arrayC[i] == arrayD[i]) {
					comparacionCD = true;
				} else {
					comparacionCD = false;
				}

			}
		}

		return comparacionCD;
	}

	public boolean terceraComparacion(int[] arrayE, int[] arrayF) {
		boolean comparacionEF = false;
		if (arrayE.length == arrayF.length) {
			for (int i = 0; i < arrayE.length; i++) {
				if (arrayE[i] == arrayF[i]) {
					comparacionEF = true;
				} else {
					comparacionEF = false;
				}

			}
		}

		return comparacionEF;
	}
}
