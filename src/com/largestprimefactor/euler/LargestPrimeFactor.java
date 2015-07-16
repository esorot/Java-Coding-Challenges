package com.largestprimefactor.euler;

import java.math.BigInteger;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		
		
		BigInteger num = new BigInteger("600851475143");
				
		BigInteger currentDivisorStore = new BigInteger("2");
		
		BigInteger largestDivisorStore = BigInteger.ONE;
		
		for(;num.compareTo(BigInteger.ONE) != 0;){
			BigInteger temp = num.mod(currentDivisorStore);
			if(temp.compareTo(BigInteger.ZERO) == 0){
				num  = num.divide(currentDivisorStore);
				largestDivisorStore = currentDivisorStore;
				currentDivisorStore = new BigInteger("2");
			}else{
				currentDivisorStore = currentDivisorStore.add(BigInteger.ONE);
			}
		}
		
		System.out.println(largestDivisorStore.toString());
		
	
	}
	

}
