package LABS_2;
import java.util.Scanner;
public class quadraticEqn {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a =qq.nextInt();
        System.out.println("Enter the value of b:");
        int b=qq.nextInt();
        System.out.println("Enter the value of c:");
        int c=qq.nextInt();
        qq.close();
        double num= (b*b-4*a*c)/4*a*a;
        double root= Math.pow(num, 0.5);
        System.out.println("The root is "+ root);
        if(b*b<4*a*c){
             System.out.println("roots are imaginary");
        }
        else if (b*b>4*a*c){
            System.out.println("roots are real");
        }
        else if (b*b==4*a*c){
            System.out.println("roots are equal");
         }
         else{
             System.out.println("default entry");
         }
    }
}
