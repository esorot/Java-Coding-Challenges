package com.turbosort.codechef;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

//import java.util.Random;

public class Main {
	
	static int MAXINPUT = 1000000;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		int inputLength = Integer.parseInt(br.readLine());
		
		int inputArray[] = new int[inputLength];
		
		//Random randInt = new Random();
		
		int data = 0;
		for(int i = 0; i < inputLength; i++){
			data = Integer.parseInt(br.readLine());
			//data = randInt.nextInt(MAXINPUT);
			//inputArray[data] += 1;
			inputArray[i] = data;
		}
		
		Arrays.sort(inputArray);
		
		for(int i = 0; i < inputLength; i++)
			out.println(inputArray[i]);
		
		
		/*for(int i = 0; i < MAXINPUT; i++){
			int j = inputArray[i];
			while(j-->0){
				out.println(i);
			}
		}*/
		
		out.flush();

	}

}

