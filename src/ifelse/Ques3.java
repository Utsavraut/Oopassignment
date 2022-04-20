package ifelse;

import java.util.Scanner;

//Write a JAVA program to check whether a number is negative, positive or zero.
public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        if(n>0){
            System.out.println(n+"\tIs a positive number");
        }
        else if(n<0){
            System.out.println(n+ "\tIs a negative number");
        }
        else{
            System.out.println("It is zero");
        }
    }
}
