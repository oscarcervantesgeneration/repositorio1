package logicadeprogramacion7;

import java.util.Scanner;

public class FinDeSemana {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String diaSemana;
		int hora;
		int minutos;

		int minutosFaltantes = 0;

		boolean datosValidos = true;

		do {
			System.out.print("Ingrese un día de la semana (de lunes a viernes): ");
			diaSemana = scanner.nextLine().toLowerCase();

			System.out.print("Ingrese una hora (horas y minutos separados por un espacio): ");
			hora = scanner.nextInt();
			minutos = scanner.nextInt();
			scanner.nextLine();

			if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
				System.out.println("La hora ingresada no es válida.");
				datosValidos = false;
			}

			switch (diaSemana) {
			case "lunes":
			case "martes":
			case "miércoles":
			case "jueves":
			case "viernes":
				break;
			default:
				System.out.println("El día de la semana ingresado no es válido.");
				datosValidos = false;
				break;
			}
		} while (!datosValidos);

		switch (diaSemana) {
		case "lunes":
		case "martes":
		case "miércoles":
		case "jueves":
			minutosFaltantes = ((4 * 24) + 15) * 60 - (hora * 60 + minutos);
			break;
		case "viernes":
			minutosFaltantes = (15 * 60) - (hora * 60 + minutos);
			break;
		default:
			break;
		}

		System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");
	}
}
