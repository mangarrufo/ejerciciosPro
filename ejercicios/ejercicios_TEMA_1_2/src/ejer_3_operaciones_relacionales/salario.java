package ejer_3_operaciones_relacionales;
import java.util.Scanner;
public class salario {

	public static void main(String[] args) {
		
		String nombre="";
		int horas;
		double precioPorHora,pagoSemanal;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Escriba su nombre");
		nombre=teclado.nextLine();
		System.out.println("Horas realizadas a la semana");
		horas=teclado.nextInt();
		System.out.println("Escriba el precio por hora");
		precioPorHora=teclado.nextDouble();
		
		pagoSemanal=horas*precioPorHora;
		
		System.out.println("Hola  " +  nombre);
		System.out.println("El pago semanal es:  "+pagoSemanal+"€");
		
		
		teclado.close();		

	}

}
