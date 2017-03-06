import java.io.*;
import java.net.*;
import java.util.Scanner;

//Velocidade média do carro
class lista24 {
	public static void main(String[] args){

		float tempo = 0, velocidadeMedia = 0, distancia = 0;

		System.out.println("Informe a distância percorrida em km: ");
		Scanner scnDist = new Scanner(System.in);
		distancia = scnDist.nextFloat();

		System.out.println("Informe o tempo gasto em horas: ");
		Scanner scnTempo = new Scanner(System.in);
		tempo = scnTempo.nextFloat();

		velocidadeMedia = (distancia/tempo);

		System.out.printf("A velocidade média do carro foi: %.2f", velocidadeMedia);
		System.out.println(" km/h");

	}
}