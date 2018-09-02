import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JPanel MainPanel;
    private JTextField textUser;
    private JPasswordField textPassword;
    private JButton submitButton;
    private JButton clearButton;
    private JLabel textUserLogin;
    private JLabel pwdUserPassword;


    public login() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textUser.getText() + " " + new String(textPassword.getPassword()));
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textUser.setText("");
                textPassword.setText("");
            }
        });
    }

    public JPanel getMainPanel(){
        return MainPanel;
    }
}
