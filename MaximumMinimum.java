import java.util.Scanner;

public class MaximumMinimum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:  ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number:  ");
		int num2 = scan.nextInt();
		System.out.println("Enter third number:  ");
		int num3 = scan.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + "  is greater. ");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + "  is grater. ");
		}
		else {
			System.out.println(num3 + "  is greater.");
		}
		scan.close();
	}

}
