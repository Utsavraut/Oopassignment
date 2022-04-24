package Switch;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char upperLower = input.next().charAt(0);
        char check = Character.toLowerCase(upperLower);

        switch ((upperLower==check)?0:1) {
            case 1 -> System.out.println("Character is uppercase");
            case 0 -> System.out.println("Character is lowercase");
        }
    }
}
