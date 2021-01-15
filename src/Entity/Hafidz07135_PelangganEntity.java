package Entity;
public class Hafidz07135_PelangganEntity extends Hafidz07135_ManusiaAbstractEntity{
    private String alamat,keperluan; 
    public Hafidz07135_PelangganEntity(String nama, String notelp,String keperluan, String alamat){
        super(nama, notelp, keperluan);
        this.alamat=alamat;
    }
    public String getKeperluan() {
        return keperluan;
    }
    public String getAlamat(){
        return this.alamat;
    }
}