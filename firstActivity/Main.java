// Exercise No. 1 DATASTRUC21
package firstActivity;
import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st integer: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd integer: ");
		int num2 = sc.nextInt();
		System.out.println("Sum: " + (num1+num2) + "\nDifference: " + (num1-num2) + "\nProduct: " + (num1*num2) + "\nAverage: " + (num1 + num2)/2);
		System.out.println("Max integer: " + Math.max(num1,num2) + "\nMin integer: " + Math.min(num1, num2));
	}
}
		

