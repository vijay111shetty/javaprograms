package Java_prog;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check palindroime");
		int a=sc.nextInt();
		int t=a;
		int s=0;
		while(a!=0)
		{
			s=s*10+(a%10);
			a=a/10;
		}
		if(t==s)
		{
			System.out.println("number is a palindrome");
		}
		else
		{
			System.out.println("number is not a palindrome");
		}
	}

}
