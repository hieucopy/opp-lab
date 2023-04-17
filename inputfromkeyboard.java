import java.util.Scanner;
public class inputfromkeyboard{
	public static void main( String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("ten ban la gi");
		String strName =keyboard.nextLine();
		System.out.println("bao nhieu tuoi roi");
		int iAge =keyboard.nextInt();
		System.out.println("cao bao nhieu");
		double height=keyboard.nextDouble();
		System.out.println("mrs/ms "+strName+","+iAge+"years old"
				+ "your height í"+ height);
	}
}