package Switch;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character ");
        char char1;
        char1 = Character.toLowerCase(input.next().charAt(0));
        switch (char1) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("The alphabet is a vowel.");
            default -> System.out.println("The alphabet is a consonant.");
        }
    }
}
