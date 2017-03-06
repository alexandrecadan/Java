import java.io.*;
import java.net.*;
import java.util.Scanner;

//classe 
public class lista211 {
	//método
	public static void main(String[] args){
		
		double bonusAnual, salarioAtual;
		int cargo, quantidadeDepartamentos, quantidadePessoas;
		String funcionario;

		System.out.println("Qual o cargo?");
		System.out.println("1 - Diretor");
		System.out.println("2 - Gerente");
		System.out.println("3 - Analista");
		System.out.println("4 - Programador");
		System.out.println("5 - Auxiliar de Limpeza");

		Scanner scnCargo = new Scanner(System.in);
		cargo = scnCargo.nextInt();

		System.out.println("Qual seu salário Atual?");
		Scanner scnSalario = new Scanner(System.in);
		salarioAtual = scnSalario.nextDouble();

		//diretor
		if (cargo == 1){

			funcionario = "Diretor";
			System.out.println("Quantidade de departamentos?");
			Scanner scnQtdDptos = new Scanner(System.in);
			quantidadeDepartamentos = scnQtdDptos.nextInt();
			bonusAnual = (4*salarioAtual) + (3000.0*quantidadeDepartamentos);

	  	//gerente
		} else if (cargo == 2) {

			funcionario = "Gerente";
			System.out.println("Quantidade de funcionários?");
			Scanner scnQtdPessoas = new Scanner(System.in);
			quantidadePessoas = scnQtdPessoas.nextInt();
			bonusAnual = (2*salarioAtual) + (100.0*quantidadePessoas);

		//analista
		} else if (cargo == 3) {
			
			funcionario = "Analista";
			bonusAnual = salarioAtual;

		//programador	
		} else if (cargo == 4) {
			
			funcionario = "Programador";
			bonusAnual = (salarioAtual*0.8);

		//auxiliar de limpeza
		} else {

			funcionario = "Auxiliar de Limpeza";
			bonusAnual = (salarioAtual*0.5);

		}

		System.out.printf("\nO Bonus anual do "+ funcionario +" é de R$ %.2f\n", bonusAnual);

	}
}