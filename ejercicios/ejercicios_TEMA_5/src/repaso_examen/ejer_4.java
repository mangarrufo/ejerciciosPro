package repaso_examen;

import java.util.Scanner;

public class ejer_4 {
	
	static final String kARTERISCO="*";
	
	Scanner kb= new Scanner (System.in);

	public static void main(String[] args) {
		int[] array =null;
		int longitud=0;
		
		ejer_4 programa= new ejer_4();
		
		longitud=programa.dimensionarArray();
		array =new int[longitud];
		programa.llenarArray(array);
		programa.arteriscos(array);
	}
	
	public int dimensionarArray() {
		int longitud=0;
		System.out.println("Escriba la longitud del array");
		longitud=kb.nextInt();
		return longitud;	
	}
	
	public void llenarArray(int[] array) {
		int posicion=1;
		System.out.println("Vamos a rellenar el array");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Escriba el valor de la posicion ["+posicion+"]");
			array[i]=kb.nextInt();
			posicion++;
			}
		
		
	}

	public void arteriscos(int [] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i]; j++) {
				System.out.print(kARTERISCO);
			}
			System.out.println("");
		}
		
		
	}
}
