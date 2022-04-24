package Switch;

import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coefficient of x\u00b2: ");
        int a = input.nextInt();
        System.out.println("Enter coefficient of x: ");
        int b = input.nextInt();
        System.out.println("Enter constant: ");
        int c = input.nextInt();
        double d = (b * b) - (4 * a * c);

        switch (d >= 0 ? 1 : 0) {
            case 1 -> {
                double e = Math.sqrt(d);
                double root1 = (e - b) / (2 * a);
                double root2 = -(b + e) / (2 * a);
                System.out.println("Solution 1: " + root1 + "\nSolution 2: " + root2);
            }
            case 0 -> System.out.println("Result includes complex number.");
        }
    }
}
