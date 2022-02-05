package LABS_2.Ternary;
import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        Scanner ff=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=ff.nextInt();
        ff.close();
        String a=num%5==0? num +" is divisible by 5":num+" is not divisible by 5";
        System.out.println(a);
    }
}
