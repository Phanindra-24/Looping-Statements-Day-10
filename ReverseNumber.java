package com.codegnan.controlstatemnts;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int originalNumber = number;
		int reversedNumber = 0;
		while (number !=0) {
			int remainder = number%10;
			reversedNumber = reversedNumber * 10 + remainder;
			 number /= 10;
			
		}
		if(reversedNumber < 0 ) {
			reversedNumber = -reversedNumber;
		}
		System.out.println("Reverse of a given number is: "+originalNumber+ "=" + reversedNumber);
		scanner.close();
	}

}
