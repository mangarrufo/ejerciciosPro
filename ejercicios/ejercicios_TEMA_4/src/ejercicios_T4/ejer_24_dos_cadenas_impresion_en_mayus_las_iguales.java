package ejercicios_T4;

import java.util.Scanner;

public class ejer_24_dos_cadenas_impresion_en_mayus_las_iguales {

	public static void main(String[] args) {

		String palabraA = "";
		String palabraB = "";

		Scanner kb = new Scanner(System.in);

		System.out.println("Escribe la PALABRA palabra:");
		palabraA = kb.nextLine();

		System.out.println("");

		System.out.println("Escribe la SEGUNDA palabra");
		palabraB = kb.nextLine();

		String[] cadena = palabraA.split(" ");
		System.out.println("La longitud del vector de la primera plabra es: " + cadena.length);

		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i].compareTo(palabraB) == 0) { //hay que gualar a 0 para filtrar //comparar strings
				System.out.println(cadena[i].toUpperCase());

			} else {
				System.out.print(cadena[i] +" ");
			}

		}
		
		kb.close();

	}

}
