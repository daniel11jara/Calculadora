import java.util.Scanner;

public class Calculadora {
	
	private double numero1;
	private double numero2;
	private char operacao;
	
	public Calculadora() {
		
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public char getOperacao() {
		return operacao;
	}

	public void setOperacao(char operacao) {
		this.operacao = operacao;
	}
	
	public double calcular() {
		switch (operacao) {
		case '+': 
			return numero1 + numero2;
			
		case '-':
			return numero1 - numero2;
			
		case '*':
			return numero1 * numero2; 
		
		case '/':
			if (numero2 != 0) {
				return numero1 / numero2;
			} else {
				System.out.println("Erro: divisão por zero não é permitida");
				return Double.NaN;
		}
		default:
			System.out.println("Operação inválida");
			return Double.NaN;
		}
	}

}
