package LABS_2;
import java.util.Scanner;

public class changeCase {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter a letter.");
        char aa, bb, cc;
        aa=ss.next().charAt(0);
        if(aa>='A' && aa<='Z'){
            bb= Character.toLowerCase(aa);
            System.out.println("the lower case is "+bb);
        }
        else{
        cc=Character.toUpperCase(aa);
        System.out.println("the upper case is "+cc);
        }
        ss.close();
    }
}
