package LABS_2;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= aa.nextInt();
        System.out.println("Enter the second number");
        int b=aa.nextInt();
        aa.close();
        if(a>b){
            System.out.println(a+" is larger than "+b);
        }
        else{
            System.out.println(b+" is larger than "+a);
        }
    }
}
