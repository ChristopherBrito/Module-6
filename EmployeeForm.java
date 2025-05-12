package eclipse;

import java.awt.*;
import java.awt.event.*;

public class EmployeeForm {
    public static void main(String[] args) {
        Frame frame = new Frame("Employee Information Form");

        
        frame.setLayout(new FlowLayout());

        
        frame.add(new Label("Name:"));
        TextField nameField = new TextField(20);
        frame.add(nameField);

        
        frame.add(new Label("Employee ID:"));
        TextField idField = new TextField(20);
        frame.add(idField);

        
        frame.add(new Label("Department:"));
        TextField deptField = new TextField(20);
        frame.add(deptField);

        
        Button submitButton = new Button("Submit");
        frame.add(submitButton);

        
        Label resultLabel = new Label("");
        frame.add(resultLabel);

        
        frame.setSize(350, 250);
        frame.setVisible(true);

        
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String id = idField.getText();
                String dept = deptField.getText();
                resultLabel.setText("Name: " + name + ", ID: " + id + ", Dept: " + dept);
            }
        });

        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
