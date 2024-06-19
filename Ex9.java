package lpaAuladia19;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String[] nomes = new String[10];
		int[] idades = new int[10];


		for (int i = 0; i < 10; i++) {
			System.out.println("Digite 10 nomes " + (i + 1) + ":");
			nomes[i] = ler.nextLine();

			System.out.println("Digite 10 idades " + nomes[i] + ":");
			idades[i] = ler.nextInt();
			ler.nextLine();
			System.out.println("*************************************");
		}


		int MaisNovo = 0;
		for (int i = 1; i < 10; i++) {
			if (idades[i] < idades[MaisNovo]) {
				MaisNovo = i;
			}
		}


		System.out.println("A pessoa mais nova é: " + nomes[MaisNovo] + " com " + idades[MaisNovo] + " anos.");

		ler.close();
	}

}
