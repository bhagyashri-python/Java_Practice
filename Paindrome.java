package maybatch;
import java.util.Scanner;
public class Paindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		int temp = num;
		int rem =0;
		int sum = 0;
		while(num!=0)
		{
			rem = num % 10;
			sum = (sum * 10 ) + rem;
			num= num / 10;
		}
		if (temp == sum)
		{
			System.out.println("Given number is palindrome");
		}
		else
			System.out.println("Given number is not palindrome");
		scan.close();
	}

}
