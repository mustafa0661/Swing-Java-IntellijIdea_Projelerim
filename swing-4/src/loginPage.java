import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginPage extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton girisButton;
    private JPanel panel1;


    public loginPage(){

        add(panel1);
        setSize(400,300);
        setTitle("Giriş");
        setLocation(600,250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        girisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eMail,sifre;

                eMail=textField1.getText();
                sifre=textField2.getText();
                System.out.println(eMail + " " + sifre);
            }
        });
    }
}


