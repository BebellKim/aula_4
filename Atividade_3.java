package aula_4;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double numero=0,impar=0,par=0, i=1;
		
		while (i<= 10) {
			System.out.println("Informe : " +i );
			numero = ler.nextDouble();
			
			i++;
		
		if ( numero % 2 ==0) 	
			par= par + 1; // par +=1
			
			else 
				impar = impar +1; // impar +=1
	
	
	}
		System.out.println("A quantidade de números pares é: " + par);
		System.out.println("A quantidade de números impares é: " + impar);
		
		ler.close();
	}
	
}
