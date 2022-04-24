package Switch;

import java.util.Scanner;

public class Ques22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,x;
        System.out.print("Enter the number ");
        num= input.nextInt();
        x= num%2;
        switch (x) {
            case 0 -> num += 1;
        }
        System.out.println(num);
    }
}
