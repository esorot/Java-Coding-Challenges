package com.smallestmultiple.euler;

import java.math.BigInteger;

public class SmallestMultiple {

	public static void main(String[] args) {
		
		BigInteger lcm = BigInteger.ONE;
		for(BigInteger i = new BigInteger("2"); i.compareTo(new BigInteger("21")) != 0 ; i = i.add(BigInteger.ONE)){
			lcm = LCM(lcm,i);
		}
		
		System.out.println("LCM:" + lcm.toString());

	}
	
	public static BigInteger LCM(BigInteger a, BigInteger b){
		BigInteger temp = a.gcd(b);
		temp = b.divide(temp);
		return a.multiply(temp);
	}

}
