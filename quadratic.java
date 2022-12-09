//  Develop a Java program to create an abstract class named Shape that contains two integers and an empty method named printArea( ). Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape. Each one of the classes contains only the method printArea( ) that prints the area of the given shape.
import java.util.Scanner;

public class quadratic{
    public static void main(String[] args) {
        int a,b,c;
        Scanner s =new Scanner(System.in);
        System.out.println("enter the a coefficients of quadratic equation");
        a=s.nextInt();
        System.out.println("enter the b coefficients of quadratic equation");
        b=s.nextInt();
        System.out.println("enter the c coefficients of quadratic equation");
        c=s.nextInt();
        double d=Math.sqrt(b*b-4*a*c),r1,r2;
        if (d>0) {
            System.out.println("Roots are real and distinct");
            r1=((-b)+d)/(2*a);
            r2=((-b)-d)/(2*a);
            System.out.println("Roots of equation are "+r1+" "+r2);
        } else if(d==0) {
            System.out.println("Roots are real and same");
            r1=(-b)/(2*a);
            System.out.println("Roots of equation are "+r1);
        } else{
            System.out.println("Roots are imaginary");
        }
        s.close();
    }
}
