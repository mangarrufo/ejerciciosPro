package tema_3_programacion_estructural;

import java.util.Scanner;

public class ejer_22 {

	public static void main(String[] args) {

		int base = 0;
		int altura = 0;
		int lado = 0;
		double area = 0.0;
		String figura = "";
		String Triangulo = "";
		String Cuadrado = "";
		String Rectangulo = "";

		Scanner kb = new Scanner(System.in);

		do {
			System.out.println("¿De que poligono quiere saber el Area?\nTriangulo\nCuadrado\nRectanguo \n");
			figura = kb.nextLine();
		} while (!figura.equals("Triangulo") && !figura.equals("Cuadrado") && !figura.equals("Rectangulo"));
		System.out.println("error");

		switch (figura) {
		case "Triangulo":
			System.out.println("Introduzca medida de la Base");
			while (!kb.hasNextInt()) {
				System.out.println("Introduzca numero entero\n");
				kb.next();
			}
			base = kb.nextInt();

			System.out.println("Introduzca medida de la Altura");
			while (!kb.hasNextInt()) {
				System.out.println("Introduzca numero entero\n");
				kb.next();
			}
			altura = kb.nextInt();

			area = (base * altura) / 2.0;

			System.out.println("El Area es: " + area);

			break;

		case "Cuadrado":
			System.out.println("Introduzca medida del Lado");
			while (!kb.hasNextInt()) {
				System.out.println("Introduzca numero entero\n");
				kb.next();
			}
			lado = kb.nextInt();

			area = Math.pow(lado, 2);

			System.out.println("El Area es: " + (int) area);

			break;

		case "Rectangulo":

			System.out.println("Introduzca medida de la Base");
			while (!kb.hasNextInt()) {
				System.out.println("Introduzca numero entero\n");
				kb.next();
			}
			base = kb.nextInt();

			System.out.println("Introduzca medida de la Altura");
			while (!kb.hasNextInt()) {
				System.out.println("Introduzca numero entero\n");
				kb.next();
			}
			altura = kb.nextInt();

			area = (int) (base * altura);

			System.out.println("El Area es: " + (int) area);

		}

		kb.close(); // https://www.portaleducativo.net/octavo-basico/154/Perimetro-y-area-de-poligonos

	}

}