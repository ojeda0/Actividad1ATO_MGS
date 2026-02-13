package paquete;

public class Main {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		 int a = 10, b = 3;
		 String etiqueta = "BASE";
		 System.out.println("Etiqueta: " + etiqueta);
		 System.out.println("Suma: " + calc.sumar(a, b));
		 System.out.println("Resta: " + calc.restar(a, b));
		 
		 // === BLOQUE A (solo Alumno A) ===
		 
		 Saludo s = new Saludo();
		 System.out.println(s.saludar("DAW"));
		 
		 
		 
		 // === BLOQUE B (solo Alumno B) ===
		 
		 
		 
		 
	}


}
