package repaso_examen;

import java.util.Scanner;

public class ejer_3 {

	public static void main(String[] args) {
		
		ejer_3 programa= new ejer_3();

		int[] arrayA = null;
		int longitudA = 0;
		int posicionA = 1;

		int[] arrayB = null;
		int longitudB = 0;
		int posicionB=1;

		int[] arrayFinal = null;

		Scanner kb = new Scanner(System.in);

		System.out.println("Escriba longitud del arrayA:");
		longitudA = kb.nextInt();
		arrayA = new int[longitudA];

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Escriba el valor de la posicion [" + posicionA + "]");
			arrayA[i] = kb.nextInt();
			posicionA++;
			}
		
		System.out.println("");
		System.out.println("arrayA dimensionado y escrito, ahora el B");
		System.out.println("");
		
		System.out.println("Escriba longitud del arrayB:");
		longitudB = kb.nextInt();
		arrayB = new int[longitudB];

		for (int i = 0; i < arrayB.length; i++) {
			System.out.println("Escriba el valor de la posicion [" + posicionB + "]");
			arrayB[i] = kb.nextInt();
			posicionB++;
			}
		
		System.out.println("");
		System.out.println("arrayA y arrayB dimensionados y escritos");
		System.out.println("");
		
		System.out.println("Este es el arrayA:");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i]+" ");
			}
		
		System.out.println("");
		System.out.println("Este es el arrayB:");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i]+" ");
			}
		programa.multiplicacion(arrayA,arrayB,arrayFinal);
		System.out.println("");
		}
	
	public void multiplicacion(int [] arrayA, int[] arrayB, int[] arrayFinal) {
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				 arrayFinal[i]=arrayA[i]*arrayB[i];
					
				
				
			}
			
		}
		System.out.println("Este es el arrayFinal:");
		for (int i = 0; i < arrayFinal.length; i++) {
			System.out.println(arrayFinal[i]+" ");
			
		}
		
		
		
		
		
		
		
		
		
	}
}
