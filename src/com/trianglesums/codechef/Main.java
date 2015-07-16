package com.trianglesums.codechef;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class Main {

	static int MAXLINES = 100;
	
	public static void main(String[] args) throws Exception, IOException {
		
		int inputCount ;
		int data;
		
		Reader reader = new Reader(System.in);
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		inputCount = reader.readInt();
		
		//Test cases loop
		while(inputCount-->0){
			int rowsCount = reader.readInt();
			
			int arr[][] = new int[rowsCount][rowsCount];
			
			for(int i = 0; i < rowsCount; i++)
				for(int j = 0; j <= i; j++)
					arr[i][j] = reader.readInt();
			

			int maxSum = getMaxSum(arr,rowsCount);
			
			out.println(maxSum);
			
			out.flush();
			
			
		}
		

	}
	
	public static int getMaxSum(int arr[][], int rowsCount){
		

		for(int i = rowsCount -2 ; i >= 0; i--){
			for(int j = i; j >= 0; j--){
				
				arr[i][j] = Math.max(arr[i][j] + arr[i+1][j],
						 arr[i][j] + arr[i+1][j+1]);
			}
		}
		
		return arr[0][0];
		
	}

}

class Reader {
	private static final int BUFSIZE = 0x10000;
	private final byte[] buffer = new byte[BUFSIZE];
	private final ByteBuffer bb = ByteBuffer.wrap(buffer);
	private final FileChannel channel;

	int bufSize = -1; // non empty buffer
	int bufOffset = 0; // non valid buffer

	private FileInputStream getFileInputStream(InputStream in) {
		try {
			if (in instanceof BufferedInputStream) {
				Field field = in.getClass().getSuperclass()
						.getDeclaredField("in");
				field.setAccessible(true);
				return (FileInputStream) field.get(in);
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return (FileInputStream) in;
	}

	Reader(InputStream in) throws IOException {
		this.channel = this.getFileInputStream(in).getChannel();
	}

	void fetchBuffer() throws IOException {
		bb.clear();
		bufSize = channel.read(bb);
		bufOffset = 0;
	}

	boolean isFinished() {
		return bufSize <= 0;
	}

	private int peek() throws IOException {
		if (bufOffset < bufSize)
			return buffer[bufOffset];
		fetchBuffer();
		if (bufSize > 0)
			return buffer[0];
		return -1;
	}

	private void skipSpace() throws IOException {
		int v = peek();
		while (v <= ' ' && v != -1) {
			bufOffset++;
			v = peek();
		}
	}

	void nextLine() throws IOException {
		int v = peek();
		while (v != -1 && v != '\n' && v != '\r') {
			bufOffset++;
			v = peek();
		}
		if (v == '\r') {
			bufOffset++;
			v = peek();
			if (v == '\n')
				bufOffset++;
		} else if (v == '\n') {
			bufOffset++;
			v = peek();
			if (v == '\r')
				bufOffset++;
		}
	}

	int readInt() throws IOException {
		skipSpace();
		int result = 0;
		int v = peek();
		while (v > ' ') {
			result = result * 10 + v - '0';
			bufOffset++;
			v = peek();
		}
		return result;
	}

}
