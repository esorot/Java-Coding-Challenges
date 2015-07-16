package com.holeintext.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int inputCount ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		inputCount = Integer.parseInt(br.readLine());
		char text[]; 
		for(int i = 0; i < inputCount; i++){
		
			text = br.readLine().toCharArray();
			
			System.out.println(countHoles(text));
			
		}
		
	
	}
	
	static int countHoles(char[] text){
		int holes[][] = {{'A',1}, {'B',2},{'D',1},{'O',1},{'P',1},{'Q',1},{'R',1}};
		
		int count = 0;
		int length = text.length;
		
		for(int i = 0; i < length; i++){
			
			for(int j = 0; j < 7; j++){
					
				if((text[i] == (char)holes[j][0])){
					count += holes[j][1];
					break;
				}
			}
		}
		
		return count;
	}

}
