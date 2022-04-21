package ifelse;

import java.util.Scanner;

//Write a JAVA program to count total number of notes in given amount.
public class Ques13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a value:");
        int amount =scanner.nextInt();
        int total;
        if(amount%5==0){
            total=amount/5;
            System.out.println(total);
        }else{
            System.out.println("Invalid Figures");
        }
    }

}
