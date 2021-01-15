package Model;
import Entity.Hafidz07135_AdminEntity;
import java.util.ArrayList;
public class Hafidz07135_AdminModel {
    private ArrayList<Hafidz07135_AdminEntity> adminEntityArrayList;
    public Hafidz07135_AdminModel(){
        adminEntityArrayList = new ArrayList<Hafidz07135_AdminEntity>();
    }
    public void insert(Hafidz07135_AdminEntity adminEntity){ //method
        adminEntityArrayList.add(adminEntity);
    }
    public int cekData(String id, String password) {
        int loop = 0;
        while (!adminEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    public Hafidz07135_AdminEntity getAdminEntityArrayList(int index){
        return adminEntityArrayList.get(index);
    }
    public int update(String Hafidz07135_passlama,String Hafidz07135_passbaru){
        int Status;
        if(caripass(Hafidz07135_passlama)!=-1){     
            adminEntityArrayList.get(caripass(Hafidz07135_passlama)).setPassword(Hafidz07135_passbaru);
            Status=1;
       }else{
            Status=0;
       }
       return Status;
   }
    private int caripass(String password){
       int indeks=-1;   
       for(int a=0;a<adminEntityArrayList.size();a++){
           if(password.equals(adminEntityArrayList.get(a).getPassword())){
               indeks=a;
               break;
           }
       }
       return indeks;
   }
}