package Tema_5_Modular;

public class ejemplo_ejer_10 {

	public static void main(String[] args) {
		ejemplo_ejer_10 programa = new ejemplo_ejer_10();
		programa.inicio();
	}

	public void inicio() {
		int i = 10;
		System.out.println("antes de llamar a i " + i);
		modificarParametro(i);
		System.out.println("despues de llamar a i " + i);
	}

	public void modificarParametro(int a) {
		System.out.println(a);
		a = 0;
		System.out.println("valor de a " + a);
	}
}
