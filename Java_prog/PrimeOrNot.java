package Java_prog;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check prime or not");
		int n = sc.nextInt();
		if(n==1)
		{
			System.out.println("Prime starts from 2");
		}
		for (int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("not prime");
				break;
			}
			else
			{
				System.out.println("prime");
				break;
			}
		}
		checkprime(8);
		
	}
	static void checkprime(int a) {
		if(a==1) {
			System.out.println("Prime number starts from 2");
		}
		else {
			for(int i=2;i<a;i++) {
				if(a%i==0) {
					System.out.println(a+"\t Not Prime");
					break;
				}
				else {
					System.out.println(a+"\t Prime");
				}
			}
				
		}
	}

}
