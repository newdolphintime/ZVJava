package com.zvi.study.Socket;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Zv on 2017/04/03.
 */
public class HttpClients implements ActionListener{

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://www.baidu.com");
        URLConnection connection = url.openConnection();
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        byte[] bytes = new byte[1024];
        int leng = 0;
        while ((leng = inputStream.read(bytes)) != -1) {
            String line = new String(bytes, 0, leng);
            System.out.println(line);
        }
        ActionListener actionListener = new HttpClients();
        new Timer(10000,actionListener).start();

        JOptionPane.showMessageDialog(null,"quit?");
        System.exit(0);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int count= 0;
        System.out.println(++count);
        Toolkit.getDefaultToolkit().beep();
    }
}
