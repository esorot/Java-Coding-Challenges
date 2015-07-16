package com.smallfactorial.codechef;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		BigInteger factorial ;
		int input;
		for(int i = 0; i < n; i++){
			input = Integer.parseInt(br.readLine());
			factorial = BigInteger.valueOf(input);
			for(int j = input -1; j > 0; j--){
				factorial = factorial.multiply(BigInteger.valueOf(j));
			}
			System.out.println(factorial);
			
		}
		
	}

}
