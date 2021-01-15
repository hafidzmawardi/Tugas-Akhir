package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Hafidz07135_GUIUpdate {
    JFrame updateGUI = new JFrame();
    JLabel passlama,passbaru,update;
    JTextField textpasslama,textpassbaru;
    JButton Kembali,input;
    public Hafidz07135_GUIUpdate(){
        updateGUI.setSize(300, 300);
        updateGUI.setLayout(null);
        updateGUI.getContentPane().setBackground(Color.white);
        update = new JLabel("Update");
        update.setBounds(20, 20, 250, 35);
        update.setFont(new Font("Times New Roman",Font.ITALIC,30));
        updateGUI.add(update);
        passlama = new JLabel("Password Lama ");
        passlama.setBounds(50,60,150,15);
        updateGUI.add(passlama);
        textpasslama = new JTextField();
        textpasslama.setBounds(50, 80, 190, 25);
        updateGUI.add(textpasslama);
        passbaru = new JLabel("Password Baru  ");
        passbaru.setBounds(50,110,150,25);
        updateGUI.add(passbaru);
        textpassbaru = new JTextField();
        textpassbaru.setBounds(50, 130, 190, 25);
        updateGUI.add(textpassbaru);
        input = new JButton("Selesai");
        input.setBounds(80,170,120,30);
        updateGUI.add(input);
        
        Kembali = new JButton("Kembali");
        Kembali.setBounds(80,210,120,30);
        updateGUI.add(Kembali);
         
        updateGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        updateGUI.setVisible(true);
        updateGUI.setLocationRelativeTo(null);
        
        input.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                int cek = Hafidz07135_AllObjCtrl.admin.update(textpasslama.getText(),textpassbaru.getText());
                if (cek==1){
                    JOptionPane.showMessageDialog(null,"Berhasil Update","information", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Password Salah","information", JOptionPane.INFORMATION_MESSAGE);
                }
                updateGUI.dispose();;
                Hafidz07135_GUIPelanggan menu = new Hafidz07135_GUIPelanggan();
            }
        });
        Kembali.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){        
                updateGUI.dispose();
                Hafidz07135_GUIPelanggan menu = new Hafidz07135_GUIPelanggan();
            }
        });
    }
}
