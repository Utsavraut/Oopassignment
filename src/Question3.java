import java.util.Scanner;

//Write ternary operator for the question no. 1.
public class Question3 {
    public static void main(String[] args) {
        int age=20;
        String vote;
        vote =(age>18)? "Can vote " : "Cannot vote";
        System.out.println(vote);
    }
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter location:");
        String location = scanner.nextLine();

        System.out.println("My name is: " + name+"\n"+"My age is:"+age+"\n"+"My address is:"+location);

    }*/
}
