package com.stackroute.pe1;

import java.util.Scanner;

public class StringRepeat {


    public static class Triming {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String");
            String input = sc.nextLine();
            System.out.println("Enter the number");
            int num = sc.nextInt();
            int length=input.length();
            System.out.print(input);
            for (int i = 0; i <num ; i++) {
                int temp=length-num;
                do {
                    char result = input.charAt(temp);
                    System.out.print(result);
                    temp++;
                }while (length!=temp);
            }
        }
    }
}
