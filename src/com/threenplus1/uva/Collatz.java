package com.threenplus1.uva;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int i,j,maxValue = 0, start, end;
		
		
		
		do{
			maxValue = 0;
			i = sc.nextInt();
			j = sc.nextInt();
			if(i > j){
				start = j;
				end = i;
			}
			else{
				start = i;
				end = j;
			}
			for(int k = start; k <= end; k++)
				maxValue = Math.max(maxValue, collatz(k));
			System.out.println(i + " " + j + " " + maxValue);
			
		}
		while(sc.hasNext());
			
		
		

	}
	
	public static int collatz(int n){
		
		if(n == 1)
			return 1;
		
		if(n%2 == 0)
			return 1 + collatz(n/2);
		else
			return 1 + collatz(n*3 + 1);
			
		
	}

}
