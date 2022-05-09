package Day5;
//WAP to display the number of even numbers between 10 and 30.
public class Ques3 {
    public static void main(String[] args) {


    int i=10;
    int count=0;
    do{
        if (i%2==0){
            count++;
        }
        i++;
    }while(i<=30);
            System.out.println(count);


    }
}
