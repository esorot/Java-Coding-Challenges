package com.palindromemult.euler;

public class PalindromeProduct {

	public static void main(String[] args) {
		
		int largest_palindrome = 0;
		int i_value = 999;
		int j_value = 999;
		for(int i = 999; i >= 100; i--){
			for(int j = 999; j >= 100; j--){
				int temp = i*j;
				if(isPalindrome(temp)){
					if(temp > largest_palindrome){
						largest_palindrome = temp;
						i_value = i;
						j_value = j;
					}
				}
			}
		}
		
		System.out.println("Largest palindrome from "+ i_value + " * " + j_value +" = " + largest_palindrome);

	}
	
	public static boolean isPalindrome(int n){
		int palindrome = n;
		int reverse = 0;
		
		while(palindrome != 0){
			int remainder = palindrome %10;
			reverse = reverse *10 + remainder;
			palindrome /= 10;
		}
		
		return reverse == n;
	}

}
