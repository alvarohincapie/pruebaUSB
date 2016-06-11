package co.com.usbcali.scm;

public class CalculadoraImpl implements Calculadora {

	private int res = 0;  
	public void sumar(int num1, int num2) {
		
		res = (num1 + num2) + res;
		
	}

	public void restar(int num1, int num2) {
		res = (num1 - num2) + res;
		
	}

	public int obtenerResultado() {
		return res;
	}

	public void imprimir() {
		System.out.println("Resultado:" + obtenerResultado());
	}

}
