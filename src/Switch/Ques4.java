package Switch;

import java.util.Scanner;

//JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch
//statement
public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scanner.nextInt();
        int sec=(a%5==0)?0:(a%11==0)?1:2;
        switch (sec){
            case 0 -> System.out.println("Exactly divisible");
            case 1 -> System.out.println("Not exactly divisible");
            default -> System.out.println("Enter valid number");
        }
    }
}
