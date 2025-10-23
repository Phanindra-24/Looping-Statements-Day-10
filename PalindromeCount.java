package com.codegnan.controlstatemnts;

import java.util.Scanner;

public class PalindromeCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int upperLimit = scanner.nextInt();
		int currentNumber = 1;
		int palindromeCount = 0;
		
		while(currentNumber <= upperLimit) {
	int originalNumber = currentNumber;
	int numberToReverse = originalNumber;
	int reversedNumber = 0;
	
	while(numberToReverse > 0) {
		int lastDigit = numberToReverse % 10;
		reversedNumber = reversedNumber*10 + lastDigit;
		numberToReverse = numberToReverse/10;
	}
	if (originalNumber == reversedNumber) {
		palindromeCount++;
	}
	currentNumber++;
		}
		System.out.println(palindromeCount);
		scanner.close();
	}

}
