package View;
import Entity.Hafidz07135_CetakEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Hafidz07135_GUIInputCetak {
    JFrame tambahcetak = new JFrame();
    JLabel top;
    JComboBox pilbar1 = new JComboBox(Hafidz07135_CetakEntity.Cetak);
    JComboBox pilbar2 = new JComboBox(Hafidz07135_CetakEntity.Cetak);
    JComboBox pilbar3 = new JComboBox(Hafidz07135_CetakEntity.Cetak);
    JButton input;
    public Hafidz07135_GUIInputCetak(){
        tambahcetak.setSize(700,630);
        tambahcetak.setLayout(null);
        tambahcetak.getContentPane().setBackground(Color.white);
        top = new JLabel("Input");
        top.setBounds(200,10,600,50);
        top.setFont(new Font("Times New Roman",Font.ITALIC,40));
        tambahcetak.add(top);
        
        pilbar1.setBounds(350, 100, 150, 30);
        tambahcetak.add(pilbar1);
        
        pilbar2.setBounds(350, 150, 150, 30);
        tambahcetak.add(pilbar2);
        
        pilbar3.setBounds(350, 200, 150, 30);
        tambahcetak.add(pilbar3);
        
        input = new JButton("Input");
        input.setBounds(300, 450, 100, 40);
        input.setBackground(Color.GREEN);
        tambahcetak.add(input);
        tambahcetak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tambahcetak.setVisible(true);
        tambahcetak.setLocationRelativeTo(null);
        
        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    int indexcetak1 = pilbar1.getSelectedIndex();
                    int indexcetak2 = pilbar2.getSelectedIndex();
                    int indexcetak3 = pilbar3.getSelectedIndex();
                    String idcetak = null;
                    Hafidz07135_AllObjCtrl.pembayaranCetak.insert(indexcetak1, indexcetak2, indexcetak3, idcetak);
                    JOptionPane.showMessageDialog(null, "Input Sukses","Information",JOptionPane.INFORMATION_MESSAGE);
                    tambahcetak.dispose();
                    Hafidz07135_GUIPelanggan pelanggan = new Hafidz07135_GUIPelanggan();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Format Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}