package com.zvi.study.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Zv on 2017/04/02.
 */
public class testIo {
    public static void main(String[] args) throws IOException {
        BufferedReader bfre = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-----这一步----");
        String line = null;
        while ((line = bfre.readLine())!=null){
            System.out.println(line);
        }

    }

}
