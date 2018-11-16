package tema_3_programacion_estructural;
import java.util.Scanner; /*paquete de escribir y grabar en teclado*/
public class ejer_1 {

	public static void main(String[] args) {
		
		double producto=0.0;
		double descuento=0.0;
		
		Scanner teclado=new Scanner(System.in); /*declarar este valor*/
		
		System.out.println("Escriba valor del producto");
		producto=teclado.nextDouble();
		
		descuento=(producto*10)/100;
		
		if (producto >= 100) {
			producto = producto - descuento; 
		}
			
		System.out.println("Valor final del producto  " + producto);	
		
		teclado.close();

	}

}
