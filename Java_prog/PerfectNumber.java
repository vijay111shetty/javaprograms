package Java_prog;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a number to check perfect number");
		int a = sc.nextInt();
		for (int i = 1; i < a; i++) {
			PerfectNumber e = new PerfectNumber();
			if (e.isPerfect(i)) {
				System.out.println(i);
			}
		}

	}

	public boolean isPerfect(int i) {
		int q = 0;
		for (int j = 1; j < i; j++) {
			if (i % j == 0) {
				q = q + j;
			}
		}
		if (q == i) {
			return true;
		} else {
			return false;
		}
	}
}
