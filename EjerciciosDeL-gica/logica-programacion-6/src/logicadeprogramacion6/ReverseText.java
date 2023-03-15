package logicadeprogramacion6;

import java.util.Scanner;

public class ReverseText {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese una palabra o frase: ");
	        String texto = scanner.nextLine();

	        String textoInvertido = "";

	        for (int i = texto.length() - 1; i >= 0; i--) {
	            textoInvertido += texto.charAt(i);
	        }

	        System.out.println("Texto invertido: " + textoInvertido);
	    }
}
