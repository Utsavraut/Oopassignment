import java.util.Scanner;

//Take 3 inputs from user and check :
//all are equal
//any of two are equal
//( use && || with ternary operator )
public class Question14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        boolean a=scanner.nextBoolean();
        System.out.println("Enter second number");
        boolean b=scanner.nextBoolean();
        System.out.println("Enter third number");
        boolean c=scanner.nextBoolean();
        String res;
        res=(a==b==c)? "all three are equal":"all are not equal";
        System.out.println(res);
    }
}
