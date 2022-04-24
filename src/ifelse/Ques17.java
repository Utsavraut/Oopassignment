package ifelse;

import java.util.Scanner;

//Write a JAVA program to find all roots of a quadratic equation
public class Ques17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coefficient of x\u00b2: ");
        int a = input.nextInt();
        System.out.println("Enter coefficient of x: ");
        int b = input.nextInt();
        System.out.println("Enter constant: ");
        int c = input.nextInt();
        double d = (b * b) - (4 * a * c);

        if (d>0) {
            double e = Math.sqrt(d);
            double root1 = (d - e) / (2 * a);
            double root2 = -(b + e) / (2 * a);

            System.out.println("Solution 1: " + root1 + "\nSolution 2: " + root2);
        } else {
            System.out.println("Result includes complex number.");
        }
    }
}
