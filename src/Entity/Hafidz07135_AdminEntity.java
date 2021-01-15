package Entity;
public class Hafidz07135_AdminEntity extends Hafidz07135_ManusiaAbstractEntity {
    private String id,password;
    public Hafidz07135_AdminEntity(String nama, String notelp, String umur, String id, String password){
        super(nama, notelp, umur);
        this.password = password;
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}