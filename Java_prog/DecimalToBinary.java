package Java_prog;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal number to convert Binary");
		int a = sc.nextInt();
		String num = "";
		while (a > 0) {
			int e = a % 2;
			num = e + num;
			a = a / 2;
		}
		System.out.println(num);
	}

}
