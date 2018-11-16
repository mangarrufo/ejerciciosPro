package ejercicios_T4;

import java.util.Scanner;

public class ejer_21_compara_con_equals_y_while {

	private static final String kPALABRA_SECRETA = "DAW";

	public static void main(String[] args) {

		String intento = "";
		boolean validador = false;

		Scanner kb = new Scanner(System.in);

		while (validador == false) {

			System.out.println("¿Que palabra secreta es?:");
			intento = kb.nextLine();

			if (intento.equals(kPALABRA_SECRETA)) {
				System.out.println("Palabra CORRECTA");
				validador = true;
			}

			else {
				System.out.println("Palabra ERRONEA, pruebe de nuevo\n");

			}

		}
		kb.close();

	}

}
