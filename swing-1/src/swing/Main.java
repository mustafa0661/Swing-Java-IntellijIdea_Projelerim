package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {

        JFrame jf = new JFrame("Merhaba");
      //  jf.setTitle("Yeni pencere");//başlık
        jf.setSize(700,600);//pencerenin büyüklüğü
        jf.setLocation(500,100);//pencerenin kenarlardan ne kadar uzakta olduğu, konumu

        jf.getContentPane().setLayout(new FlowLayout());

        JButton buton1 = new JButton("Gönder");//Buton oluşturma
        JTextField text1 = new JTextField(10);//Giriş kısmı ekleme
        JLabel label1 = new JLabel("İsminizi giriniz:");// Yazı ekleme

        jf.getContentPane().add(label1);//Oluşturulan öğelerin jframe üzerine eklenmesi
        jf.getContentPane().add(text1);
        jf.getContentPane().add(buton1);

        buton1.addActionListener(new ActionListener() { //buton 1 e basıldığında  gerçekleşmesi istenilen aksiyonun eklenemsei
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Merhabalar " + text1.getText() + ", programa hoşgeldiniz");
            }
        });

        Color eskiRenk = buton1.getBackground();



        JButton buton2 = new JButton("tıkla");
        jf.getContentPane().add(buton2);

        buton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane panelimiz = new JOptionPane();
                panelimiz.showMessageDialog(null,"Merhabalar " +text1.getText()+ " panelimize hoşgeldiniz");

            }
        });

        buton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                buton1.setBackground(Color.RED );
            }

            @Override
            public void mouseExited(MouseEvent e) {
                buton1.setBackground(eskiRenk);
            }

        });

        JButton buton3 = new JButton("Giriş");
        jf.getContentPane().add(buton3);

        buton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String isim = JOptionPane.showInputDialog("Lütfen isminizi giriniz:");
                JOptionPane.showMessageDialog(null,"Hoşgeldin " + isim);

            }
        });

        JButton buton4 = new JButton("Yeni buton");
        buton4.setBackground(Color.blue);
        buton4.setForeground(Color.red);
        buton4.setFont(new Font("Calibre",Font.BOLD,14));




        jf.getContentPane().add(buton4);


        jf.getContentPane().setBackground(Color.cyan);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//programı kapattığımızda arka planda da kapatma

        jf.setResizable(false);

        jf.setVisible(true);//pencereyi ekrana bastırmak için gerekli



    }
}