package LABS_2;
import java.util.Scanner;
public class bothEvenFive {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter a number.");
        int n=ss.nextInt();
        ss.close();
        if(n%2==0 && n%5==0){
            System.out.println(n+" is both divisible by five and even.");
        }
        else if(n%2==0){
            System.out.println(n+" is  an even number.");
        }
        else if(n%5==0){
            System.out.println(n+" is divisible by five.");
        }
        else{
            System.out.println(n+" is neither even nor divisible by five.");
        }
    }
}
