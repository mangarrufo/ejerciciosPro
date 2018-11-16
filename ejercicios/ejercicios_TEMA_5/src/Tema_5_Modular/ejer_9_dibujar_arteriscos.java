package Tema_5_Modular;

import java.util.Scanner;

public class ejer_9_dibujar_arteriscos {


	private final static String kARTERISCOS="*";
	
	 Scanner kb =new Scanner (System.in);
	
	
	public static void main(String[] args) {
		ejer_9_dibujar_arteriscos programa = new ejer_9_dibujar_arteriscos(); 
		programa.inicio();
}
	
	public void inicio() {
		int numArt =0;
		System.out.println("Escriba el numero de arteriscos que desea:");
		numArt=kb.nextInt();
		imprimir_arteriscos(numArt);
		cerrar();
	}
	

	

	public void imprimir_arteriscos(int numArt){
		System.out.println("");
		for (int i = 0; i < numArt; i++) {
			System.out.print(kARTERISCOS);	
		}
	}
	
	
	public void cerrar() {
		kb.close();
	}
}
