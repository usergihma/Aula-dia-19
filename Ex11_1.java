package lpaAuladia19;

import java.util.Scanner;

public class Ex11_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num,par=0,i=0;
		while (i<20) {
			System.out.print("Informe o "+i+"º número: ");
			num = ler.nextInt();
			if (num % 2 ==0)
				i++;
			par++;
		}
		System.out.println("Qtde de números par: "+par);
		ler.close();
	}
}