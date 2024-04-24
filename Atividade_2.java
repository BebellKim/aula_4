package aula_4;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double numero, soma=0, media;
		int i = 1;

		while (i <= 5) {
			System.out.println("Informe : " );
			numero = ler.nextDouble();
			soma = soma +numero;
			i++;
		}
		media = soma/5;
		System.out.println("soma  : " + soma);
		System.out.println("media  : " + media);
		
ler.close();
}
}

