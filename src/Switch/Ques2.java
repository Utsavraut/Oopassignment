package Switch;

import java.util.Scanner;

//JAVA Program to find the maximum between two numbers. Using the switch statement.
public class Ques2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Input Two Integer");
         int a=scanner.nextInt();
         int b=scanner.nextInt();
         int max=(a>b)?0:1;
        switch(max)
        {
            case 0:
                System.out.println("maximum number " + a);
                break;
            case 1:
                System.out.println("maximum number " + b);
                break;

        }

    }
}
