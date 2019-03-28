package it.busz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while (number!=0)
        {
            System.out.println(calculate(number));
            number=input.nextInt();
        }
    }

    private static String calculate(int num){
        return Integer.toString((2*num+1)*(num+1)*(num)/6);
    }
}
