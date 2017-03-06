import java.io.*;
import java.net.*;
import java.util.Scanner;

//classe Locadora
public class lista25 {
	//método responsável por fazer cálculos da calculadora
	public static void main(String[] args){

		//variáveis
		int quantidadeDvds, quantidadeAlugaMes;
		double valorCada, faturamentoAnual, faturamentoMultas, quantidadeAtrasadas;

		//leitura das variáveis
		System.out.println("Quantidade de DVDS na locadora: ");
		Scanner scnQtdDvds = new Scanner(System.in);
		quantidadeDvds = scnQtdDvds.nextInt();

		System.out.println("Valor de Cada DVD: ");
		Scanner scnVlrCada = new Scanner(System.in);
		valorCada = scnVlrCada.nextDouble();

		//calcula a quantidade de DVDS alugadas por mês
		quantidadeAlugaMes = (quantidadeDvds/3);

		//calcula o faturamento total anual
		faturamentoAnual = ((quantidadeAlugaMes*12)*valorCada);
		
		//quantidade de DVDS atrasados
		quantidadeAtrasadas = (quantidadeAlugaMes/10.0);
					
		//valor ganho com multas por mês
		faturamentoMultas = (quantidadeAtrasadas*valorCada*0.1);

		System.out.printf("\nFaturamento anual: R$ %.2f", faturamentoAnual);

		System.out.printf("\nFaturamento mensal multas: R$ %.2f\n", faturamentoMultas);
	}
}