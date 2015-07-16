package com.frogjump.codibility;

public class FrogJump {
	
	public static int frogjump(int x, int y, int D){
		return (int)Math.ceil((y-x)/(D*1.0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Froggy:"+frogjump(10,85,30));

	}

}
