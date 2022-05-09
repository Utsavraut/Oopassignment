package Day5;

import java.util.Scanner;

//Write a program that prompts the user to input an integer and then outputs the
//number with the digits reversed. For example, if the input is 12345, the output
//should be 54321.
public class Ques10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int digit;
        int i;
        int rev=0;
        i=num;
        rev=0;
        do {
            digit = i % 10;
            rev = rev * 10 + digit;
            i/=10;
        } while (i>0);
        System.out.println(rev);

    }
}
