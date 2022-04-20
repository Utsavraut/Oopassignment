//Write a JAVA program to find maximum between two numbers
package ifelse;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a =scanner.nextInt();
        System.out.println("Enter the second number:");
        int b=scanner.nextInt();
        if (a>b){
            System.out.println("A is greater");

        }
        else {
            System.out.println("B is Greater");
        }
    }
}
