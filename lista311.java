// Escreva um programa que calcule a soma das diagonais principal e secundária. 
// O programa deve perguntar ao usuário a dimensão da matriz. 
// Baseado na dimensão da matriz o programa deve pedir ao usuário para preencher os valores da matriz
// (faça um método estático que receba a referência de uma matriz e a preencha). 
// Com a matriz preenchida faça outro método estático que calcule a soma das diagonais.

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class lista311 {
	public static void main (String[] args) {
		
		int linhasColunas = 0, diagonalPrimaria = 0, diagonalSecundaria = 0, quantidadeDaMatriz = 0, somaDiagonais = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantidade de linhas e colunas da Matriz: ");
		linhasColunas = scanner.nextInt();
		int matriz[][] = new int[linhasColunas][linhasColunas];

		//lê os valores da matriz
		for (int l=0; l<linhasColunas; l++) {
			for (int c=0; c<linhasColunas; c++) {
				
				System.out.println("Insira os valores da matriz: ");
				matriz[l][c] = scanner.nextInt();
			}		
		}

		//soma da diagonal primária OK
		for (int lip = 0; lip<linhasColunas; lip++) {
			for (int cop = 0; cop<linhasColunas; cop++) {

				if (lip == cop){

					diagonalPrimaria += matriz[lip][cop];
					
				}
			}
		}

		System.out.printf("Soma das diagonais primárias %d\n", diagonalPrimaria);

		//soma da diagonal secundária OK
		int cos = linhasColunas;

		for (int lis = 0; lis < linhasColunas; lis++) {
			
			cos--;
			diagonalSecundaria += matriz[lis][cos];	
		}

		System.out.printf("Soma das diagonais secundárias %d\n", diagonalSecundaria);

		somaDiagonais = diagonalPrimaria+diagonalSecundaria;

		System.out.println("Soma total das diagonais: "+ somaDiagonais);
	}
}