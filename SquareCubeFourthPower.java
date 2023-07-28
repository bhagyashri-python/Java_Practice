import java.util.Scanner;

public class SquareCubeFourthPower {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:  ");
		int i = scan.nextInt();
		System.out.println("Square: " + i * i);
		System.out.println("Cube: " + i * i * i);
		System.out.println("Fourth Power: " + i * i * i * i);
		scan.close();
	}

}
