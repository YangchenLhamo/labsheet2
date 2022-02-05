package LABS_2;
import java.util.Scanner;
public class armstrongNum {
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=aa.nextInt();
        aa.close();
        int rem, sum=0;
        int temp=num;
        while(temp!=0){
            rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
        }
        if (num==sum){
            System.out.println("the given number is armstrong.");
        }
        else{
            System.out.println("the number is not armstrong");
        }
    }
}
