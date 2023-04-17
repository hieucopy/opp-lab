//ex 3.hellonamedialog. java

import javax.swing.JOptionPane;

public class hellonamedialog {
	
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("put your name");
		JOptionPane.showMessageDialog(null, "hi" +result + "!");
		System.exit(0);
		
	}
}