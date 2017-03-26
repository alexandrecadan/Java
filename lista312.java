// Faça um programa que calcule o desvio padrão de um determinado número
// de amostras. O número de amostras deve ser pedido ao usuário no início do programa.
// Utilize array para armazenar as amostras. Os valores das amostras devem ser digitadas pelo
// usuário, uma a uma, como números decimais. 

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.lang.Math;

public class lista312 {
	public static void main (String[] args) {
	
		double xLinha = 0, resultado = 0, somatoria = 0;
		int quantidadeAmostras = 0;

		System.out.println("Quantidade de amostras: ");
		Scanner scanner = new Scanner(System.in);
		quantidadeAmostras = scanner.nextInt();	
		
		double amostras[] = new double[quantidadeAmostras];

		System.out.println("Quais são as amostras?");

		for (int i=0; i<quantidadeAmostras; i++) {
			amostras[i] = scanner.nextDouble();
			xLinha += amostras[i];
		}

		xLinha = xLinha/quantidadeAmostras;

		for (int j = 0; j<amostras.length; j++) {
			somatoria += ((amostras[j]-xLinha)*(amostras[j]-xLinha));
		}
		
		resultado = Math.sqrt(somatoria/(amostras.length-1));

		System.out.printf("O desvio padrão é: %.2f\n", resultado);
	}
}