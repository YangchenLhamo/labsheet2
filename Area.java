package LABS_2;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner ss=new Scanner (System.in);

        // for rectangle
        System.out.println("Enter the length");
        int a=ss.nextInt();
        System.out.println("Enter the breadth");
        int b=ss.nextInt();
        int area=a*b;
        System.out.println("the area od triangle is "+area);
        
        // for circle
        System.out.println("entr the radious of cirlcle");
        double r=ss.nextDouble();
        double Area=3.14*r*r;
        System.out.println("the area of circle is "+Area);

        // for square
        System.out.println("enter the side of triangle:");
        int s=ss.nextInt();
        int s_area=s*s;
        System.out.println("The area of square is: "+s_area);
        ss.close();

    }
}
