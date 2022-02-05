package LABS_2;
import java.util.Scanner;
public class floatingPoint {
    public static void main(String[] args) {
        Scanner ff= new Scanner(System.in);
        System.out.println("Enter a number:");
        float num1= ff.nextFloat();
        System.out.println("Enter another number:");
        float num2=ff.nextFloat();
        ff.close();
        float a= num1*100;
        float b= num2*100;
        if(a==b){
            System.out.println("they are same.");
        }
        else{
            System.out.println("they are different");
        }
    }
}
