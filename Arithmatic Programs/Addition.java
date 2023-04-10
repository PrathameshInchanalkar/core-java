
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for a");
		a = sc.nextInt(); // method of scanner class
		System.out.println("Enter a value for b");
		b = sc.nextInt();   // method of scanner class
		c = a + b;
		System.out.println("addition of two numbers=" +c);
	

	}

}
