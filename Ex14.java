package lpaAuladia19;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n, soma=0;

		for(int i=0; i<=10;) {
			System.out.println("Informe uma sequência de valores ");
			n = ler.nextInt();
			soma=soma+n;

			if (n <= 0){
				System.out.println("O resultado da soma é:  " + soma );
				System.exit(i);

			}
		}





		ler.close();

	}

}
