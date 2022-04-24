package Switch;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the week number:");
        int day= input.nextInt();

        switch (day) {
            case 1 -> System.out.println("It is Sunday");
            case 2 -> System.out.println("It is Monday");
            case 3 -> System.out.println("It is Tuesday");
            case 4 -> System.out.println("It is Wednesday");
            case 5 -> System.out.println("It is Thursday");
            case 6 -> System.out.println("It is Friday");
            case 7 -> System.out.println("It is Saturday");
            default -> System.out.println("Invalid Number!");
        }
    }
}
