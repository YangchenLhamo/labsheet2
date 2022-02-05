package LABS_2;
import java.util.Scanner;
public class studentAtt {
    public static void main(String[] args) {
        Scanner ss=new Scanner (System.in);
        System.out.println("number of class held:");
        double held=ss.nextInt();
        System.out.println("number of class student attended:");
        double attended=ss.nextInt();
        ss.close();
        double percentage= ((attended/held)*100);
        System.out.println("His/her percentage of attendence was "+percentage);
        
    }
}
