package Switch;

import java.util.Scanner;

//Using switch statement Write a JAVA program to input marks of five subjects Physics,
//Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
//following:
//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F
public class Ques1 {
    public static void main(String[] args) {
        String[] subjects = {"Physics", "Chemistry", "Biology", "Maths", "Computer"};
        Scanner input = new Scanner(System.in);
        double marks = 0;

        for (String i : subjects) {
            System.out.print("Enter marks in " + i + ": ");
            marks = marks + input.nextDouble();
        }

        double total = marks;
        double percentage = total / 5;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        double percentage10=percentage/10;
        int intPer= (int) percentage10;

        switch (intPer) {
            case 9 -> System.out.println("Grade: A");
            case 8 -> System.out.println("Grade: B");
            case 7 -> System.out.println("Grade: C");
            case 6 -> System.out.println("Grade: D");
            case 4 -> System.out.println("Grade: E");
            default -> System.out.println("Grade: F");
        }
    }
}
