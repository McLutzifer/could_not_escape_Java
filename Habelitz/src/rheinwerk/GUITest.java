package rheinwerk;

import javax.swing.*;

public class GUITest {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Bitte Zahl eingeben");
        var alter = Integer.parseInt(eingabe);
        var doppel = alter * 2;
        JOptionPane.showMessageDialog(null, "Das Doppelte ist " + doppel + " !");
    }
}