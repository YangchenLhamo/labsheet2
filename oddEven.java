package LABS_2;
import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner ee=new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n=ee.nextInt();
        ee.close();
        if(n%2==0){
            System.out.println(n+" is even number.");
        }
        else{
            System.out.println(n+" is odd number.");
        }
    }
}
