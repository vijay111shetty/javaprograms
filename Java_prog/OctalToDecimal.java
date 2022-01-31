package Java_prog;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a Octal number to convert to Decimal");
		long a = sc.nextLong();
		int count = 0;
		long b = 0;
		while (a > 0) {
			int k = (int) a % 10;
			b = b + (long) (k * Math.pow(8, count));
			count++;
			a = a / 10;
			System.out.println(b);

		}
		System.out.println(b);

	}

}
