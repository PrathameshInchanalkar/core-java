import java.util.Scanner;
class Areasquare
{
public static void main(String args[])
{
int area,B;
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of side");

B = sc.nextInt();

area = B*B;
System.out.println("the area of square = " +area);
}
}