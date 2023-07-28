import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scan.nextInt();
		if(num>=0)
			System.out.println(num + " is Positive");
		else
			System.out.println(num + " is Negative");
		scan.close();
	}

}
