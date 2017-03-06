import java.io.*;
import java.net.*;
import java.util.Scanner;

//programa inverte o nome
class lista18 {
	public static void main(String[] args){
		
		//descobrir como pegar o tamanho do array com length
		String[] nome = new String[100];
		
		System.out.println("Digite seu nome completo: ");
		Scanner scn = new Scanner(System.in);
		
		//armazena no array quebrando os nomes com espaço
		nome = scn.nextLine().split(" ");
		
		//percorre o array de trás para frente
		for (int i = nome.length-1; i >= 0; i--){
			System.out.println(nome[i]);
		}
		
	}
}