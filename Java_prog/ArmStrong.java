package Java_prog;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check armstrong or not");
		int a = sc.nextInt();
		int p = a;
		System.out.println();
		ArrayList<Integer> b = new ArrayList<Integer>();
		int count = 0;
		while (a > 0) {
			int y = a % 10;
			b.add(y);
			a = a / 10;
			count = count + 1;
		}
		System.out.println(b);
		System.out.println(count);
		int j = 0;
		for (int u : b) {
			int i = (int) Math.pow(u, count);
			j = j + i;
		}
		System.out.println(j);
		if (j == p) {
			System.out.println(p + "\t Is a armstrong number");
		} else {
			System.out.println(p + "\t Is not a armstrong number");
		}
	}

}
