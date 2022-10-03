package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainOne {
     public static void main(String[] args) throws IOException {
            FileInputStream inputStream=new FileInputStream("c:/test/info.txt");
            FileOutputStream fileOutputStream=new FileOutputStream("c:/test/Data.txt");
            byte [] buffer=new byte[1000];
            while(inputStream.available()>0){
                int count = inputStream.read(buffer);
                fileOutputStream.write(buffer,0,count);
            }
            inputStream.close();
            fileOutputStream.close();
        }

}
