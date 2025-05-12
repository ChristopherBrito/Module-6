package eclipse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserRegistrationForm {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("User Registration");

        
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passwordLabel = new JLabel("Password:");
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");

        
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JPasswordField confirmPasswordField = new JPasswordField();

        
        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");

        
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);
        frame.add(submitButton);
        frame.add(clearButton);

        
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                
                if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(frame, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    
                    String message = String.format("Name: %s\nEmail: %s\nPassword: %s\n", name, email, password);
                    JOptionPane.showMessageDialog(frame, message, "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                nameField.setText("");
                emailField.setText("");
                passwordField.setText("");
                confirmPasswordField.setText("");
            }
        });

        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

