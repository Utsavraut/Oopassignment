package Day5;
//Write a program to calculate the sum of first 10 natural number.
public class Ques6 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=10){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum is:"+sum);
    }
}
