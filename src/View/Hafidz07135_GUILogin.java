package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Hafidz07135_GUILogin {
    JFrame logReg = new JFrame();
    JLabel top, login;
    JTextField textidLogin, textpasswordLogin;
    JLabel idLogin, passwordLogin;
    JButton masuk, daftar;
    private boolean ceklogin = false;
    public Hafidz07135_GUILogin(){
        logReg.setSize(700, 600);
    logReg.setLayout(null);
    logReg.setVisible(true);
    logReg.getContentPane().setBackground(Color.white);
    top = new JLabel("Percetakan Project");
    top.setBounds(180, 10, 600, 50);
    top.setFont(new Font("Times New Roman",Font.ITALIC,40));
    logReg.add(top);
    login = new JLabel("Admin Login");
    login.setBounds(260, 100, 500, 50);
    login.setFont(new Font("Times New Roman",Font.ITALIC,30));
    logReg.add(login);
    idLogin = new JLabel("ID");
    idLogin.setBounds(200, 150, 500, 50);
    idLogin.setFont(new Font("Times New Roman",Font.ITALIC,25));
    logReg.add(idLogin);
    textidLogin = new JTextField();
    textidLogin.setBounds(200, 200, 270, 30);
    logReg.add(textidLogin);
    passwordLogin = new JLabel("Password");
    passwordLogin.setBounds(200, 230, 500, 50);
    passwordLogin.setFont(new Font("Times New Roman",Font.ITALIC,25));
    logReg.add(passwordLogin);
    textpasswordLogin = new JTextField();
    textpasswordLogin.setBounds(200, 280, 270, 30);
    logReg.add(textpasswordLogin);
    
    masuk = new JButton("Masuk");
    masuk.setBounds(200, 320, 100, 30);
    masuk.setBackground(Color.GREEN);
    logReg.add(masuk);
    
    daftar = new JButton("Daftar");
    daftar.setBounds(370,320,100,30);
    daftar.setBackground(Color.GRAY);
    logReg.add(daftar);
    
    daftar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                Hafidz07135_GUIDaftar daftargui = new Hafidz07135_GUIDaftar();
                logReg.dispose();
            }
        });
    masuk.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                    try{
                        Hafidz07135_AllObjCtrl.admin.AdminEntity();
                        Hafidz07135_AllObjCtrl.admin.login(textidLogin.getText(), textpasswordLogin.getText());
                      String nama = Hafidz07135_AllObjCtrl.admin.AdminEntity().getNama();
                        Hafidz07135_GUIMainMenu pelanggan = new Hafidz07135_GUIMainMenu();
                        logReg.dispose();
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null,"ID atau password salah","information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
            }
        });
    }
     void kosong(){
        textidLogin.setText(null);
        textpasswordLogin.setText(null);
    }
}
