package Java_prog;

import java.util.Scanner;

public class Sumofnnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n");
		int n=sc.nextInt();
		int count=0;
		for (int i=0;i<=n;i++)
		{
			count=count+i;
		}
		System.out.println("Sum of numbers is \t"+count);
	}

}
