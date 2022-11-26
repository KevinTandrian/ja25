package javaapplication25;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class JavaApplication25
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("a=");
        a = input.nextInt();
        System.out.print("b=");
        b = input.nextInt();
        System.out.print("c=");
        c = input.nextInt();
        
    if (a==b && a==c && b==c)
    {
        System.out.println("segitiga sama sisi");
    }
    else if (a==b || a==c || b==c)
    {
        System.out.println("segitiga sama kaki");
    }
    else 
    {
        System.out.println("segitiga beda sisi");
    }
    
    }
}
