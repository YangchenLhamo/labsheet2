package LABS_2;

import java.util.Scanner;
public class Tax {
    public static void main(String[] args){
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter annula income");
        double tax_amount, total_tax;
        tax_amount=ss.nextDouble();
        if (tax_amount <=100000){
        System.out.println("No tax amount");
        }else if (tax_amount >= 100000 && tax_amount<= 150000){
            total_tax= 10/100* tax_amount;
            System.out.println("total tax amount is "+ total_tax);
        }else if (tax_amount >=150000 && tax_amount<=250000){
            total_tax=500+20/100*tax_amount;
            System.out.println("total tax amount is "+ total_tax);
        }else{
        total_tax= 2500+30/100*tax_amount;
        System.out.println("totaltax amount is "+ total_tax);
        }
ss.close();
    }
    
}
