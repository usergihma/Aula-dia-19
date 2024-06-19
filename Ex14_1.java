package lpaAuladia19;

import java.util.Scanner;

public class Ex14_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n, soma=0, i= 0;

		while (i<1) {
			System.out.println("Informe uma sequência de valores ");
			n = ler.nextInt();
			soma=soma+n;
		
			if (n <= 0){
				System.out.println("O resultado da soma é:  " + soma );
				System.exit(0);

			}
		}
		

		


		ler.close();

	}

}
