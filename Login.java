import javax.swing.JOptionPane;

public class Login {

    public static void main(String[] args) {
        final String CORRECT_USERNAME = "Hero";
        final String CORRECT_PASSWORD = "Zero";

        // ask for username first, then password
        String username = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");

        // if they hit cancel the value is null, so check that before comparing
        // using .equals() since == doesn't compare the actual text of strings
        if (username != null && password != null
                && username.equals(CORRECT_USERNAME)
                && password.equals(CORRECT_PASSWORD)) {
            JOptionPane.showMessageDialog(null, "Access Granted");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Credentials");
        }
    }
}
