package Java_prog;

import java.util.Scanner;

public class Binary2Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);;
		System.out.println("Enter a Binary number to convert it to decimal");
		long n=sc.nextLong();
		long dec=0;
		int count=0;
		while(n>0)
		{
			long r=n%10;
			dec=dec+pow(2,count);
			count++;
			n=n/10;
		}System.out.println(dec);

	}
	public static int pow(int n,int p) {
		int pw=1;
		while(p>0) {
			pw=pw*n;
			p--;
		}return pw;
	}//111100001111


}
