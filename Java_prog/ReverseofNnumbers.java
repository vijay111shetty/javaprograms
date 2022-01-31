package Java_prog;

import java.util.Scanner;

public class ReverseofNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			System.out.print(i+"\t");
		}
		
		
	}

}
