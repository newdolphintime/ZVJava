package com.zvi.study.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos =null;
		FileInputStream fis =null;
		try{
			fos =new FileOutputStream("5.jpg");
			fis = new FileInputStream("E:\\image00133-134.jpg");
			byte[] buf =new byte[1024];
			int len=0;
			while((len = fis.read(buf))!=-1){
				fos.write(buf,0,len);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			//throw new RuntimeException("复制美女失败");
		}
		finally {
			try{
				if(fis!=null)
					fis.close();
			}
			catch(IOException e){
				throw new RuntimeException("关闭失败");
			}
			try{
				if(fis!=null)
					fos.close();
			}
			catch(IOException e){
				throw new RuntimeException("关闭失败");
			}
		}
	}
	
}
