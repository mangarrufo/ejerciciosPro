package tema_3_programacion_estructural;

import java.util.Scanner;

public class ejer_15{
	static final int kSECRETO = 241;

	public static void main(String[] args) {

		int apuesta = 0;
		int intentos = 3;
		boolean estadoJuego = false;

		Scanner kb = new Scanner(System.in);

		while (estadoJuego == false) {
			System.out.println("Acierta el numero");
			while (!kb.hasNextInt()) {
				System.out.println("El numero no es valido");
				kb.next();
			}

			apuesta = kb.nextInt();

			if (apuesta != kSECRETO) {
				intentos--;
				System.out.println("Prueba otra vez. Tienes " + intentos + " intentos");
			}
			if (intentos == 0) {
				estadoJuego = true;
				System.out.println("Has agotado los intentos");
			}
			if (apuesta == kSECRETO) {
				estadoJuego = true;
				System.out.println("Has acertado");
			}
		}
		kb.close();
	}

}