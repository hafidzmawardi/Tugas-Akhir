package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Hafidz07135_GUIInput {
    JFrame tambah = new JFrame();
    JButton ok,back;
    JLabel top,id,nama,notelp,alamat,labelbarang, keperluan, jaminan, namaadmin;
    JTextField textid,textnama,textnotelp,textalamat,textbarang, textkeperluan, textjaminan, textnamaadmin;
    public Hafidz07135_GUIInput(){
        tambah.setSize(700,630);
        tambah.setLayout(null);
        tambah.getContentPane().setBackground(Color.white);
        top = new JLabel("Input Pelanggan");
        top.setBounds(200,10,600,50);
        top.setFont(new Font("Times New Roman",Font.ITALIC,40));
        tambah.add(top);
        id = new JLabel("ID");
        id.setBounds(100, 100, 100, 30);
        tambah.add(id);
        textid = new JTextField();
        textid.setBounds(250, 100, 200, 30);
        tambah.add(textid);
        nama = new JLabel("Nama");
        nama.setBounds(100, 130, 100, 30);
        tambah.add(nama);
        textnama = new JTextField();
        textnama.setBounds(250, 130, 200, 30);
        tambah.add(textnama);
        notelp = new JLabel("No telp");
        notelp.setBounds(100, 160, 100, 30);
        tambah.add(notelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(250, 160, 200, 30);
        tambah.add(textnotelp);
        keperluan =new JLabel("Keperluan");
        keperluan.setBounds(100, 190, 100, 30);
        tambah.add(keperluan);
        textkeperluan = new JTextField();
        textkeperluan.setBounds(250, 190, 200, 30);
        tambah.add(textkeperluan);
        alamat =new JLabel("Alamat");
        alamat.setBounds(100, 220, 100, 30);
        tambah.add(alamat);
        textalamat = new JTextField();
        textalamat.setBounds(250, 220, 200, 30);
        tambah.add(textalamat);
        jaminan =new JLabel("Jaminan");
        jaminan.setBounds(100, 250, 100, 30);
        tambah.add(jaminan);
        textjaminan = new JTextField();
        textjaminan.setBounds(250, 250, 200, 30);
        tambah.add(textjaminan);
        namaadmin =new JLabel("Admin");
        namaadmin.setBounds(100, 280, 100, 30);
        tambah.add(namaadmin);
        textnamaadmin = new JTextField();
        textnamaadmin.setBounds(250, 280, 200, 30);
        tambah.add(textnamaadmin);
        
        ok = new JButton("OK");
        ok.setBounds(300, 450, 100, 40);
        ok.setBackground(Color.GREEN);
        tambah.add(ok);
        
        back = new JButton("Back");
        back.setBounds(300, 500, 100, 30);
        back.setBackground(Color.RED);
        tambah.add(back);
        
        tambah.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tambah.setVisible(true);
        tambah.setLocationRelativeTo(null);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tambah.dispose();
                Hafidz07135_GUIPelanggan pelanggan = new Hafidz07135_GUIPelanggan();
            }
        });
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    String idpelanggan = textid.getText();
                    String nama = textnama.getText();
                    String notelp = textnotelp.getText();
                    String keperluan = textkeperluan.getText();
                    String alamat = textalamat.getText();
                    String jaminan = textjaminan.getText();
                    String namaadmin = textnamaadmin.getText();
                    Hafidz07135_AllObjCtrl.pelanggan.insert(nama,notelp,keperluan,alamat);
                    Hafidz07135_AllObjCtrl.pembayaran.insertt(jaminan, namaadmin, idpelanggan);
                    JOptionPane.showMessageDialog(null, "Input Sukses","Information",JOptionPane.INFORMATION_MESSAGE);
                    tambah.dispose();
                    Hafidz07135_GUIPelanggan pelanggan = new Hafidz07135_GUIPelanggan();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Format Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}