package LABS_2;
import java.util.Scanner;
public class daysOfMonth {
    public static void main(String[] args) {
        Scanner mm=new Scanner(System.in);
        System.out.println("Enter year and month");
        int year=mm.nextInt();
        int month=mm.nextInt();
        String nameofmonth="0";
        int numberofdays=0;
        switch(month){
            case 1:
            nameofmonth="Janaury";
            numberofdays=31;
            break;
            case 2:
            nameofmonth="Febraury";
            if(year%4==0){
            numberofdays=29;
            }else{
            numberofdays=28;
            }
            break;
            case 3:
            nameofmonth="March";
            numberofdays=31;
            break;
            case 4:
            nameofmonth="April";
            numberofdays=30;
            break;
            case 5:
            nameofmonth="May";
            numberofdays=31;
            break;
            case 6:
            nameofmonth="June";
            numberofdays=30;
            break;
            case 7:
            nameofmonth="July";
            numberofdays=31;
            break;
            case 8:
            nameofmonth="August";
            numberofdays=31;
            break;
            case 9:
            nameofmonth="September";
            numberofdays=30;
            break;
            case 10:
            nameofmonth="October";
            numberofdays=31;
            break;
            case 11:
            nameofmonth="November";
            numberofdays=30;
            break;
            case 12:
            nameofmonth="December";
            numberofdays=31;
            break;
         }
         System.out.println(nameofmonth+" "+year+" has "+numberofdays+" days");
         mm.close();
    }
}
