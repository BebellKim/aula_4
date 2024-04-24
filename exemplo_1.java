package aula_4;

import java.util.Scanner;

public class exemplo_1 {
	public static void main(String[] args) {
		
Scanner ler = new Scanner (System.in);
int numero,impar=0,par=0;

for (int i = 1; i <= 10; i++) {
	System.out.print("Informe o " + i + "° número: ");
numero = ler.nextInt();
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



