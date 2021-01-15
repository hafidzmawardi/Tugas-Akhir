package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
public class Hafidz07135_GUIPelanggan {
    JFrame pelanggan = new JFrame();
    JTable tabelpembeli = new JTable();
    JScrollPane scrolpelanggan = new JScrollPane(tabelpembeli);
    JButton input, pesan, hapus, back, lihat, update;
    JLabel admin, labelnomor, labelnama, labelalamat;
    JTextField nomortext, namatext;
    public Hafidz07135_GUIPelanggan(){
        pelanggan.setSize(650, 500);
        pelanggan.setLayout(null);
        pelanggan.getContentPane().setBackground(Color.white);
        pelanggan.setLocationRelativeTo(null);
        pelanggan.setVisible(true);
        pelanggan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        admin = new JLabel(":)");
        admin.setBounds(250, 50, 200, 30);
        admin.setFont(new Font("Consolas", Font.ITALIC, 40));
        pelanggan.add(admin);
        scrolpelanggan.setBounds(30, 100, 570, 200);
        tabelpembeli.setModel(Hafidz07135_AllObjCtrl.pelanggan.tablePelanggan());
        pelanggan.add(scrolpelanggan);
        labelnomor = new JLabel("ID");
        labelnomor.setBounds(50, 320, 100, 30);
        pelanggan.add(labelnomor);
        nomortext = new JTextField();
        nomortext.setBounds(50, 350, 100, 30);
        pelanggan.add(nomortext);
        
        pesan = new JButton("Pesan");
        pesan.setBounds(200, 400, 100, 30);
        pesan.setBackground(Color.GREEN);
        pelanggan.add(pesan);
        
        lihat = new JButton("Lihat");
        lihat.setBounds(200, 350, 100, 30);
        lihat.setBackground(Color.GREEN);
        pelanggan.add(lihat);

        hapus = new JButton("Hapus");
        hapus.setBounds(350, 400, 100, 30);
        hapus.setBackground(Color.GREEN);
        pelanggan.add(hapus);
        
        update = new JButton("Update");
        update.setBounds(350, 350, 100, 30);
        update.setBackground(Color.GREEN);
        pelanggan.add(update);
        
         back = new JButton("Back");
        back.setBounds(500, 400, 100, 30);
        back.setBackground(Color.RED);
        pelanggan.add(back);

        input = new JButton("Input");
        input.setBounds(50, 400, 100, 30);
        input.setBackground(Color.GREEN);
        pelanggan.add(input);
        
        pelanggan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pelanggan.setVisible(true);
        pelanggan.setLocationRelativeTo(null);
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pelanggan.dispose();
                Hafidz07135_GUIDaftarLogin men = new Hafidz07135_GUIDaftarLogin();
            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pelanggan.dispose();
                Hafidz07135_GUIUpdate men = new Hafidz07135_GUIUpdate();
            }
        });
        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pelanggan.dispose();
                Hafidz07135_GUIInput Hafidz07135_GUIInput = new Hafidz07135_GUIInput();
            }
        });
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pelanggan.dispose();
                String nomor = nomortext.getText();
                int index = Hafidz07135_AllObjCtrl.pelanggan.cekpembeli(nomor);
                Hafidz07135_AllObjCtrl.pelanggan.remove(index);
                Hafidz07135_GUIPelanggan pelanggan = new Hafidz07135_GUIPelanggan();
            }
        });
        pesan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pelanggan.dispose();
                int index = 0;
                Hafidz07135_GUIInputCetak inputcetak = new Hafidz07135_GUIInputCetak();
            }
        });
        lihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pelanggan.dispose();
                int index = 0;
                Hafidz07135_GUILihatCetak lihatcetak = new Hafidz07135_GUILihatCetak();
            }
        });
        tabelpembeli.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelpembeli.getSelectedRow();
                nomortext.setText(Hafidz07135_AllObjCtrl.pelanggan.tablePelanggan().getValueAt(i, 0).toString());
            }
        });
    }
}
