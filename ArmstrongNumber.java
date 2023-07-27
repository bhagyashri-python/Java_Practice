package maybatch;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = myscan.nextInt();
		int sum = 0;
		int rem = 0;
		int temp = num;
		while(num!= 0)
		{
			rem = num % 10;
			sum += Math.pow(rem, 3);
			num = num / 10;
			
		}
		if ( temp == sum)
		{
			System.out.println("Number is armstrong");
		}
		else
			System.out.println("Number is not armstrong");
	myscan.close();
	}
	

}
