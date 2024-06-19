package lpaAuladia19;

import java.util.Scanner;

public class Ex12 {


	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num,a=0;
		for(int i=1; i<21;i++) {
			System.out.print("Insira o "+i+"º número: ");
			num = ler.nextInt();
			if (num<100 && num>0){
				a++;
			}
		}
		System.out.println("Qtd de números entre 0 e 100: "+a);
		ler.close();
	}
}