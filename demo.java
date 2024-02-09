import java.util.Scanner;
public class demo
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Side Value");
        int a = s1.nextInt();
        System.out.println("Enter length Value");
        int l = s1.nextInt();
        System.out.println("Enter breadth Value");
        int b = s1.nextInt();
        System.out.println("Enter height Value");
        int h = s1.nextInt();
        int ans1= a*a*a;
        int ans2=l*b*h;
        System.out.println("Volume of different shapes:");
        System.out.println("Volume of Cube= "+ans1);
        System.out.println("Volume of Cuboid= "+ans2);
    }
}
