package cadibal_program;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame implements ActionListener {
    JTextField input;
    String num1 = "", num2 = "", operator = "";

    public calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        input = new JTextField();
        input.setEditable(false);
        input.setFont(new Font("Arial", Font.BOLD, 24));
        add(input, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String btn = e.getActionCommand();

        if (btn.matches("[0-9]")) {
            if (operator.isEmpty()) {
                num1 += btn;
                input.setText(num1);
            } else {
                num2 += btn;
                input.setText(num2);
            }
        } else if (btn.equals("+") || btn.equals("-") || btn.equals("*") || btn.equals("/"))
 {
            operator = btn;
        } else if (btn.equals("=")) {
            double result = 0;
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);

            switch (operator) {
                case "+": result = n1 + n2; break;
                case "-": result = n1 - n2; break;
                case "*": result = n1 * n2; break;
                case "/": result = n1 / n2; break;
            }

            input.setText(String.valueOf(result));
            num1 = String.valueOf(result);
            num2 = "";
            operator = "";
        } else if (btn.equals("C")) {
            num1 = num2 = operator = "";
            input.setText("");
        }
    }

    public static void main(String[] args) {
        new calculator();
    }
}




