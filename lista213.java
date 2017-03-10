import java.io.*;
import java.net.*;
import java.util.Scanner;

//classe Locadora
public class lista213 {
	//método responsável por fazer cálculos da calculadora
	public static void main(String[] args){

		int entrada, aux1, aux2, i;
		int fibonacci[] = new int[100];

		System.out.println("Insira um número inteiro positivo: ");
		Scanner scn = new Scanner(System.in);
		entrada = scn.nextInt();

		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (i = 0; fibonacci[i] < entrada ; i++ ) {
			
			fibonacci[i+2] = fibonacci[i+1] + fibonacci[i]; 

			System.out.printf("%d, ", fibonacci[i]);

		}
		System.out.printf("%d ", fibonacci[i]);
		System.out.println();

	}
}