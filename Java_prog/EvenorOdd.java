package Java_prog;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check number is even or odd");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");

		}

	}

}
