package LABS_2;
import java.util.Scanner;
public class absoluteNum {
    public static void main(String[] args) {
        Scanner aa= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=aa.nextInt();
        aa.close();
        int absolute_num;
        if(num<0){
            absolute_num= num*-1;
        }
        else{
            absolute_num=num;
        }
        System.out.println(absolute_num);
    }
}
