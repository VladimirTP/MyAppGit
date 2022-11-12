package com.example.myappgit;

import java.util.Scanner;

public class Number {

    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a =");
        int a = in.nextInt();
        printInConsole (a);


    }

    static void printInConsole(int a) {



        switch (a) {
            case 1 : System.out.println("это 1");
                break;
            case 3 : System.out.println("это 3");
                break;
            default : System.out.println("это другое число");

        }
    }

}
