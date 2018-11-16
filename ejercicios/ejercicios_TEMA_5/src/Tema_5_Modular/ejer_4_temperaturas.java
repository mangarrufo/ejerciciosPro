package Tema_5_Modular;

import java.util.Scanner;


public class ejer_4_temperaturas {

	private float[] calendario = new float[360];
	private float temp = 0.0F;
	private int dia = 1;
	private int auxdia = 1;
	private int dia2 = 0;
	private int mes = 1;
	private int auxmes = 1;
	private static Scanner sc = new Scanner(System.in);
	private static boolean salir = false;
	private String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
			"octubre", "noviembre", "diciembre" };

	public static void main(String[] args) {

		// Declaramos e inicializamos variables del main

		int opcion = 0;
		boolean relleno = false;

		// Instanciamos la clase ejercicio4
		ejer_4_temperaturas meteosoft = new ejer_4_temperaturas();

		// Rellenamos el vector
		meteosoft.relleno();

		/*
		 * meteosoft.inicio();
		 */

		System.out.println(
				"Qué desea realizar?\n[1] Registrar temperatura\n[2] Mostrar temperatura media\n[3] Mostrar diferencia máxima\n[4] Modificar un registro para un día específico\n[5] Mostrar calendario\n[6] Finalizar ejecución");
		while (!sc.hasNextInt()) {
			System.out.println("Introduzca un valor numérico:");
			sc.next();
		}
		opcion = sc.nextInt();

		// Bucle relleno obligatorio de vector
		while (relleno == false) {
			while (opcion != 1) {
				System.out.println(
						"Antes de nada, debe rellenar con datos térmicos la base de datos primero. Por favor, seleccióne '[1] Registrar temperatura'");
				while (!sc.hasNextInt()) {
					System.out.println("Introduzca un valor numérico:");
					sc.next();
				}
				opcion = sc.nextInt();
			}
			meteosoft.registrarTemp();
			relleno = true;
		}

		// Bucle del menú
		while (salir == false) {
			System.out.println(
					"Qué desea realizar?\n[1] Registrar temperatura\n[2] Mostrar temperatura media\n[3] Mostrar diferencia máxima\n[4] Modificar un registro para un día específico\n[5] Mostrar calendario\n[6] Finalizar ejecución");
			while (!sc.hasNextInt()) {
				System.out.println("Introduzca un valor numérico:");
				sc.next();
			}
			opcion = sc.nextInt();

			if (opcion >= 1 && opcion <= 6) {

				switch (opcion) {

				case 1:

					meteosoft.registrarTemp();
					break;

				case 2:

					meteosoft.mostrarTMed();
					break;

				case 3:

					meteosoft.mostrarAmpTemp();
					break;

				case 4:
					meteosoft.modifTemp();
					break;

				case 5:

					meteosoft.mostrarCalendario();
					break;

				case 6:

					meteosoft.salir();
					break;

				default:
					break;

				}
			} else {
				System.out.println("Escoja una opción correcta!\n");
			}
		}

	}

	// Desarrollo de los MÉTODOS del programa

	/*
	 * public void inicio() { registrarTemp(); mostrarTMed(); mostrarAmpTemp();
	 * salir(); }
	 */

	/**
	 * Rellena el vector
	 */

	public void relleno() {

		for (int i = 0; i < calendario.length; i++) {
			calendario[i] = 1000;
		}
	}

	/**
	 * Permite la introducción de datos térmicos en la base de datos
	 */

	public void registrarTemp() {

		// Opción A: introducir los registros uno a uno de forma automática y
		// cronológica

		boolean salir = false;
		int respuesta = 0;

		// Comprobamos si el dia para el cual se ha hecho una modificación coincide con
		// el dia después del último el cual registramos datos
		if (auxdia != dia) {
			dia = auxdia;
		}
		if (auxmes != mes) {
			mes = auxmes;
		}

		while (salir == false && dia2 < calendario.length) {
			System.out.println(
					"Introduzca la temperatura registrada (ºC) para el dia " + dia + " de " + meses[mes - 1] + ":");
			while (!sc.hasNextFloat()) {
				System.out.println("Por favor, introduzca sólo números:");
				sc.next();
			}
			temp = sc.nextFloat();
			calendario[dia2] = temp;
			System.out.println("La temperatura registrada para el dia " + dia + " de " + meses[mes - 1] + " es de "
					+ temp + " ºC");
			dia++;
			dia2++;
			if (dia > 30) {
				dia = 1;
				mes++;
			}

			auxdia = dia;
			auxmes = mes;

			System.out.println("Desea terminar de introducir datos?\n[1] Si\n[2] No");
			while (!sc.hasNextInt()) {
				System.out.println("Introduzca un valor numérico:");
				sc.next();
			}
			respuesta = sc.nextInt();

			while (respuesta < 1 || respuesta > 2) {
				System.out.println("Introduzca una opción correcta:");
				while (!sc.hasNextInt()) {
					System.out.println("Introduzca un valor numérico:");
					sc.next();
				}
				respuesta = sc.nextInt();
			}

			if (respuesta == 1) {
				System.out.println("Introducción de datos térmicos FINALIZADA\n");
				salir = true;
			}

		}

	}

	/**
	 * Registra la temperatura para un dia y mes concreto. Luego imprime por
	 * pantalla
	 */

	public void modifTemp() {

		System.out.println("Introduzca la temperatura registrada:");
		while (!sc.hasNextFloat()) {
			System.out.println("Por favor, introduzca sólo números:");
			sc.next();
		}
		temp = sc.nextFloat();

		System.out.println("Introduzca el día:");
		while (!sc.hasNextInt()) {
			System.out.println("Por favor, introduzca sólo números:");
			sc.next();
		}
		dia = sc.nextInt();

		System.out.println("Introduzca el mes:");
		while (!sc.hasNextInt()) {
			System.out.println("Por favor, introduzca sólo números:");
			sc.next();
		}
		mes = sc.nextInt();

		calendario[(((30 * mes) - 30) + dia) - 1] = temp;

		for (int i = 1; i < calendario.length; i++) {
			if (i == ((30 * mes) - 30) + dia) {
				System.out.println("La temperatura para el " + dia + " de " + meses[mes - 1] + " es: " + temp + "\n");
			}
		}

	}

	/**
	 * Muestra la Temperatura Media (TMed) de los datos registrados
	 */

	public void mostrarTMed() {

		float suma = 0;
		float n = 0;

		for (int i = 0; i < calendario.length; i++) {
			if (calendario[i] != 1000) {
				suma = calendario[i] + suma;
				n++;
			}
		}

		System.out
				.println("La media de las temperaturas registradas en la Base de Datos es de: " + (suma / n) + " ºC\n");
	}

	/**
	 * Calcula la diferencia (Amplitud térmica) entre la temperatura más elevada y
	 * la más baja
	 */

	public void mostrarAmpTemp() {

		float numMayor = calendario[0];
		float numMenor = calendario[0];

		for (int i = 0; i < calendario.length; i++) {

			if (calendario[i] != 1000 && numMayor < calendario[i]) {
				numMayor = calendario[i];

			}

			if (calendario[i] != 1000 && numMenor > calendario[i]) {
				numMenor = calendario[i];

			}

		}

		System.out.println(
				"La Amplitud Térmica entre la mayor  y la menor temperatura es de: " + (numMayor - numMenor) + " ºC\n");

		numMayor = calendario[0];
		numMenor = calendario[0];
	}

	public void mostrarCalendario() {

		dia = 1;
		mes = 1;

		for (int i = 0; i < calendario.length; i++) {
			if (calendario[(((30 * mes) - 30) + dia) - 1] != 1000) {
				System.out.println("Dia " + dia + " de " + meses[mes - 1] + ": " + calendario[i] + " ºC");
			}
			dia++;
			if (dia > 30) {
				dia = 1;
				mes++;
			}
		}
	}

	/**
	 * Finaliza la ejecución del programa
	 */

	public void salir() {
		System.out.println("Muchas gracias por utilizar MeteoSoft 1.0. Hasta luego!");
		sc.close();
		salir = true;

	}
}
