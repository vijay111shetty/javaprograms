package Java_prog;

import java.util.ArrayList;
import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check strong or not");
		int a = sc.nextInt();
		int y = a;
		ArrayList<Integer> it = new ArrayList<Integer>();
		while (a > 0) {
			int b = a % 10;
			it.add(b);
			a = a / 10;
		}
		System.out.println(it);
		int t = 0;
		for (int e : it) {
			t = t + fact(e);
		}
		System.out.println(t);
		if (y == t) {
			System.out.println(y + "\t Is the Strong number");
		} else {
			System.out.println(y + "\t Is not a Strong number");
		}
	}

	static int fact(int n) {
		int c = 1;
		for (int j = n; j > 1; j--) {
			c = c * j;
		}
		return c;
	}

}
