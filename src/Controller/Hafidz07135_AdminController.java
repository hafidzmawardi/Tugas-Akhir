package Controller;
import Entity.Hafidz07135_AdminEntity;
public class Hafidz07135_AdminController{
    public Hafidz07135_AdminController(){
    }
    int indexLogin = 0;
    public void login(String id,String password){
        indexLogin = Hafidz07135_AllObjectModel.adminModel.cekData(id,password);
    }
    public void insert(String id, String nama, String notelp, String umur, String password){
        Hafidz07135_AllObjectModel.adminModel.insert(new Hafidz07135_AdminEntity(id,nama,notelp,umur,password));
    }
    public Hafidz07135_AdminEntity AdminEntity(){
        return Hafidz07135_AllObjectModel.adminModel.getAdminEntityArrayList(indexLogin);
    }
    public int update(String Hafidz07135_id,String Hafidz07135_pass){
       return  Hafidz07135_AllObjectModel.adminModel.update(Hafidz07135_id, Hafidz07135_pass);   
    }
}