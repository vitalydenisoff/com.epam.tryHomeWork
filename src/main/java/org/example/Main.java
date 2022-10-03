package org.example;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

    static final Logger logger = LogManager.getLogger();


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        System.out.println("The length of the first line is " + s1.length());
        System.out.printf("The length of the second line is = %d \n", s2.length());
////        try (PrintWriter pr = new PrintWriter(System.out)) {
//            pr.println("The length of the third line is " + s3.length());
//
//            logger.log(Level.INFO, "start prg");
//
//
//        }
   }
        public int multTen(int n) {
            logger.log(Level.INFO, "in method");
            return n * 10;


    }


}

