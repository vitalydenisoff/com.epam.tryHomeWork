package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MainTwo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            String[] numbers = str.split("\\s+");
            System.out.println(Arrays.toString(numbers));
            int count=0;
            for (int i = 0; i < numbers.length; i++) {
                if(  (numbers[i].matches("\\d+"))  ){
                    count++;
                }
            }
            System.out.println(count);
        }

}
