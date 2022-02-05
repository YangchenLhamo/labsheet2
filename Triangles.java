package LABS_2;
import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the first side.");
        int a=ss.nextInt();
        System.out.println("enter the second side.");
        int b=ss.nextInt();
        System.out.println("Enter the third side.");
        int c=ss.nextInt();
        ss.close();
        if(a==b && b==c){
            System.out.println("the given triangle is equilateral trinagle.");
        }
        else if(a==b || b==c || c==a){
            System.out.println("the given triangle is isosceles triangle.");
        }
        else{
            System.out.println("thr given triangle is scalene triangle.");
        }
    }
}
