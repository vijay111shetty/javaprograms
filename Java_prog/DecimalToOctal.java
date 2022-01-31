package Java_prog;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal number to convert Binary");
		int a = sc.nextInt();
		String num = "";
		while (a > 0) {
			int e = a % 8;
			num = e + num;
			a = a / 8;
		}
		System.out.println(num);

	}

}
