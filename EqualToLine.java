	import java.util.Scanner;
public class EqualToLine {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("enter your LINE1 x1 cordinate");
			int LINE1x1 = scan.nextInt();
			System.out.println("enter your LINE1 y1 cordinate");
			int LINE1y1 = scan.nextInt();
			System.out.println("enter your LINE1 x2 cordinate");
			int LINE1x2 = scan.nextInt();
			System.out.println("enter your LINE1 y2 cordinate");
			int LINE1y2 = scan.nextInt();
			
			
			System.out.println("enter your LINE2 x1 cordinate");
			int LINE2x1 = scan.nextInt();
			System.out.println("enter your LINE2 y1 cordinate");
			int LINE2y1 = scan.nextInt();
			System.out.println("enter your LINE2 x2 cordinate");
			int LINE2x2 = scan.nextInt();
			System.out.println("enter your LINE2 y2 cordinate");
			int LINE2y2 = scan.nextInt();
			
			
			double LengthOfaLine1 = Math.sqrt(Math.pow(LINE1x2-LINE1x1, 2) + Math.pow(LINE1y2-LINE1y1, 2));
			System.out.println(LengthOfaLine1);
			double LengthOfaLine2 = Math.sqrt(Math.pow(LINE2x2-LINE2x1, 2) + Math.pow(LINE2y2-LINE2y1, 2));
			System.out.println(LengthOfaLine2);
			
		if (LengthOfaLine1 == LengthOfaLine2) {
			System.out.println("lines are equal");
		}
		else
			System.out.println("lines are not equal");

	}

}
