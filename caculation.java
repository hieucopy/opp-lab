//ex 2.2.5
import java.util.Scanner;


public class caculation {
	public static void main(String[] args) {
		String strNum1,strNum2;
		Scanner scanf = new Scanner(System.in);
		System.out.println("enter 1st number :");
		strNum1 =scanf.nextLine();
		System.out.println( "enter 2nd number :");
		strNum2 =scanf.nextLine();
		Double num1= Double.parseDouble(strNum1);
		Double num2= Double.parseDouble(strNum2);
		scanf.close();
		System.out.printf( "sum %.2f \n",num1+num2);
		System.out.printf( "difference %.2f \n",num1-num2);
		System.out.printf( "product %.2f \n",num1*num2);
		System.out.printf( "quotient %.2f \n",num1/num2);
		
		
	}
}