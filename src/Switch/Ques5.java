package Switch;

import java.util.Scanner;

//JAVA Program to check whether a year is a leap year or not. Using switch statement
public class Ques5 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter year: ");
            int year = input.nextInt();

            switch (year%4) {
                case 0 : switch (year%100) {
                    case 0 :
                        switch (year % 400) {
                            case 0 -> System.out.println("Leap Year");
                            default -> System.out.println("Normal Year");
                        }
                        break;
                    default:
                        System.out.println("Leap Year");
                        break;
                }break;
                default:
                    System.out.println("Normal Year");
                    break;
            }
        }

}
