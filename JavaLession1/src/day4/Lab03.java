package day4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tính tổng");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 800;
        int height = 200;
        frame.setSize(width, height);

        frame.setVisible(true);
        JPanel panel = new JPanel();

        JLabel label1 = new JLabel("Số thứ nhất:");
        JTextField textField1 = new JTextField(10);

        JLabel label2 = new JLabel("Số thứ hai:");
        JTextField textField2 = new JTextField(10);

        JButton calculateButton = new JButton("Tính tổng");
        JLabel resultLabel = new JLabel();

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(textField1.getText());
                    int number2 = Integer.parseInt(textField2.getText());

                    int sum = number1 + number2;
                    resultLabel.setText("Tổng: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Lỗi: Vui lòng nhập số nguyên.");
                }
            }
        });

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(calculateButton);
        panel.add(resultLabel);

        frame.getContentPane().add(panel);
    }
}
