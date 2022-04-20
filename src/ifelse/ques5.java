package ifelse;

import java.util.Scanner;

//Write a JAVA program to check whether a number is even or odd.
public class ques5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scanner.nextInt();
        if (n%2==0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is a odd number");
        }
    }
}
