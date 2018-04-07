package cliente;

import java.util.Scanner;

public class Programa {
			
	public static void main(String[] args) {
		
		int opcao = 0, num1, num2;
		float result;
		
		Calculadora calc = new CalculadoraService().getCalculadoraPort();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá!!!");
		System.out.println("Vamos calcular!!!");
		System.out.println("Digite a operação desejada: 1 - Soma / 2 - Subtração / 3 - Multiplicação / 4 - Divisão: ");
		opcao = leia.nextInt();
		
		System.out.println("Digite um número: ");
		num1 = leia.nextInt();		
		System.out.println("Digite outro número: ");
		num2 = leia.nextInt();
		
		switch(opcao){
		
			case 1:		
				System.out.println("O resultado da soma é = " + calc.soma(num1, num2));
				break;
			
			case 2:
				System.out.println("O resultado da subtração é = " + calc.subtrair(num1, num2));
				break;
				
			case 3:
				System.out.println("O resultado da multiplicação é = " + calc.multiplicar(num1, num2));
				break;
				
			case 4:
				System.out.println("O resultado da divisão é = " + calc.dividir(num1, num2));
				break;
				
			default: System.out.println("Operação Inválida!!!");
		}
	}
}
