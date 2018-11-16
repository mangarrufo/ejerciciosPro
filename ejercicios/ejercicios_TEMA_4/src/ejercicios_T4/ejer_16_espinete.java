package ejercicios_T4;

import java.util.Scanner;

public class ejer_16_espinete {

	public static void main(String[] args) {
		float media = 0.0F, maxima = 0.0F, mediaMayor = 0.0F, maximaMayor = 0.0F;
		String nombreMediaMayor = "", nombreIndividualMayor = "";
		String[][] notas = { { "Espinete", "6.0", "7.2", "2.3", "5.8", "3.4" },
				{ "Don Pinpon", "7.8", "1.6", "4.6", "9.4", "3.1" }, { "Gustavo", "3.6", "1.4", "8.9", "3.5", "6.5" },
				{ "Triki", "2.5", "3", "10", "2.4", "8.9" } };
		String[][] resultados = new String[4][3];

		for (int i = 0; i < notas.length; i++) {
			resultados[i][0] = notas[i][0];
		}

		for (int i = 0; i < notas.length; i++) {
			for (int j = 1; j < notas[i].length; j++) {
				media = media + Float.parseFloat(notas[i][j]);
				if (Float.parseFloat(notas[i][j]) > maxima) {
					maxima = Float.parseFloat(notas[i][j]);
				}
			}
			media = media / (notas[i].length - 1);
			resultados[i][1] = Float.toString(media);
			resultados[i][2] = Float.toString(maxima);
			media = 0;
			maxima = 0;
		}

		for (int i = 0; i < resultados.length; i++) {
			media = Float.parseFloat(resultados[i][1]);
			if (media > mediaMayor) {
				mediaMayor = media;
				nombreMediaMayor = resultados[i][0] + " ";
			}

			maxima = Float.parseFloat(resultados[i][2]);
			if (maxima > maximaMayor) {
				maximaMayor = maxima;
				nombreIndividualMayor = resultados[i][0] + " ";
			}
		}
		System.out.println("Nota media máxima: " + nombreMediaMayor + mediaMayor);
		System.out.println("Máxima nota individual: " + nombreIndividualMayor + maximaMayor);
	}

}