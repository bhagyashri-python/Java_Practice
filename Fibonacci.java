package maybatch;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int range = scan.nextInt();
		int num = 0;
		int num1 = 1;
		int num2 = 0;
		System.out.println(num);
		System.out.println(num1);
		for(int i =2; i< range; ++i)
		{
			num2 = num + num1;
			System.out.println("" + num2);
			num = num1;
			num1 = num2;
		}
		
		scan.close();
	}

}
