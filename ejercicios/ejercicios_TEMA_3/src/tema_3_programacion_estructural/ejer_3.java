package tema_3_programacion_estructural;
import java.util.Scanner; /*paquete de escribir y grabar en teclado*/
public class ejer_3 {

	static final int kNUMEROSECRETO=241;
	public static void main(String[] args) {
		
		int intento=0;
		
		Scanner teclado=new Scanner(System.in); /*declarar este valor*/
		
		System.out.println("Escriba su apuesta");
		intento=teclado.nextInt();
		
	
		if (kNUMEROSECRETO == intento) {
			System.out.println("Enhorabuena, ha acertado"); 
			
		} else { 
			System.out.println("Numero erroneo"); 
			
		}
			
		
		teclado.close();

	}

}
