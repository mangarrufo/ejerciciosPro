package tema_3_programacion_estructural;
import java.util.Scanner; /*paquete de escribir y grabar en teclado*/
public class ejer_2 {

	public static void main(String[] args) {
		
		float kPRECIOPRODUCTO=0.0F;
		float KPENALIZACION=2.0F;
		float kDESCUENTO=0.0F;
		
		Scanner teclado=new Scanner(System.in); /*declarar este valor*/
		
		System.out.println("Escriba valor del producto");
		kPRECIOPRODUCTO=teclado.nextFloat();
		
		kDESCUENTO=(kPRECIOPRODUCTO*10)/100;
	
		if (kPRECIOPRODUCTO <= 30) {
			kPRECIOPRODUCTO = kPRECIOPRODUCTO + KPENALIZACION; 
			
		} else if(kPRECIOPRODUCTO >= 100) {
			kPRECIOPRODUCTO = kPRECIOPRODUCTO - kDESCUENTO; 
			
		}
		
		System.out.println("Valor final del producto  " + kPRECIOPRODUCTO+'€');	
		
		teclado.close();

	}

}