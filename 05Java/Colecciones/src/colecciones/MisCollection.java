package colecciones;
import java.util.*;
public class MisCollection {
	public static void main(String[] args) {
		wrapperClass();
	}

	public void listasCollections() {
		List miLista = new ArrayList () ;
		miLista.add(1);
		miLista.add(2);
		
		
		
		
		
		
	}
	
	static void wrapperClass() {
		// byte, short, chart, long, float, int, double

		byte numeroB = -128;
		System.out.println("Tamaño de un Byte" + Byte.SIZE);
		System.out.println("Valor Max" + Byte.MAX_VALUE);
		System.out.println("Valor MIN" + Byte.MIN_VALUE);
		System.out.println("--->" + numeroB);

		int numeroI = -2147483648;
		System.out.println("Tamaño de un entero bytes: " + Integer.BYTES);
		System.out.println("Tamaño de un entero: "+Integer.SIZE);
		System.out.println("Valor Max" + Integer.MAX_VALUE);
		System.out.println("Valor MIN" + Integer.MIN_VALUE);
		System.out.println("--->" + numeroI);

	}
}
