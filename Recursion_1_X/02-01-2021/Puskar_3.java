package jan_02_2021;

import java.util.Scanner;

class Fibonacci
{
	static int fib(int n)
	{
		
		if(n==1)
		{
			return 1;
		}
		else if(n>1)
		{
			return fib(n-1)+fib(n-2);
		}
		return 0;
		
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n));
	}

}
