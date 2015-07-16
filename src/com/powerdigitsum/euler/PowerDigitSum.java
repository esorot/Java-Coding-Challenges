package com.powerdigitsum.euler;

import java.math.BigInteger;

public class PowerDigitSum {

	public static void main(String[] args) {

		BigInteger big_int = new BigInteger("2");
		BigInteger sum = BigInteger.ZERO;
		int power = 1000;
		big_int = big_int.pow(power);
		String value = big_int.toString();
		
		//long sum = 0;
		for(int i = 0; i < value.length(); i++)
			sum = sum.add(new BigInteger(Integer.parseInt(value.charAt(i)+"")+""));
		System.out.println(sum);

	}

}
