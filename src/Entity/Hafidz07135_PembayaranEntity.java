package Entity;
public class Hafidz07135_PembayaranEntity {
    private int indexcetak1, indexcetak2, indexcetak3; 
    private String idcetak, jaminan, indexadmin, idpelanggan;
    public Hafidz07135_PembayaranEntity(int indexcetak1, int indexcetak2, int indexcetak3,  String idcetak) {
        this.indexcetak1 = indexcetak1;
        this.indexcetak2 = indexcetak2;
        this.indexcetak3 = indexcetak3;
        this.idcetak = idcetak; 
    }
    public Hafidz07135_PembayaranEntity(String jaminan, String indexadmin, String idpelanggan){
        this.jaminan = jaminan;
        this.indexadmin = indexadmin;
        this.idpelanggan = idpelanggan;
    }
     public int getIndexcetak1() {
        return indexcetak1;
    }
    public int getIndexcetak2() {
        return indexcetak2;
    }
    public int getIndexcetak3() {
        return indexcetak3;
    }
    public String getIdcetak() {
        return idcetak;
    }
   
    public String getJaminan(){
        return jaminan;
    }
    public String getIndexadmin(){
        return indexadmin;
    }
    public String getIdPelanggan(){
        return idpelanggan;
    }}