package com.mavenproject3;

public class Switch {

	public static void main(String[] args) {
		int number = 8;
		char ch='b', spchar = '$';
		switch(number)
		{
		case 8:
			System.out.println("It is Digit");
			break;
		case 'b':
			System.out.println("It is Character");
			break;
		case '$':
			System.out.println("It is Special Character");
			break;
		default:
			System.out.println("Invalid");
		}

	}

}
