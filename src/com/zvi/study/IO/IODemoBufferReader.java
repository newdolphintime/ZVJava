package com.zvi.study.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IODemoBufferReader {
public static void main(String[] args) throws IOException {
	FileReader fr =new FileReader("demo.txt");
	BufferedReader bufr =new BufferedReader(fr);
	String s1 =null;
	while((s1=bufr.readLine())!=null){
		 
		 System.out.println(s1);
	}
	
	
}
}
