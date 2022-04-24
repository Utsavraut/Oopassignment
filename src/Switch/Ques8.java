package Switch;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the character ");
        char char1 ;
        char1= Character.toLowerCase(input.next().charAt(0));
        switch (char1) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> System.out.println("The character is a digit.");
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' -> System.out.println("The character is an alphabet.");
            default -> System.out.println("The character is a special character");
        }
    }
}
