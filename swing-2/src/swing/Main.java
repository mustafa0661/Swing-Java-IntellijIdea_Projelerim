package swing;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        int vize1,vize2 = 0;
        int final1;

        String svize1 = JOptionPane.showInputDialog("Lütfen 1. vize sınavınızı giriniz: ");
        vize1 = Integer.parseInt(svize1);

        while(vize1<0 || vize1>100){
            svize1 = JOptionPane.showInputDialog(null,"Lütfen 1. vize sınavınızı giriniz: ","1. vize",JOptionPane.WARNING_MESSAGE);
            vize1 = Integer.parseInt(svize1);
        }

        String svize2 = JOptionPane.showInputDialog("Lütfen 2. vize sınavınızı giriniz: ");
        vize1 = Integer.parseInt(svize2);

        while(vize2<0 || vize2>100){
            svize2 = JOptionPane.showInputDialog(null,"Lütfen 2. vize sınavınızı giriniz: ","2. vize",JOptionPane.WARNING_MESSAGE);
            vize2 = Integer.parseInt(svize2);
        }

        String sfinal1 = JOptionPane.showInputDialog("Lütfen final notunuzu giriniz: ");
        final1 = Integer.parseInt(sfinal1);

        while(final1<0 || final1>100){
            sfinal1 = JOptionPane.showInputDialog(null,"Lütfen final notunuzu giriniz: ","final",JOptionPane.WARNING_MESSAGE);
            final1 = Integer.parseInt(sfinal1);
        }

        double result = vize1 * 0.2 + vize2 * 0.2 + final1 * 0.6;
        String mesaj=" ";


        if(result>50){
            mesaj += "Tebrikler, dersten geçtiniz";
        }
        else{
            mesaj += "Dersten kaldınız";
        }

        JOptionPane.showMessageDialog(null,mesaj,"sonuc",JOptionPane.INFORMATION_MESSAGE);

    }
}