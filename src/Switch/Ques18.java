package Switch;

import java.util.Scanner;

public class Ques18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total units: ");
        int units = input.nextInt();
        double price;

        int unitsInt = units/50;
        switch (unitsInt) {
            case 0 -> price=units*0.5;
            case 1,2 -> price=25+(units-50)*0.75;
            case 3,4 -> price=25+75+(units-150)*1.2;
            default -> price=25+75+120+(units-250)*1.5;
        }
        double total=price+0.2*price;
        System.out.println("Total price: "+total);
    }
}
