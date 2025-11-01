package ejercicio2;

public class FactorialApp {

	public static void main(String[] args) {
		int numero = 5;
		int resultado = factorial(numero);
		System.out.println("El factorial de " + numero + " es " + resultado);
	}

	public static int factorial(int n) {
		int fact = 1;
		
		if(n<0) {
			System.out.println("Error, el número no puede ser menor que 0.");
		}
		
		else if(n==0) {
			fact = 1;
		}
		
		else {
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
		}
		
		return fact;
		
	}
}