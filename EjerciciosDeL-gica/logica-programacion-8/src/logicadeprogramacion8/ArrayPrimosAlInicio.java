package logicadeprogramacion8;

import java.util.*;

public class ArrayPrimosAlInicio {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] primes = new int[10];
        int primeCount = 0;

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                primes[primeCount] = numbers[i];
                primeCount++;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (!isPrime(numbers[i])) {
                primes[primeCount] = numbers[i];
                primeCount++;
            }
        }

        System.out.println("Array original:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + ": " + numbers[i]);
        }

        System.out.println("Array con primos al principio:");
        for (int i = 0; i < primes.length; i++) {
            System.out.println(i + ": " + primes[i]);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
