package Switch;

import java.util.Scanner;

public class Ques21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (a): ");
        int a = input.nextInt();
        System.out.println("Enter another number (b): ");
        int b = input.nextInt();
        int temp;

        switch (a == b ? 0 : 1) {
            case 1 -> {
                temp = b;
                b = a;
                a = temp;
                System.out.println("Swapped value of a: " + a);
                System.out.println("Swapped value of b: " + b);
            }
            case 0 -> System.out.println("Numbers are equal!");
        }
    }
}
