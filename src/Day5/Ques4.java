package Day5;
//WAP to display no. of even and no. of odd number between 10 and 30.
public class Ques4 {
    public static void main(String[] args) {
        int i=10;
        int count1=0;
        int count2=0;
        while(i<=30){
            if(i%2==0){
                count1++;
            }else{
                count2++;
            }
            i++;
        }
        System.out.println("Even no:"+count1+"\n Odd no:"+count2);
    }
}
