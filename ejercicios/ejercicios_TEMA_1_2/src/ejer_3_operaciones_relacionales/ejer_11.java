package ejer_3_operaciones_relacionales;
import java.util.Scanner;
public class ejer_11 {

	public static void main(String[] args) {
		
		
		int numero1,numero2,numero3=0;
		double numeroFinal=0.0; 
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Escriba un numero");
		numero1=teclado.nextInt();
		System.out.println("Escriba un numero");
		numero2=teclado.nextInt();
		System.out.println("Escriba un numero");
		numero3=teclado.nextInt();
		
		numeroFinal=numero1*numero2*numero3;
		
		System.out.println("El resultado de su operacioón es:  " + numeroFinal);
		
		teclado.close();		

	}

}