package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class KingdomView extends JFrame {

    private JTextField firstName = new JTextField(10);
    private JTextField familyName = new JTextField(10);
    private JTextField age = new JTextField(10);
    private JButton submit = new JButton("Submit");
    private JButton changeProfile = new JButton("Change Profile");

    private JButton yes = new JButton("Yes");
    private JButton no = new JButton("No");



    public KingdomView() {
        JPanel panel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        panel.add(firstName);
        panel.add(familyName);
        panel.add(age);
        panel.add(submit);
        panel.add(changeProfile);
        panel.add(yes);
        panel.add(no);
        this.add(panel);
    }

    public String getName() {
        return firstName.getText();
    }
    public String getFamilyName() {
        return familyName.getText();
    }
    public int getAge() {
        return Integer.parseInt(age.getText());
    }

    public void setName(String firstName) {
        this.firstName.setText(firstName);
    }
    public void setFamilyName(String familyName) {
        this.familyName.setText(familyName);
    }
    public void setAge(int age) {
        this.age.setText(Integer.toString(age));
    }

    public void addSubmitListener(ActionListener listenerForSubmitButton) {
        submit.addActionListener(listenerForSubmitButton);
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
