package LABS_2;
import java.util.Scanner;
public class leastPoint {
    public static void main(String[] args) {
        Scanner ll=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1=ll.nextInt();
        System.out.println("Enter another number:");
        int num2=ll.nextInt();
        ll.close();
        int a=num1%1000;
        int b=num2%1000;
        if(a==b){
            System.out.println("they are same.");
        }
        else{
            System.out.println("they are different");
        }
    }
}
