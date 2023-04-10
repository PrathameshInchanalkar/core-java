import java.util.Scanner;
class Rectangle
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the length l & enter the width w");
float l = sc.nextFloat();
int w = sc.nextInt();
float area = l * w;
float peri = 2*(l + w);
System.out.println("Area of rectangle ="+area);
System.out.println("Peri of rectangle ="+peri);
}
}