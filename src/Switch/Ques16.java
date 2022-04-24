package Switch;

import java.util.Scanner;

public class Ques16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter CP: ");
        int cp = input.nextInt();
        System.out.print("Enter SP:");
        int sp = input.nextInt();

        switch (sp > cp ? 0 : 1) {
            case 1 -> System.out.println("Profit");
            case 0 -> System.out.println("Loss");
            default -> System.out.println("Neither profit nor loss");
        }
    }
}
