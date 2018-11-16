package Tema_5_Modular;

public class ejer_10_modificar_valor_array {

	public static void main(String[] args) {
		ejer_10_modificar_valor_array programa = new ejer_10_modificar_valor_array();
		programa.inicio();
	}

	public void inicio() {
		int []vector = {7,8,9};
		System.out.println("antes de llamar a la pimera de vector " + vector[0]);
		modificarParametro(vector);
		System.out.println("despues de llamar la primera de vector " + vector[0]);
	}

	public void modificarParametro(int[] a) {
		System.out.println(a[0]);
		a [0]= 0;
		System.out.println("valor de a " + a[0]);
	}
}