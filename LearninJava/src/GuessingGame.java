import javax.swing.*;

public class GuessingGame extends JFrame {
    private JTextField txtGuess;
    private JLabel lblOutput;
    private int theNumber;

    public void checkGuess(){
        String guessText = txtGuess.getText();
        String message = "";
        try {
            int guess = Integer.parseInt(guessText);
            if (guess < theNumber)
                message = guess + " is too low. Try again.";
            else if (guess > theNumber)
                message = guess + " is too high. Try again";
            else {
                message = guess +
                        " is correct. You win! Let's play again.";
                newGame();
            }
        } catch (Exception e) {
            message = "Enter a whole number between 1 and 100";
        } finally {
            lblOutput.setText(message);
            txtGuess.requestFocus();
            txtGuess.selectAll();
        }
    } // end checkGuess

    public void newGame() {
        theNumber = (int)(Math.random() * 100 + 1);
    } // end newGame

    public GuessingGame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Dr. Payne's Hi-Lo Guessing Game");
        getContentPane().setLayout(null);

        JLabel lblDrPaynesHilo = new JLabel("Dr. Payne's Hi-Lo Guessing Game");

    } // end GuessingGame()
}
