//ex 4
import javax.swing.JOptionPane;
public class ShowTwoNumber {
	public static void main(String[] args) {
		String strNum1,strNum2;
		String strNotification = "you are just entered";
		
		strNum1 = JOptionPane.showInputDialog(null,
				"please input the 1st number ","input 1st number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + "and ";
		
		strNum2 = JOptionPane.showInputDialog(null,
				"please input the 2st number: ","input 2nd number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification+=strNum2;
		
		JOptionPane.showMessageDialog(null, strNotification,
				"show two number ",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
		
		
	}
}