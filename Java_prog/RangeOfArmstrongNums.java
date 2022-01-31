package Java_prog;

import java.util.ArrayList;
import java.util.Scanner;

public class RangeOfArmstrongNums {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter a number"); int a = sc.nextInt(); for (int o = 1; o
		 * < a; o++) { int p = o; ArrayList<Integer> b = new ArrayList<Integer>(); int
		 * count = 0; while (o > 0) { int y = o % 10; b.add(y); o = o / 10; count =
		 * count + 1; } int j = 0; for (int u : b) { int i = (int) Math.pow(u, count); j
		 * = j + i; } if (j == p) { System.out.println(p); } }
		 */Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			boolean r = isAmstrong(i);
			if (r)
				System.out.println(i + " is Armstrong");
		}
	}

	static int countDigit(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

	static int pow(int n, int p) {
		int pw = 1;
		while (p > 0) {
			pw = pw * n;
			p--;
		}
		return pw;
	}

	static boolean isAmstrong(int x) {
		int nd = countDigit(x);
		int t = x;
		int sum = 0;
		while (t > 0) {
			int r = t % 10;
			sum = sum + pow(r, nd);
			t = t / 10;
		}
		if (sum == x)
			return true;
		else
			return false;
	}

}
