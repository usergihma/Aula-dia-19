package lpaAuladia19;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num,a=0,b=0,c=0;
		for(int i=0; i<20; i++) {
			System.out.print("Digite o "+i+"º valor: ");
			num = ler.nextInt();
			if (num<100 && num>0) {
				a++;
			}
			else if (num>101 && num<200) {
				b++;
			}
			else if (num>200) {
				c++;
			}
		}
		System.out.println("Qnt de números entre 0 e 100: "+a);
		System.out.println("Qnt de números entre 101 e 200: "+b);
		System.out.println("Qnt de números maiores que 200: "+c);
		ler.close();
	}
}

}

}
