package Java_prog;

import java.util.Scanner;

public class SumofPrimenums1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number upto which to add prime numbers");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			SumofPrimenums1 t=new SumofPrimenums1();
			if(t.isPrime(i))
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	public boolean isPrime(int i)
	{
		if(i==1) return false;
		for (int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				return false;
			}
		}
		return true;
	}

}
