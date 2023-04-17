import javax.swing.JOptionPane;
public class ChoosingOption{
	public static void main( String[] args) {
		int option =JOptionPane.showConfirmDialog(null, 
				"do u want to change to the first class ticket");
		
		JOptionPane.showConfirmDialog(null, "you are chosen: "
				+ (option==JOptionPane.YES_OPTION?"yes":"no"));
		System.exit(0);
	}
}