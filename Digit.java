package LABS_2;
import java.util.Scanner;
public class Digit {
    
    public static void main(String[] args0){
      Scanner dd=new Scanner(System.in);
      System.out.println("enter a character:");
      char ch=dd.next().charAt(0);
      dd.close();
        if (ch>=65 && ch<=90) {
            System.out.println(ch+ " is a upper case letter");
        }
        else if(ch>=97 && ch<=122){
            System.out.println(ch+" is a lower case letter");
        }
        else if(ch>= 48 && ch<=57){
            System.out.println(ch +" is a digit");
        }
        else{
            System.out.println(ch + " is neither letter nor digit");
        }

    }
    
}
    

