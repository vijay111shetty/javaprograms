package Java_prog;

import java.util.Scanner;

/*
public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last number upto which the prime numbers should be printed");
		int n = sc.nextInt();
		int count =0;
		for (int i=1;i<n;i++)
		{
			for (int j=2;j<i;j++)
			{
				if (i%j==0)
				{
					count++;
					break;
				}
				else
				{
					System.out.println(i);
					break;
				}
			}
			
		}

	}

}
*/
/*
public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last number upto which the prime numbers should be printed");
		int n = sc.nextInt();
		
		for (int i=1; i < n; i++)
		{
			boolean isprime=true;
			for (int j=2; j < i ; j++)
			{
				if (i % j == 0)
				{
				 isprime = false;
				 break;
				}

			}
			if (isprime)
				 System.out.print (i+" ");
		}
		
		
		
		
		
	}
		
	}
*/
public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number upto which the prime numbers should be printed");
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			int count = 0;
			for (int j = 1; j < i + 1; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.print(i + " ");
		}

	}

}