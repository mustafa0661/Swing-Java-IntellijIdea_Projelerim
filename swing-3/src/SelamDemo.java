import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelamDemo extends JFrame{
    private JLabel LabelMain;
    private JTextField txtName;
    private JButton btnClick;
    private JPanel Panel;

    public SelamDemo() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick,txtName.getText() + ", Hello");
            }
        });
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }


        SelamDemo Selam = new SelamDemo();
        Selam.setContentPane(Selam.Panel);
        Selam.setTitle("Hello");
        Selam.setSize(300,400);
        Selam.setVisible(true);
        Selam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
