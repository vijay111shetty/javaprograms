package Java_prog;

import java.util.Scanner;

public class SumOfPrimeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range to print sum of prime Nos....");
		int n = sc.nextInt();
		int sum=0;
		for (int i=1;i<n+1;i++)
		{
			int count=0;
			for (int j=1;j<i+1;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	

}
