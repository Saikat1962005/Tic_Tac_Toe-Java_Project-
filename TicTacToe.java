package TICTACTOE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe {

    private JFrame frame;
    private JButton[][] buttons;
    private char currentPlayer;
    private Random random;

    public TicTacToe() {
        this.frame = new JFrame("Tic Tac Toe");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(new GridLayout(3, 3));
        this.buttons = new JButton[3][3];
        this.currentPlayer = 'X';
        this.random = new Random();
        initializeButtons();
        frame.setSize(600, 600); // Set the size of the frame
        frame.setVisible(true);
    }

    private void initializeButtons() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = new JButton("-");
                button.setFont(new Font("Arial", Font.BOLD, 50)); // Set the font sizen
                button.addActionListener(new ButtonListener());
                buttons[i][j] = button;
                frame.add(button);
            }
        }
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            if (button.getText().equals("-")) {
                button.setText(String.valueOf(currentPlayer));
                if (hasWon(currentPlayer)) {
                    JOptionPane.showMessageDialog(frame, "Player " + currentPlayer + " wins!");
                    frame.dispose();
                } else if (isBoardFull()) {
                    JOptionPane.showMessageDialog(frame, "It's a draw!");
                    frame.dispose();
                } else {
                    makeComputerMove();
                }
            }
        }
    }

    private void makeComputerMove() {
        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (!buttons[row][col].getText().equals("-"));
        buttons[row][col].setText(String.valueOf(getNextPlayer()));
        if (hasWon(getNextPlayer())) {
            JOptionPane.showMessageDialog(frame, "Computer wins!");
            frame.dispose();
        } else if (isBoardFull()) {
            JOptionPane.showMessageDialog(frame, "It's a draw!");
            frame.dispose();
        }
    }

    private char getNextPlayer() {
        return currentPlayer == 'X'? 'O' : 'X';
    }

    private boolean hasWon(char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(String.valueOf(player)) &&
                    buttons[i][1].getText().equals(String.valueOf(player)) &&
                    buttons[i][2].getText().equals(String.valueOf(player))) {
                return true;
            }
        }
        // Check columns
        for (int i = 0; i < 3; i++) {
            if (buttons[0][i].getText().equals(String.valueOf(player)) &&
                    buttons[1][i].getText().equals(String.valueOf(player)) &&
                    buttons[2][i].getText().equals(String.valueOf(player))) {
                return true;
            }
        }
        // Check diagonals
        if ((buttons[0][0].getText().equals(String.valueOf(player)) &&
                buttons[1][1].getText().equals(String.valueOf(player)) &&
                buttons[2][2].getText().equals(String.valueOf(player))) ||
                (buttons[0][2].getText().equals(String.valueOf(player)) &&
                        buttons[1][1].getText().equals(String.valueOf(player)) &&
                        buttons[2][0].getText().equals(String.valueOf(player)))) {
            return true;
        }
        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}