import java.util.Scanner;
public class HoursMinutesSeconds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter seconds: ");
		int seconds = scan.nextInt();
		int sec = seconds % 60;
		int hrs = seconds/ 60;
		int min = hrs % 60 ;
		hrs = hrs / 60;
		System.out.print( hrs + "hours"  +  min + "minutes "  +  sec  +  "seconds");
		scan.close();

}

}