package cliente;

import java.util.Scanner;

public class Programa {
			
	public static void main(String[] args) {
		
		int opcao = 0, num1, num2;
		float result;
		
		Calculadora calc = new CalculadoraService().getCalculadoraPort();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ol�!!!");
		System.out.println("Vamos calcular!!!");
		System.out.println("Digite a opera��o desejada: 1 - Soma / 2 - Subtra��o / 3 - Multiplica��o / 4 - Divis�o: ");
		opcao = leia.nextInt();
		
		System.out.println("Digite um n�mero: ");
		num1 = leia.nextInt();		
		System.out.println("Digite outro n�mero: ");
		num2 = leia.nextInt();
		
		switch(opcao){
		
			case 1:		
				System.out.println("O resultado da soma � = " + calc.soma(num1, num2));
				break;
			
			case 2:
				System.out.println("O resultado da subtra��o � = " + calc.subtrair(num1, num2));
				break;
				
			case 3:
				System.out.println("O resultado da multiplica��o � = " + calc.multiplicar(num1, num2));
				break;
				
			case 4:
				System.out.println("O resultado da divis�o � = " + calc.dividir(num1, num2));
				break;
				
			default: System.out.println("Opera��o Inv�lida!!!");
		}
	}
}
