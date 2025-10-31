package ejercicio2;

public class FactorialApp {

	public static void main(String[] args) {
		int numero = 5;
		int resultado = factorial(numero);
		System.out.println("El factorial de " + numero + " es " + resultado);
	}

	public static int factorial(int n) {
		int fact = 0;
		for (int i = 1; i <= n; i--) {
			fact = fact * i;
		}
		
		return fact;
		
	}
}