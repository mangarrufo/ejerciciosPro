package Tema_5_Modular;

public class ejer_13_correccion {

	public static void main(String[] args) {
		ejer_13_correccion programa = new ejer_13_correccion();
		int[] array = { 1, 2, 3, 4 };
		float nota = 4.5F;
		String mes = "Marzo";

		System.out.print("Parámetro de entrada: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Parámetro de salida: " + programa.maximoMinimo(array, 0));
		System.out.println("Parámetro de salida: " + programa.maximoMinimo(array, 1));
		System.out.println();

		System.out.println("***Media de un array***");
		System.out.print("Parámetro de entrada: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Parámetro de salida: " + programa.media(array));
		System.out.println();

		System.out.println("***Transformar nota a texto***");
		System.out.println("Parámetro de entrada: " + nota);
		System.out.println("Parámetro de salida: " + programa.notaTexto(nota));
		System.out.println();

		System.out.println("***Saber días que tiene un mes***");
		System.out.println("Parámetro de entrada: " + mes);
		System.out.println("Parámetro de salida: " + programa.calcularMes(mes));
		System.out.println();

		System.out.println("***Buscar valor en un array***");
		System.out.print("Array en el que buscar: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Parámetro de salida: " + programa.buscar(array, 4));
	}

	public int maximoMinimo(int[] array, int maxMin) {
		int devolver = array[0];

		for (int i = 0; i < array.length; i++) {
			if (maxMin == 0) {
				if (array[i] > devolver) {
					devolver = array[i];
				}
			} else {
				if (array[i] < devolver) {
					devolver = array[i];
				}
			}
		}
		return devolver;
	}

	public float media(int[] array) {
		float media = 0.0F;
		for (int i = 0; i < array.length; i++) {
			media = media + array[i];
		}
		media = media / array.length;
		return media;
	}

	public String notaTexto(float nota) {
		String notaT = "";
		if (nota < 5) {
			notaT = "Suspendido";
		} else {
			notaT = "Aprobado";
		}
		return notaT;
	}

	public int calcularMes(String mes) {
		int dias = 0;
		switch (mes) {
		case "Enero":
		case "Marzo":
		case "Mayo":
		case "Julio":
		case "Agosto":
		case "Octubre":
		case "Diciembre":
			dias = 31;
			break;
		case "Febrero":
			dias = 28;
			break;
		case "Abril":
		case "Junio":
		case "Septiembre":
		case "Noviembre":
			dias = 30;
			break;
		}
		return dias;
	}

	public int buscar(int[] array, int valorABuscar) {
		int encontrado = -1;
		boolean salir = false;
		for (int i = 0; i < array.length && salir == false; i++) {
			if (array[i] == valorABuscar) {
				encontrado = i;
				salir = true;
			}
		}
		return encontrado;
	}
}
