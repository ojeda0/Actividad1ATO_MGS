package pruebas;

public class Cuenta {

	//ATRIBUTOS
	
	private String numero;
	private double saldo;
	
	//METODOS
	
	public Cuenta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresarDinero(double importe) {
		saldo = saldo + importe;
	}
	public void extraerDinero(double importe) {
		if((saldo-importe) < 0) {
			throw new java.lang.ArithmeticException("Saldo Negativo");
		}
		else {
			saldo = saldo - importe;
		}
	}
	public void mostrarCuenta() {
		setNumero(numero);
		setSaldo(saldo);
	}
	
	public boolean tieneSaldo() {
		return saldo > 0;
	}
	
	public void aplicarInteres(double porcentaje) {
		if(porcentaje < 0) {
			throw new java.lang.IllegalArgumentException("Porcentaje negativo");
		}
		saldo = saldo*( 1 + porcentaje / 100.0);
		
	}
	
}