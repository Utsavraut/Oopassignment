package ifelse;

import java.util.Scanner;

//Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scanner.nextInt();
        if (n%5==0 & n%11==0){
            System.out.println("It is exactly divisible by 5 and 11");
        }
        else {
            System.out.println("It is not exactly divisible by 5 and 11");
        }
    }
}
