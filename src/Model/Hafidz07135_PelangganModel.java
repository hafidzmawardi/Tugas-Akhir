package Model;
import java.text.SimpleDateFormat;
import Entity.Hafidz07135_PelangganEntity;
import java.util.ArrayList;
public class Hafidz07135_PelangganModel {
    private ArrayList<Hafidz07135_PelangganEntity> pelangganEntityArrayList;
    public Hafidz07135_PelangganModel(){
        pelangganEntityArrayList = new ArrayList<Hafidz07135_PelangganEntity>();
    }
    public void insert(Hafidz07135_PelangganEntity pelangganEntity){ //method
        pelangganEntityArrayList.add(pelangganEntity);
    }
    public int size() {
      return pelangganEntityArrayList.size();
    }
    public void remove(int cariid) {
        pelangganEntityArrayList.remove(cariid);
    }
    public ArrayList<Hafidz07135_PelangganEntity> getPelangganEntityArrayList(){
        return pelangganEntityArrayList;
    }
    public Hafidz07135_PelangganEntity getPelangganEntityArrayList(int index){
        return pelangganEntityArrayList.get(index);
    }  
}