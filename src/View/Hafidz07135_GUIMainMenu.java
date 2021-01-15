package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
public class Hafidz07135_GUIMainMenu {
    JFrame logReg = new JFrame();
    JLabel top;
    JButton pesan, lihat, update, hapus, logout;
    public Hafidz07135_GUIMainMenu(){
    logReg.setSize(700, 600);
    logReg.setLayout(null);
    logReg.setVisible(true);
    logReg.getContentPane().setBackground(Color.white);
    top = new JLabel("Percetakan Project");
    top.setBounds(180, 10, 600, 50);
    top.setFont(new Font("Times New Roman",Font.ITALIC,40));
    logReg.add(top);
    
    pesan = new JButton("Pesan");
    pesan.setBounds(270, 140, 150, 60);
    pesan.setBackground(Color.GREEN);
    logReg.add(pesan);
    
    lihat = new JButton("Lihat");
    lihat.setBounds(270, 200, 150, 60);
    lihat.setBackground(Color.GREEN);
    logReg.add(lihat);
    
    update = new JButton("Update");
    update.setBounds(270, 200, 150, 60);
    update.setBackground(Color.GREEN);
    logReg.add(update);
    
    logout = new JButton("Logout");
    logout.setBounds(270, 380, 150, 60);
    logout.setBackground(Color.RED);
    logReg.add(logout);
    pesan.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                Hafidz07135_GUIPelanggan guipelanggan = new Hafidz07135_GUIPelanggan();
                logReg.dispose();
            }
        });
    logout.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                Hafidz07135_GUILogin guilogin = new Hafidz07135_GUILogin();
                logReg.dispose();
            }
        });
    }      
}