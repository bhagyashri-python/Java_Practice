
package maybatch;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number: ");       
		int num = scan.nextInt();
		int rNum = 0;
		int rem;
		while(num != 0)
		{
			rem = num % 10;
			rNum = rNum * 10 + rem;
			num = num /10;
		}
		System.out.println("Reverse number is: " +  rNum);
		
		scan.close();
	}

}
