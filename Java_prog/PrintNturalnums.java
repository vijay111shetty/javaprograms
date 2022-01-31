package Java_prog;

import java.util.Scanner;

public class PrintNturalnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n to print the numbers");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println(i);
		}

	}

}
