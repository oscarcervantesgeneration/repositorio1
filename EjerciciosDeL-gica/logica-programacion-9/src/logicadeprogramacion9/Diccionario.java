package logicadeprogramacion9;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
	  public static void main(String[] args) {
	        HashMap<String, String> diccionario = new HashMap<String, String>();
	        diccionario.put("gato", "cat");
	        diccionario.put("perro", "dog");
	        diccionario.put("leon", "lion");
	        diccionario.put("lobo", "wolf");
	        diccionario.put("caballo", "horse");
	        diccionario.put("vaca", "cow");
	        diccionario.put("toro", "bull");
	        diccionario.put("gallo", "rooster");
	        diccionario.put("cerdo", "pig");
	        diccionario.put("araña", "spider");
	        diccionario.put("aguila", "eagle");
	        diccionario.put("serpiente", "snake");
	        diccionario.put("lagarto", "aligator");
	        diccionario.put("raton", "mouse");
	        diccionario.put("rata", "rat");
	        diccionario.put("hamster", "hamster");
	        diccionario.put("oveja", "sheep");
	        diccionario.put("conejo", "rabbit");
	        diccionario.put("oso", "bear");
	        diccionario.put("delfin", "dolphin");

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa una palabra en español: ");
	        String palabra = scanner.nextLine().toLowerCase();

	        if (diccionario.containsKey(palabra)) {
	            System.out.println("La traducción de " + palabra + " es: " + diccionario.get(palabra));
	        } else {
	            System.out.println("La palabra no se encuentra en el diccionario.");
	        }
	    }
}
