package ifelse;

import java.util.Scanner;

//Write a JAVA program to input month number and print number of days in that month.
public class Ques12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int month = input.nextInt();
        System.out.println("Enter year : ");
        int year = input.nextInt();
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
            System.out.println("No. of Days: 31");
        } else if (month==4||month==6||month==9||month==11) {
            System.out.println("No. of Days: 30");
        } else if (month==2) {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                System.out.println("No of days : 29");
            else {
                System.out.println("No of days :28");
            }
        }
        else {
            System.out.println("Invalid month number!");
        }
    }
}
