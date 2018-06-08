package main.java.java8features;

import javax.swing.*;

public class LambdaExpressions7 {

    public static void main(String[] args) {

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);

        JButton button = new JButton();
        button.setText("Click Me!");
        button.setBounds(80, 100, 100, 30);

        button.addActionListener(e -> textField.setText("Hello World!"));

        JFrame frame = new JFrame();
        frame.add(textField);
        frame.add(button);
        frame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

}
