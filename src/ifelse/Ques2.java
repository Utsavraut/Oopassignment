package ifelse;
//Write a JAVA program to find maximum between three numbers.
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a =scanner.nextInt();
        System.out.println("Enter the second number:");
        int b=scanner.nextInt();
        System.out.println("Enter the third number:");
        int c=scanner.nextInt();
        if (a>b&a>c){
            System.out.println("A is greater");

        }
        else if(b>c&b>a) {
            System.out.println("B is Greater");
        }
        else {
            System.out.println("C is greater");
        }
    }
}