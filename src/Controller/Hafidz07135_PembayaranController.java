package Controller;
import Entity.Hafidz07135_CetakEntity;
import Entity.Hafidz07135_PembayaranEntity;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
public class Hafidz07135_PembayaranController{
    public Hafidz07135_PembayaranController(){
    }
    int index = 0;
    int indexLogin = 0;
    public void insert(int indexcetak1, int indexcetak2, int indexcetak3, String idcetak){
        Hafidz07135_AllObjectModel.pembayaranCetakModel.insert(new Hafidz07135_PembayaranEntity(indexcetak1, indexcetak2, indexcetak3, idcetak));
    }
    public void insertt(String jaminan, String indexadmin, String idpelanggan){
        Hafidz07135_AllObjectModel.pembayaranModel.insertt(new Hafidz07135_PembayaranEntity(jaminan, indexadmin, idpelanggan));
    }
    public Hafidz07135_PembayaranEntity PembayaranEntity(){
        return Hafidz07135_AllObjectModel.pembayaranModel.getPembayaranArrayList(index);
    }
    public Hafidz07135_PembayaranEntity PembayaranCetakEntity(){
        return Hafidz07135_AllObjectModel.pembayaranCetakModel.getPembayaranCetakArrayList(index);
    }
    public ArrayList<Hafidz07135_PembayaranEntity> cekDataPelanggan(int index){
    return Hafidz07135_AllObjectModel.pembayaranModel.getPembayaranEntityArrayList();
    }
    public ArrayList<Hafidz07135_PembayaranEntity> cekDaftarCetak(int index){
    return Hafidz07135_AllObjectModel.pembayaranCetakModel.getPembayaranCetakEntityArrayList();
    }
    public void remove(int cariid){
        Hafidz07135_AllObjectModel.pembayaranCetakModel.remove(cariid);
    }
    public void removee(int cariidd){
        Hafidz07135_AllObjectModel.pembayaranModel.remove(cariidd);
    }
    public Hafidz07135_PembayaranController pembayaranCetakEntity(){
        Hafidz07135_AllObjectModel.pembayaranCetakModel.getPembayaranCetakArrayList(indexLogin);
        return null;
    }
    public Hafidz07135_PembayaranEntity showDaftarcetak1(int index){
        return Hafidz07135_AllObjectModel.pembayaranCetakModel.showDaftarcetak1(index);
    }
    public DefaultTableModel tableCetak(){
        DefaultTableModel dtmdaftarcetak = new DefaultTableModel();
        Object[] kolom ={"Cetak 1","Cetak 2","Cetak 3"};
        dtmdaftarcetak.setColumnIdentifiers(kolom);
        int size = Hafidz07135_AllObjectModel.pelangganModel.size();
        for (int i=0;i<size;i++){
            Object [] data= new Object[10];
            data[0] = Hafidz07135_CetakEntity.Cetak[Hafidz07135_AllObjectModel.pembayaranCetakModel.showDaftarcetak1(i).getIndexcetak1()];
            data[1] = Hafidz07135_CetakEntity.Cetak[Hafidz07135_AllObjectModel.pembayaranCetakModel.showDaftarcetak1(i).getIndexcetak2()];
            data[2] = Hafidz07135_CetakEntity.Cetak[Hafidz07135_AllObjectModel.pembayaranCetakModel.showDaftarcetak1(i).getIndexcetak3()];
            dtmdaftarcetak.addRow(data);
        }
        return dtmdaftarcetak;
    }
}