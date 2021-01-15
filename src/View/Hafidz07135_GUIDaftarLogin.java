package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
public class Hafidz07135_GUIDaftarLogin {
    JFrame logReg = new JFrame();
    JLabel top, daftarr, id, nama, notelp, umur, password, loginadmin;
    JTextField textidDaftar, textnamaDaftar, textnotelpDaftar, textumurDaftar, textpasswordDaftar, textidlogin, textpasswordlogin;
    JLabel idLogin, passwordLogin;
    JButton daftar, masuk, keluar;
    public Hafidz07135_GUIDaftarLogin(){
    logReg.setSize(700, 600);
    logReg.setLayout(null);
    logReg.setVisible(true);
    logReg.getContentPane().setBackground(Color.white);
    top = new JLabel("Percetakan Project!");
    top.setBounds(180, 10, 600, 50);
    top.setFont(new Font("Times New Roman",Font.ITALIC,40));
    logReg.add(top);
    loginadmin = new JLabel("Login Admin");
    loginadmin.setBounds(180, 325, 300, 100);
    loginadmin.setFont(new Font("Times New Roman",Font.ITALIC,30));
    logReg.add(loginadmin);
    daftarr = new JLabel("Daftar Admin");
    daftarr.setBounds(150, 50, 300, 100);
    daftarr.setFont(new Font("Times New Roman",Font.ITALIC,30));
    logReg.add(daftarr);
    id = new JLabel("ID Admin");
    id.setBounds(100, 100, 300, 100);
    id.setFont(new Font("Times New Roman",Font.ITALIC,20));
    logReg.add(id);
    textidDaftar = new JTextField();
    textidDaftar.setBounds(220, 140, 150, 30);
    logReg.add(textidDaftar);
    nama = new JLabel("Nama Admin");
    nama.setBounds(100, 135, 300, 100);
    nama.setFont(new Font("Times New Roman",Font.ITALIC,20));
    logReg.add(nama);
    textnamaDaftar = new JTextField();
    textnamaDaftar.setBounds(220, 175, 150, 30);
    logReg.add(textnamaDaftar);
    notelp = new JLabel("No Telepon");
    notelp.setBounds(100, 170, 300, 100);
    notelp.setFont(new Font("Times New Roman",Font.ITALIC,20));
    logReg.add(notelp);
    textnotelpDaftar = new JTextField();
    textnotelpDaftar.setBounds(220, 210, 150, 30);
    logReg.add(textnotelpDaftar);
    umur = new JLabel("Umur Admin");
    umur.setBounds(100, 205, 300, 100);
    umur.setFont(new Font("Times New Roman",Font.ITALIC,20));
    logReg.add(umur);
    textumurDaftar = new JTextField();
    textumurDaftar.setBounds(220, 245, 150, 30);
    logReg.add(textumurDaftar);
    password = new JLabel("Password");
    password.setBounds(100, 240, 300, 100);
    password.setFont(new Font("Times New Roman",Font.ITALIC,20));
    logReg.add(password);
    textpasswordDaftar = new JTextField();
    textpasswordDaftar.setBounds(220, 280, 150, 30);
    logReg.add(textpasswordDaftar);
    
    idLogin = new JLabel("ID Admin");
    idLogin.setBounds(100, 400, 300, 50);
    idLogin.setFont(new Font("Times New Roman",Font.ITALIC,20));
    logReg.add(idLogin);
    textidlogin = new JTextField();
    textidlogin.setBounds(100, 450, 150, 30);
    logReg.add(textidlogin);
    passwordLogin = new JLabel("Password");
    passwordLogin.setBounds(280, 400, 300, 50);
    passwordLogin.setFont(new Font("Times New Roman",Font.ITALIC,20));
    logReg.add(passwordLogin);
    textpasswordlogin = new JTextField();
    textpasswordlogin.setBounds(280, 450, 150, 30);
    logReg.add(textpasswordlogin);
    daftar = new JButton("Daftar");
    daftar.setBounds(380, 140, 100, 30);
    daftar.setBackground(Color.GREEN);
    logReg.add(daftar);
    
    keluar = new JButton("Keluar");
    keluar.setBounds(380, 170, 100, 30);
    keluar.setBackground(Color.RED);
    logReg.add(keluar);
    
    masuk = new JButton("Masuk");
    masuk.setBounds(450, 450, 100, 30);
    masuk.setBackground(Color.GREEN);
    logReg.add(masuk);
    
    logReg.setLocationRelativeTo(null);
    logReg.setVisible(true);
    logReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    daftar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    String id = textidDaftar.getText();                   
                    String nama = textnamaDaftar.getText();
                    String notelp = textnotelpDaftar.getText();
                    String umur = textumurDaftar.getText();
                    String pass = textpasswordDaftar.getText();
                    Hafidz07135_AllObjCtrl.admin.insert(id, nama, notelp, umur, pass);
                    JOptionPane.showMessageDialog(null,"Registrasi Sukses","information",JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Format Penulisan Salah","Pendaftaran Gagal",JOptionPane.INFORMATION_MESSAGE);
                }
                }
            });
    masuk.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                
                    try{
                        Hafidz07135_AllObjCtrl.admin.AdminEntity();
                        Hafidz07135_AllObjCtrl.admin.login(textidlogin.getText(), textpasswordlogin.getText());
                        String nama = Hafidz07135_AllObjCtrl.admin.AdminEntity().getNama();
                        Hafidz07135_GUIPelanggan pelanggan = new Hafidz07135_GUIPelanggan();
                        logReg.dispose();
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null,"Kode atau password salah","information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
            }
        });
    keluar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                
                        logReg.dispose();     
            }
        });
    }
    void kosong(){
        textidDaftar.setText(null);
        textnamaDaftar.setText(null);
        textnotelpDaftar.setText(null);
        textumurDaftar.setText(null);
        textpasswordDaftar.setText(null);       
    }
}