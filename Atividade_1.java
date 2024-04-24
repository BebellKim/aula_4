package aula_4;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	    int numero, valor=1;
	    
	    System.out.print("Digite um número: ");
		numero = ler.nextInt();
		
		while ( valor <=numero ) {
			if(valor % 2 != 0) {
				System.out.println( "Números impares: " + valor );
				
		      
	}
               valor++;
               ler.close();
}
}
}

