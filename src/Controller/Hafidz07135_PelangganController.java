package Controller;
import Entity.Hafidz07135_CetakEntity;
import Entity.Hafidz07135_PelangganEntity;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class Hafidz07135_PelangganController{
    public Hafidz07135_PelangganController(){
    }
    int index = 0;
    public void insert(String nama, String notelp,String keperluan, String alamat){
        Hafidz07135_AllObjectModel.pelangganModel.insert(new Hafidz07135_PelangganEntity(nama,notelp,keperluan,alamat));
    }
    public Hafidz07135_PelangganEntity PelangganEntity(){
        return Hafidz07135_AllObjectModel.pelangganModel.getPelangganEntityArrayList(index);
    }
    public void remove(int cariid){
        Hafidz07135_AllObjectModel.pelangganModel.remove(cariid);
    }
    public ArrayList<Hafidz07135_PelangganEntity> cekDaftarPelanggan(int index){
    return Hafidz07135_AllObjectModel.pelangganModel.getPelangganEntityArrayList();
    }
    public int cekpembeli(String idpelanggan){
        int cek = Hafidz07135_AllObjectModel.pembayaranModel.cekData(idpelanggan);
        return cek;   
        }
    public DefaultTableModel tablePelanggan(){
        DefaultTableModel dtmdaftarpelanggan = new DefaultTableModel();
        Object[] kolom ={"ID","Nama","Notelp","Keperluan","Alamat","Jaminan","Admin"};
        dtmdaftarpelanggan.setColumnIdentifiers(kolom);
        int size = Hafidz07135_AllObjectModel.pelangganModel.size();
        for (int i=0;i<size;i++){
            Object [] data= new Object[10];
            data[0] = Hafidz07135_AllObjectModel.pembayaranModel.getPembayaranEntityArrayList().get(i).getIdPelanggan();
            data[1] = Hafidz07135_AllObjectModel.pelangganModel.getPelangganEntityArrayList().get(i).getNama();
            data[2] = Hafidz07135_AllObjectModel.pelangganModel.getPelangganEntityArrayList().get(i).getNotelp();
            data[3] = Hafidz07135_AllObjectModel.pelangganModel.getPelangganEntityArrayList().get(i).getKeperluan();
            data[4] = Hafidz07135_AllObjectModel.pelangganModel.getPelangganEntityArrayList().get(i).getAlamat();
            data[5] = Hafidz07135_AllObjectModel.pembayaranModel.getPembayaranEntityArrayList().get(i).getJaminan();
            data[6] = Hafidz07135_AllObjectModel.pembayaranModel.getPembayaranEntityArrayList().get(i).getIndexadmin();
            dtmdaftarpelanggan.addRow(data);
        }
        return dtmdaftarpelanggan;
    }
}