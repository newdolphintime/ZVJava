package com.zvi.study.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

//字符流和字节流
/*
 * 字符流有两个基类
 * READER WRITER
 * 字节流
 * INPUTSTREAM OUTPUTSTREAM
 * 
 * */
public class IODemo {
	public static void main(String[] args) {
		filewriter();
		try {
			filereader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void filewriter() {
		// TODO Auto-generated method stub
		// 标准的异常处理
		FileWriter fw = null;
		try {
			fw = new FileWriter("demo.txt");
			// 并不会写到文件中 只是在流中存在
			fw.write("ni\r\nhao");
			// 刷新缓存
			// fw.flush();
			// colse之前会刷新
			// fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void filereader() throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("E:\\Books.0623\\《奸》系列（二）女警花.txt");
		int num=0;
		char[]buff=new char[1024];
		while ((num=fr.read(buff))!=-1) {
			
			System.out.print(new String(buff,0,num));
		}
		fr.close();

	}

}
