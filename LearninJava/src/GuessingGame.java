import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        lblDrPaynesHilo.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblDrPaynesHilo.setHorizontalAlignment(SwingConstants.CENTER);
        lblDrPaynesHilo.setBounds(10, 37, 414, 24);
        getContentPane().add(lblDrPaynesHilo);

        JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100");
        lblGuessANumber.setHorizontalAlignment(SwingConstants.RIGHT);
        lblGuessANumber.setBounds(10, 98, 272, 14);
        getContentPane().add(lblGuessANumber);

        txtGuess = new JTextField();
        txtGuess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        txtGuess.setBounds(292, 95, 43, 20);
        getContentPane().add(txtGuess);
        txtGuess.setColumns(10);


        JButton btnGuess = new JButton("Guess!");
        btnGuess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        btnGuess.setBounds(172, 149, 89, 23);
        getContentPane().add(btnGuess);

        lblOutput = new JLabel("Enter a number above, and click Guess!");
        lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
        lblOutput.setBounds(10, 209, 414, 14);
        getContentPane().add(lblOutput);
    } // end GuessingGame()

    public static void main(String[] args) {
        GuessingGame theGame = new GuessingGame();
        theGame.newGame();
        theGame.setSize(new Dimension(450, 300));
        theGame.setVisible(true);
    } // end main
} // end public class GuessingGame
