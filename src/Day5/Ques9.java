package Day5;

import java.util.Scanner;

//Two numbers are entered through the keyboard. Write a program to find the value
//of one number raised to the power of another. (Do not use Java built-in method)
public class Ques9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //For loop
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter exponent: ");
        int pow = input.nextInt();

        int result = 1;
        for (int i = 0; i < pow; i++) {
            result = result * num;
        }
        System.out.println("Result: " + result);

    }
    }
