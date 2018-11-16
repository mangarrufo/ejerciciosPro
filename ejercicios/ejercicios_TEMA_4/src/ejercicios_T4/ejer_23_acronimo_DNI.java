package ejercicios_T4;

public class ejer_23_acronimo_DNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palabra = "rest in peace";

		String[] vector = palabra.split(" ");// metido en el vector

		System.out.println(vector.length);

		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i].substring(0, 1).toUpperCase() + "."); // .toupercase esto hace se hace matuscula

			// System.out.print((char)(vector[i].substring(0, 1).charAt(0)-32));
			// esto seria un impresion en ascii

		}

	}
}
