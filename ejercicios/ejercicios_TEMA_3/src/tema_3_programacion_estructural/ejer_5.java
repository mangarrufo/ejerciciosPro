package tema_3_programacion_estructural;

import java.util.Scanner; //paquete de escribir y grabar en teclado

public class ejer_5 {

	static final float kVALORMINIMO = 50, kVALORMAXIMO_DESCUENTO = 500,kDESCUENTO = 0.25F;
	

	public static void main(String[] args) {

		float precioProducto = 0.0F;

		Scanner teclado = new Scanner(System.in); // declarar este valor

		System.out.println("Escriba valor del producto");
		precioProducto = teclado.nextFloat();

		if (precioProducto <= 0) {
			System.out.println("Valor de precio incorrecto");
		}

		if (precioProducto <= kVALORMINIMO) {
			System.out.println("Precio final del producto:  " + precioProducto + '€');

		} else if (precioProducto >= kVALORMINIMO) {
			precioProducto = precioProducto - (precioProducto * kDESCUENTO);
			System.out.println("Precio final del producto:  " + precioProducto + '€');
		}

		teclado.close();

	}

}
