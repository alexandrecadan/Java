import java.io.*;
import java.net.*;
import java.util.Scanner;

public class lista306 {
	public static void main (String[] args) {

		double chuva[] = new double[7], chuvaMedia = 0, aux = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Domingo: ");
		chuva[0] = scanner.nextInt();
		System.out.println("Segunda-feira: ");
		chuva[1] = scanner.nextInt();
		System.out.println("Terça-feira: ");
		chuva[2] = scanner.nextInt();
		System.out.println("Quarta-feira: ");
		chuva[3] = scanner.nextInt();
		System.out.println("Quinta-feira: ");
		chuva[4] = scanner.nextInt();
		System.out.println("Sexta-feira: ");
		chuva[5] = scanner.nextInt();
		System.out.println("Sábado: ");
		chuva[6] = scanner.nextInt();

		//bubble-sort
		for (int i=0; i<7;i++ ) {
			for (int j=0; j<6; j++) {
			
				if(chuva[j] > chuva[j+1]){
					aux = chuva[j];
					chuva[j] = chuva[j+1];
					chuva[j+1] = aux;
				}
			}
		}

		for (int z=0; z<7; z++) {
			chuvaMedia += chuva[z];			
		}

		chuvaMedia = (chuvaMedia/7);

		System.out.printf("Média: %.2f\n", chuvaMedia);
		System.out.printf("Máximo: %.2f\n", chuva[6]);
		System.out.printf("Mínimo: %.2f\n", chuva[0]);
	}
}