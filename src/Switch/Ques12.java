package Switch;

import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int money = input.nextInt();
        switch (money % 5) {
            case 0 -> {
                int amount = money / 5;
                System.out.println("No. of 5 rupee notes: " + amount);
            }
            default -> System.out.println("Invalid amount for 5 rupee note.");
        }
    }
}
