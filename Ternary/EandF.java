package LABS_2.Ternary;
import java.util.Scanner;
public class EandF {
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        System.out.println("Enter a number.");
        int num=aa.nextInt();
        aa.close();
        String a=num%2==0 && num%5==0? num +" is both evenand divisible by five.":num+" is not both of them together";
        System.out.println(a);
    }
}
