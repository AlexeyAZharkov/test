package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        String e = in.next();

        short a = 22;
        short d = 10;
        char v = 's';
        int r = a + d;
        System.out.println(r + " - " + e);
        System.out.print("Hello world!");

        in.close();
    }
}