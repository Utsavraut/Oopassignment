package Switch;

import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int a = input.nextInt();
        System.out.print("Enter second side: ");
        int b = input.nextInt();
        System.out.print("Enter third side: ");
        int c = input.nextInt();

        switch ((a==b&&a==c)?0:1) {
            case 0:
                System.out.println("Triangle is equilateral!");
                break;
            case 1:
                switch ((a == b || a == c || b == c) ? 0 : 1) {
                    case 0 -> System.out.println("Triangle is isosceles!");
                    case 1 -> System.out.println("Triangle is scalene!");
                }break;
        }
    }
}
