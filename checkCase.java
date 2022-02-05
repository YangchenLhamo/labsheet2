package LABS_2;
import java.util.Scanner;
public class checkCase {
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        System.out.println("Enter a character");
        char b=cc.next().charAt(0);
        cc.close();
        if(b>='a' && b<='z'){
            System.out.println(b+ " is in lower case.");
        }
        else if (b>='A' && b<='Z'){
            System.out.println(b +" is in lower case");
        }
        else{
            System.out.println(b+" is in other form.");
        }
    }
}
