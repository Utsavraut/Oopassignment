package Switch;

import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a1,a2,a3,sum;
        System.out.print("Enter the first angle: ");
        a1 = input.nextInt();
        System.out.print("Enter the second angle: ");
        a2 = input.nextInt();
        System.out.print("Enter the third angle: ");
        a3 = input.nextInt();
        sum=a1+a2+a3;
        switch (sum) {
            case 180 -> System.out.println("The triangle is valid.");
            default -> System.out.println("The triangle is not valid.");
        }
    }
}
