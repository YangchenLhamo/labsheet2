package LABS_2;
import java.util.Scanner;
public class leapYear {
public static void main(String[] args) {
    Scanner yy=new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year=yy.nextInt();
    yy.close();
    if(year%4==0 && year%100==0){
        System.out.println(year+" is a leap year.");
    }
    else{
        System.out.println(year +" is not a leap year.");
    }
}
    
}
