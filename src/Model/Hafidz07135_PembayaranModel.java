package Model;
import Entity.Hafidz07135_PelangganEntity;
import Entity.Hafidz07135_PembayaranEntity;
import java.util.ArrayList;
public class Hafidz07135_PembayaranModel{
    private ArrayList<Hafidz07135_PembayaranEntity> pembayaranCetakArrayList;
    private ArrayList<Hafidz07135_PembayaranEntity> pembayaranArrayList;
    public Hafidz07135_PembayaranModel(){
        pembayaranCetakArrayList = new ArrayList<>();
        pembayaranArrayList = new ArrayList<>();
    }
    public void insert(Hafidz07135_PembayaranEntity pembayaranCetakEntity){ //method
        pembayaranCetakArrayList.add(pembayaranCetakEntity);
    }
    public void insertt(Hafidz07135_PembayaranEntity pembayaranEntity){ //method
        pembayaranArrayList.add(pembayaranEntity);
    }
    public int size() {
      return pembayaranCetakArrayList.size();
    }
    public int sizee() {
      return pembayaranArrayList.size();
    }
    public void remove(int cariid) {
        pembayaranCetakArrayList.remove(cariid);
    }
    public ArrayList<Hafidz07135_PembayaranEntity> getPembayaranCetakEntityArrayList(){
        return pembayaranCetakArrayList;
    }
    public ArrayList<Hafidz07135_PembayaranEntity> getPembayaranEntityArrayList(){  
        return pembayaranArrayList;
    }
    public Hafidz07135_PembayaranEntity getPembayaranCetakArrayList(int index){
        return pembayaranCetakArrayList.get(index);
    }
    public Hafidz07135_PembayaranEntity getPembayaranArrayList(int index){
        return pembayaranArrayList.get(index);
    }
    public Hafidz07135_PembayaranEntity showDaftarcetak1(int index){
        return pembayaranCetakArrayList.get(index);
    } 
    public int cekData(String idpelanggan) {
        int loop = 0;
        while (!pembayaranArrayList.get(loop).getIdPelanggan().equals(idpelanggan)){
            loop++;
        }
        return loop;
    }
}