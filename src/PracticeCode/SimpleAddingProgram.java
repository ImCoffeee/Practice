package PracticeCode;

import java.util.Scanner;

public class SimpleAddingProgram {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number : ");
        int num1 = input.nextInt();
        System.out.println("Input second number : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println();
        System.out.println("Sum : " + sum);

    }
}
