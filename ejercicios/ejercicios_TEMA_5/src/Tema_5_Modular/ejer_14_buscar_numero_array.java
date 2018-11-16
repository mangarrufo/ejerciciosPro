package Tema_5_Modular;

import java.util.Scanner;

public class ejer_14_buscar_numero_array {

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arrayA;
		int numero=0;
	
		ejer_14_buscar_numero_array programa = new ejer_14_buscar_numero_array();
		
		arrayA = new int[programa.dimensionarArray()];
		programa.valoresArray(arrayA);
		
		System.out.println("");
		System.out.println("Los valores de su array son:");

		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		
		System.out.println("");
		numero=programa.solicitarNumero();
		System.out.println("");
		System.out.println("Su numero a buscar es: "+numero);
		programa.buscarNumero(arrayA,numero);
		programa.cerrar();
		
	}

	public int dimensionarArray() { // dimesinamos  el array
		
		int longitud = 0;
		
		System.out.println("Escriba la cantidad de valores que quiere saber");
		longitud = kb.nextInt();
		return longitud;
}
	
	public void valoresArray(int[] arrayA) { //rellenamos el array
		int posicion = 1;
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Escriba el valor de la posicion [" + posicion + "]");
			arrayA[i] = kb.nextInt();
			posicion++;
		}
	}

	public int solicitarNumero () { //decimos el numero que queremos buscar
		int numero=0;
		System.out.println("Escriba el numero desea buscar");
		numero=kb.nextInt();
		return numero;
		
		
	}
	
	public void buscarNumero(int[] arrayA,int numero) { //aqui los buscamos
		int busqueda=0;
		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i]==numero) {
				busqueda ++;
				}
		}
		System.out.println("El numero "+numero+" se ha encontrado "+busqueda+" veces");
	}
	
	public void cerrar () { //cerrar teclado
		kb.close();
	}
}
