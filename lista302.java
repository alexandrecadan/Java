import java.io.*;
import java.net.*;
import java.util.Scanner;

public class lista302 {
	public static void main (String[] args) {

		double entradaDouble = 0, saida = 0, somatoria = 0;
		String  entrada = "";
		int contador = 0;
		
		Scanner scnEntrada = new Scanner(System.in);
		System.out.println("Insira um valor: ");

		do {

			entrada = scnEntrada.nextLine();

			try { 

				entradaDouble = Double.parseDouble(entrada);
				contador++;
				somatoria += entradaDouble;	

			} catch (Exception e) {

				System.out.println("Valor inválido!\nDigite Novamente: ");

			}

		} while (!scnEntrada.hasNext("S"));


		saida = somatoria/contador;

		System.out.printf("O resultado da média dos argumentos é %.2f\n", saida);

	}
}
