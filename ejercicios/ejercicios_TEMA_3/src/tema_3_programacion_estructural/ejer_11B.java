package tema_3_programacion_estructural;

import java.util.Scanner;

public class ejer_11B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		int i = 0;
		int suma = 0;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Introduzca el inervalo");
		while (!kb.hasNextInt()) {
			System.out.println("Introduzca numero entero");
			kb.next();
		}
		num = kb.nextInt();
		
		while(i <= num) {//esto seria el contador sin el %, el % especifica el resto de una division
			suma = suma+i;
			i = i + 3;
		}
		
		System.out.println("La suma es: "+suma);
		
		kb.close();
	}

}




