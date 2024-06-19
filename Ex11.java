package lpaAuladia19;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num,par=0;
		for (int i = 1 ; i <20 ; i++) {
			System.out.print("Informe o "+i+"º número: ");
			num = ler.nextInt();
			if (num % 2 ==0)
				par++;
		}
		System.out.println("Qtde de números par: "+par);
		ler.close();
	}
}