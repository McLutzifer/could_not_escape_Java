package rheinwerk;

import javax.swing.*;

public class GUITest {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Steht ier der Text?");
        var alter = Integer.parseInt(eingabe);
    }
}
