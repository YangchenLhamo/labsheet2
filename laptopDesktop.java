package LABS_2;
import java.util.Scanner;
public class laptopDesktop {
    public static void main(String[] args) {
        Scanner dd= new Scanner (System.in);
        System.out.println("Enter L for laptop and D for desktop.");
        char a=dd.next().charAt(0);
        dd.close();
        double purchase_amount, discount_amount, total_amount;
        purchase_amount=dd.nextDouble();
        if(a=='L'){
            if(purchase_amount<25000){
                discount_amount=0;
                System.out.println("The price of laptop is "+ purchase_amount);
            }
            else if(purchase_amount<=25000 && purchase_amount>=57000){
                discount_amount=0.05*purchase_amount;
                total_amount=purchase_amount-discount_amount;
                System.out.println("the proce for laptop with 5% discount is : Rs"+total_amount);
            }
            else if(purchase_amount<=57000 && purchase_amount>=100000){
                discount_amount=0.75*purchase_amount;
                total_amount=purchase_amount-discount_amount;
                System.out.println("The  price of laptop iwth 7.5% siscount is: Rs"+total_amount);
            }
            else{
                discount_amount= 0.1*purchase_amount;
                total_amount=purchase_amount- discount_amount;
                System.out.println("The price of laptop is "+total_amount);
            }
        }
            else if(a=='D'){
                if(purchase_amount<25000){
                    discount_amount=0.05*purchase_amount;
                    total_amount= purchase_amount-discount_amount;
                    System.out.println("The price of desktop is "+total_amount);
                }
                else if (purchase_amount>=25000 && purchase_amount<=57000){
                    discount_amount=0.75*purchase_amount;
                    total_amount= purchase_amount - discount_amount;
                    System.out.println("The price of desktop is "+total_amount);
                }
                else if(purchase_amount>=57000 && purchase_amount<=100000){
                    discount_amount= 0.1*purchase_amount;
                    total_amount=purchase_amount- discount_amount;
                    System.out.println("The price of desktop is "+total_amount);
                }
                else{
                    discount_amount= 0.15*purchase_amount;
                    total_amount=purchase_amount- discount_amount;
                    System.out.println("The price of desktop is "+total_amount);
                 }
            }
        else{
                System.out.println("Invalid Entry");
            }
    
    }

        

}
    
