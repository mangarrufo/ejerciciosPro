package Tema_5_Modular;

public class ejer_11_array_vector {

	public static void main(String[] args) {
		ejer_11_array_vector programa = new ejer_11_array_vector();
		programa.inicio();
	}

	public void inicio() {
		String palabra = "Hola DAW";
		System.out.println("antes de llamar a la pimera de vector " + palabra);
		modificarParametro(palabra);
		System.out.println("despues de llamar la primera de vector " + palabra);
	}

	public void modificarParametro(String a) {
		System.out.println(a);
		a = "modificado";
		System.out.println("valor de a " + a);
	}
}
