package lpaAuladia19;

import java.util.Scanner;

public class Ex10_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, maior=0,i=1;

		
		while(i<=20) {
			i++;
			System.out.println("Insira o " + i + "° número");
			n = ler.nextInt();
			if (n >=8) {
				maior++;
			}
		
		}
		System.out.println(maior + " números são maiores que 8");
		
	}

}


