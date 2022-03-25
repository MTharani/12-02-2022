package com.mavenproject3;

public class Nestedif {

	public static void main(String[] args) {
		int a =14;
		if (a>0)
		{
			System.out.println("Positive Number");
			if(a%2==0)
			{
				System.out.println("Even Number");
			}
			else
			{
				System.out.println("odd Number");
			}
		}
		else if (a<0)
		{
			System.out.println("Negative Number");
		}







	}

}
