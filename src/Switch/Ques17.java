package Switch;

import java.util.Scanner;

public class Ques17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int salary = input.nextInt();

        double hra, da, grossSalary;
        int salaryInt = (salary-1)/10000;

        switch (salaryInt) {
            case 0 -> {
                hra = 0.2 * salary;
                da = 0.8 * salary;
            }
            case 1 -> {
                hra = 0.25 * salary;
                da = 0.9 * salary;
            }
            default -> {
                hra = 0.3 * salary;
                da = 0.95 * salary;
            }
        }

        grossSalary=salary+hra+da;

        System.out.println("Gross salary:  Rs."+grossSalary);
    }
}
