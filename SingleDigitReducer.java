package com.codegnan.controlstatemnts;

import java.util.Scanner;

public class SingleDigitReducer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = scanner.nextInt();
		
		while(number >= 10) {// if number is more than one single digit
			int digitSum = 0;// variable to store the sum of digits for this round
			while(number > 0) {// extract and sum all digits of the current number
				int lastDigit = number%10;//get the last digit
				digitSum+= lastDigit;//add it to the running total
				number = number/10;//remove the last digit
			}
			number = digitSum;
		}
		System.out.println(number);
		scanner.close();
	}

}
