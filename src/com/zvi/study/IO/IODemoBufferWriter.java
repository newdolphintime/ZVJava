package com.zvi.study.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IODemoBufferWriter {
public static void main(String[] args) throws IOException {
	FileWriter fw =new  FileWriter("demo.txt");
	
	BufferedWriter bf = new BufferedWriter(fw);
	
	bf.write("aaaa");
	bf.newLine();
	bf.write("nihao");
	bf.flush();
	bf.close();
}
}
