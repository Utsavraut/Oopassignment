package Switch;

import java.util.Scanner;

//JAVA Program to find the maximum between three numbers. Using the switch statement
public class Ques3 {
    public static void main(String[] args) {
        Scanner max=new Scanner(System.in);
        System.out.println("Enter  first number A:");
        int a= max.nextInt();
        System.out.println("Enter second number B:");
        int b= max.nextInt();
        System.out.println("Enter Third number c:");
        int c= max.nextInt();

        int ixt = (a > b && a>c)?0:(b>a && b>c)? 1:(c>a && c>b) ? 2 : 3;
        switch(ixt){
            case 0 -> System.out.println("A is greater");
            case 1 -> System.out.println("B is greater");
            case 2 -> System.out.println("C is greater");
            default -> System.out.println("All are Equal");
        }

    }

}
