package com.minvaluebotharray.codility;

import java.util.*;

public class MinBothArray {
	
	public static int find(int A[], int B[]){
		Set myset = new HashSet();
		
		for(int i : A)
			myset.add(i);
		
		Arrays.sort(B);
		int prev = B[0];
		for(int i = 1; i < B.length; i++){
			int current = B[i];
			if(current != prev){
				boolean added = myset.add(i);
				if(!added)
					return B[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = new int [2];
		int B[] = new int [2];
		A[0] = 2; A[1] = 1;
		B[0] = 3; B[1] = 3;
		int c = find(A,B);
		System.out.println(c);

	}

}
