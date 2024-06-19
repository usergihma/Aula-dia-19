package lpaAuladia19;

import java.util.Scanner;

public class Ex9_1 {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			String MaisnovoNom = "";
			int MaisnovoIda = Integer.MAX_VALUE;
			int num = 0;
			while (num < 10) {
				System.out.print("Digite o nome da pessoa " + (num + 1) + ": ");
				String nome = ler.nextLine();
				System.out.print("Digite a idade da pessoa " + (num + 1) + ": ");
				int idade = ler.nextInt();
				ler.nextLine();
				if (idade < MaisnovoIda) {
					MaisnovoIda = idade;
					MaisnovoNom = nome;
				}
				num++;
			}
			System.out.println("A pessoa mais nova é " + MaisnovoNom + ", com " + MaisnovoIda + " anos.");
			ler.close();
		}
	}