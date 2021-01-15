package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;
public class Hafidz07135_GUILihatCetak {
    JFrame Penjual = new JFrame();
    JLabel labellihat, id;
    JTextField nomortext;
    JTable tabelcetak = new JTable();
    JScrollPane scrolcetak = new JScrollPane(tabelcetak);
    JButton back;
    public Hafidz07135_GUILihatCetak(){
        Penjual.setSize(650, 500);
        Penjual.setLayout(null);
        Penjual.getContentPane().setBackground(Color.white);
        Penjual.setLocationRelativeTo(null);
        Penjual.setVisible(true);
        Penjual.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labellihat = new JLabel("Pesanan Anda");
        labellihat.setBounds(250, 50, 200, 30);
        labellihat.setFont(new Font("Consolas", Font.ITALIC, 40));
        Penjual.add(labellihat);
        scrolcetak.setBounds(30, 100, 570, 200);
        tabelcetak.setModel(Hafidz07135_AllObjCtrl.pembayaranCetak.tableCetak());
        Penjual.add(scrolcetak);
        id = new JLabel("ID");
        id.setBounds(50, 320, 100, 30);
        Penjual.add(id);
        nomortext = new JTextField();
        nomortext.setBounds(50, 350, 100, 30);
        Penjual.add(nomortext);
        
        back = new JButton("Back");
        back.setBounds(500, 400, 100, 30);
        back.setBackground(Color.RED);
        Penjual.add(back);
        
        Penjual.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Penjual.setVisible(true);
        Penjual.setLocationRelativeTo(null);
        tabelcetak.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelcetak.getSelectedRow();
                nomortext.setText(Hafidz07135_AllObjCtrl.pelanggan.tablePelanggan().getValueAt(i, 0).toString());
            }
        });
         back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Penjual.dispose();
                Hafidz07135_GUIPelanggan pelanggan = new Hafidz07135_GUIPelanggan();
            }
        });
    }
}
