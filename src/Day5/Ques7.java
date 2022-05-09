package Day5;

import java.util.Scanner;

//Write a program that prompts the user to input a positive integer. It should then
//print the multiplication table of that number.
public class Ques7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= scanner.nextInt();
        for (int i=1;i<=10;i++){
            int product=i*n;
            System.out.println(n + "X "+i+ "=" +product);

        }
    }
}

