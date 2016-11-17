package com.zvi.study.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemoOutputStream {
	public static void main(String[] args) throws IOException {
		//writeFile();
		readFile();
	}

	private static void writeFile() throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("demo.txt");
		fos.write("zhangwei".getBytes());
		fos.close();
	}
	private static void readFile() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis =new FileInputStream("demo.txt");
		int ch=0;
		while((ch=fis.read())!=-1){
			System.out.println((char)ch);
		}
		fis.close();
	}
}
