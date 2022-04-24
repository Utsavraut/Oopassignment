package Switch;

import java.util.Scanner;

public class Ques19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = input.nextInt();
        hours = hours%24;
        System.out.println("Enter minutes: ");
        input.nextInt();

        switch (hours) {
            case 0,1,2,3,4,5,6,7,8,9,10,11 -> System.out.println("AM");
            case 13,14,15,16,17,18,19,20,21,22,23 -> System.out.println("PM");
        }
    }
}
