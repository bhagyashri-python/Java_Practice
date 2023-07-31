import java.util.Scanner;
import java.math.*;
public class Arithmatic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int num1 = scan.nextInt();
		System.out.println("Enter second integer: ");
		int num2 = scan.nextInt();
		System.out.println("Sum of two integers : " +  (num1 + num2));
		System.out.println("Difference of two integers : " +  (num1  - num2));
		System.out.println("Product of two integers : " +  (num1  * num2));
		System.out.println("Average of two integers : " +  (double)(num1  + num2)/2);
		System.out.println("Distance of two integers : " +  (num1 - num2));
		System.out.println("Maximum between two integers : " +  Math.max(num1, num2));
		System.out.println("Minimum between two integers : " +  Math.min(num1, num2));
		scan.close();
	}

}



























/*int i = 10;
System.out.println(i); 
int j = ++i; 
System.out.println(j);
int i = 10; 
int j = i++ + ++i; 
System.out.println(i); 
System.out.println(j);*/