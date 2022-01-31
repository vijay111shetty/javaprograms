package Java_prog;

import java.util.Scanner;

public class PrimeAndPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		;
		System.out.println("Enter a number to check prime palindrome");
		int a = sc.nextInt();
		if (prime(a) == palindrome(a)) {
			System.out.println(a + "\t Is a prime palindrome");
		} else {
			System.out.println(a + "\t Not a prime palindrome");
		}

	}

	public static int prime(int c) {
		for (int i = 2; i < c; i++) {
			if (c % i == 0) {
				return 0;
			} else {
				return c;
			}
		}
		return c;

	}

	public static int palindrome(int j) {
		int u = 0;
		int y = j;
		while (j > 0) {
			int r = j % 10;
			u = r + u * 10;
			j = j / 10;
		}
		if (u == y) {
			return y;
		} else {
			return 3;
		}
	}

}
