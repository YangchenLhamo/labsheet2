package LABS_2;
import java.util.Scanner;
public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner ff=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=ff.nextInt();
        ff.close();
        if (n%5==0){
            System.out.println(n+" is divisible by 5.");
        }
        else {
            System.out.println(n+ " is not divisible by 5.");
        }
    }
}
