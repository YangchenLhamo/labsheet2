package LABS_2.Ternary;
import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner ee=new Scanner(System.in);
        System.out.println("enter a number");
        int num=ee.nextInt();
        ee.close();
        String result=num%2==0?num+" is even number": num+" is odd number";
        System.out.println(result);
    }
}
