import java.util.Scanner;
class MethodOver
{
    void Area(double r)
    {
        double Ac = 3.14*r*r;
        System.out.println("Area of circle = "+Ac);
    }
    void Area(int l,int b)
    {
        int Ar = l*b;
        System.out.println("Area of rectangle = "+Ar);
    }
    void Area(double bs,double h)
    {
        double At = 0.5*bs*h;
        System.out.println("Area of triangle ="+At);
        
    }
}
public class MethodOverloadingjava
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        MethodOver mo = new MethodOver();
        System.out.println("Enter radius of circle: ");
        double x = sc.nextDouble();
        mo.Area(x);
        System.out.println("Enter length and breadth of rectangle: ");
        int y = sc.nextInt();
        int z = sc.nextInt();
        mo.Area(y,z);
        System.out.println("Enter base & height of triangle: ");
        double p =sc.nextDouble();
        double q = sc.nextDouble();
        mo.Area(p,q);
        
    }
}
