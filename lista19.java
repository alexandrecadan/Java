import java.io.*;
import java.net.*;
import java.util.Scanner;

//faz as 4 operações básicas
class lista19 {
	public static void main(String[] args){
		
		float arg1 = 0, arg2 = 0, resultado = 0;
		char operacao;


		System.out.println("Primeiro argumento: ");
		Scanner scnArg1 = new Scanner(System.in);
		arg1 = scnArg1.nextFloat();


		System.out.println("Segundo argumento: ");
		Scanner scnArg2 = new Scanner(System.in);
		arg2 = scnArg2.nextFloat();

		do {

		System.out.println("Operação (+, -, / ou X): ");
		Scanner scnOperacao = new Scanner(System.in);
		operacao = scnOperacao.next().charAt(0);

		} while (operacao != '+' && operacao != '-' && operacao != '/' && operacao != 'x' && operacao != 'X');

		if (operacao == '+') {
			resultado = arg1 + arg2;
		} else if (operacao == '-') {
			resultado = arg1 - arg2;
		} else if (operacao == '/') {
			resultado = arg1 / arg2;
		} else if (operacao == 'x' || operacao == 'X'){
			resultado = arg1 * arg2;
		}
				
		System.out.printf("A operação escolhida foi " + operacao + " e o resultado da operação é: %.2f\n", resultado);
		
	}
	
}