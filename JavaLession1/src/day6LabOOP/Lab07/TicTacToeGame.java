package day6LabOOP.Lab07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGame extends JFrame {
    private JButton[][] buttons; // Mảng các nút trong bảng cờ
    private char currentPlayer; // Người chơi hiện tại
    private boolean gameOver; // Biến kiểm tra kết thúc trò chơi

    public TicTacToeGame() {
        setTitle("Tic-Tac-Toe Game");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(20, 20));
        setLocationRelativeTo(null);

        buttons = new JButton[20][20];
        currentPlayer = 'X';
        gameOver = false;

        initializeButtons();
    }

    private void initializeButtons() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                JButton button = new JButton();
                button.setFont(new Font("Arial", Font.BOLD, 20));

                final int row = i;
                final int col = j;

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (buttons[row][col].getText().isEmpty() && !gameOver) {
                            buttons[row][col].setText(Character.toString(currentPlayer));
                            buttons[row][col].setEnabled(false);

                            if (checkWin(currentPlayer, row, col)) {
                                JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
                                gameOver = true;
                            } else if (isBoardFull()) {
                                JOptionPane.showMessageDialog(null, "It's a draw!");
                                gameOver = true;
                            } else {
                                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                            }
                        }
                    }
                });

                buttons[i][j] = button;
                add(button);
            }
        }
    }

    private boolean checkWin(char player, int row, int col) {
        int count;

        // Kiểm tra hàng
        count = 1;
        for (int i = col - 1; i >= 0; i--) {
            if (buttons[row][i].getText().equals(Character.toString(player))) {
                count++;
            } else {
                break;
            }
        }
        for (int i = col + 1; i < 20; i++) {
            if (buttons[row][i].getText().equals(Character.toString(player))) {
                count++;
            } else {
                break;
            }
        }
        if (count >= 5) {
            return true;
        }

        // Kiểm tra cột
        count = 1;
        for (int i = row - 1; i >= 0; i--) {
            if (buttons[i][col].getText().equals(Character.toString(player))) {
                count++;
            } else {
                break;
            }
        }
        for (int i = row + 1; i < 20; i++) {
            if (buttons[i][col].getText().equals(Character.toString(player))) {
                count++;
            } else {
                break;
            }
        }
        if (count >= 5) {
            return true;
        }

        // Kiểm tra đường chéo chính (\)
        count = 1;
        for (int i = 1; i <= Math.min(row, col); i++) {
            if (buttons[row - i][col - i].getText().equals(Character.toString(player))) {
                count++;
            } else {
                break;
            }
        }
        for (int i = 1; i < Math.min(20 - row, 20 - col); i++) {
            if (buttons[row + i][col + i].getText().equals(Character.toString(player))) {
                count++;
            } else {
                break;
            }
        }
        if (count >= 5) {
            return true;
        }

        // Kiểm tra đường chéo phụ (/)
        count = 1;
        for (int i = 1; i <= Math.min(row, 20 - col - 1); i++) {
            if (buttons[row - i][col + i].getText().equals(Character.toString(player))) {
                count++;
            } else {
                break;
            }
        }
        for (int i = 1; i < Math.min(20 - row, col + 1); i++) {
            if (buttons[row + i][col - i].getText().equals(Character.toString(player))) {
                count++;
            } else {
                break;
            }
        }
        if (count >= 5) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (buttons[i][j].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TicTacToeGame().setVisible(true));
    }
}

