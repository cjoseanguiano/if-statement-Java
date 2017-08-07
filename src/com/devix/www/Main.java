package com.devix.www;

public class Main {

    public static void main(String[] args) {
        int number = 5;
        if (isOdd(number)) {
            System.out.println(true);
        }
    }

    private static boolean isOdd(int number) {
        return (number % 2) != 0;
    }
}
