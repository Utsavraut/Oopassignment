package Day5;

import java.util.Scanner;

//Write a program to find the factorial value of any number entered through the
//keyboard.
public class Ques8 {
    public static void main(String[] args) {
        int  count2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int j = input.nextInt();
        while (j>0) {
            count2=count2*j;
            j--;
        }
        System.out.println("Factorial: "+count2);
    }

}
