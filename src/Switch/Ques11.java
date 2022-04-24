package Switch;

import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the month number:");
        int day= input.nextInt();

        switch (day) {
            case 1,3,5,7,8,10,12 -> System.out.println("No. of Days: 31");
            case 4,6,9,11 -> System.out.println("No. of Days: 30");
            case 2 -> System.out.println("No. of Days: 28");
            default -> System.out.println("Invalid Number!");
        }
    }
}
