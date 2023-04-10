import java.util.Scanner;
class Atriangle
{
public static void main(String args[])
{
int b,h,a;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the breath and hight of triangle");

b = sc.nextInt();
h = sc.nextInt();

a = (b*h)/2;

System.out.println("Area of Triangle ="+a);
}
}