package lpaAuladia19;

import java.util.Scanner;

public class Ex12_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num,a=0,i=0;
		while (i<20) {
			System.out.print("Insira o "+i+"º número: ");
			num = ler.nextInt();
			i++;
			if (num<100 && num>0){
				a++;
			}
		}
		System.out.println("Qtd de números entre 0 e 100: "+a);
		ler.close();
	}
}