import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Calculadora calculadora = new Calculadora();
		
		System.out.print("Digite o primeiro número: ");
		calculadora.setNumero1(scanner.nextDouble());
		
		System.out.print("Digite o segundo número: ");
		calculadora.setNumero2(scanner.nextDouble());
		
		System.out.print("Digite o operador: ");
		calculadora.setOperacao(scanner.next().charAt(0));
		
		double resultado = calculadora.calcular();
		
		System.out.println("Resultado da operação: " + resultado);
		
		scanner.close();

	}

}
