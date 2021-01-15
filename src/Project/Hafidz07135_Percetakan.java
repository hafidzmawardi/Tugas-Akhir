package Project;
// import Controller.Hafidz07135_AdminController;
// import Controller.Hafidz07135_PelangganController;
// import Controller.Hafidz07135_PembayaranController;
// import Entity.Hafidz07135_CetakEntity;
// import java.util.Scanner;
import View.Hafidz07135_GUIDaftarLogin;
public class Hafidz07135_Percetakan {
//     private static Hafidz07135_PelangganController pelanggan = new Hafidz07135_PelangganController();
//    private static Hafidz07135_AdminController admin = new Hafidz07135_AdminController();
//    private static Hafidz07135_PembayaranController pembayaranCetak = new Hafidz07135_PembayaranController();
//    private static Hafidz07135_PembayaranController pembayaran = new Hafidz07135_PembayaranController();
//    static Scanner input = new Scanner(System.in);
//    static int cekadmin, cekpelanggan, cekcetak, cekpembayaran;
       public static void main(String[] args) {
           Hafidz07135_GUIDaftarLogin gui = new Hafidz07135_GUIDaftarLogin();
//           int loop = 0 ;        
//         do{  
//        System.out.print("Percetakan Project!!!"
//                + "\n1. Daftar Admin"
//                + "\n2. Login Admin"
//                + "\n3. Exit"
//                + "\nPilih = ");
//                int pilih = input.nextInt();
//                 if(pilih == 1){
//                 Daftar();
//            }
//               else if(pilih == 2){
//               Login();
//              }
//            else{
//              break;
//              }
//          }while(loop != 3);
//           }
//              static void Daftar(){
//              System.out.print("Input Id = ");
//              String id = input.next();
//              System.out.print("Input Nama = ");
//              String nama = input.next();
//              System.out.print("Input No Telp = ");
//              String notelp = input.next();
//              System.out.print("Input Umur = ");
//              String umur = input.next();
//              System.out.print("Password = ");
//              String password = input.next();
//              admin.insert(id, nama, notelp, umur, password);
//         }
//                static void Login(){
//          int pil;
//              System.out.print("Id : ");
//          String id = input.next();
//          System.out.print("Password : ");
//          String password = input.next();
//          try{
//          admin.login(id, password);
//          do{
//           System.out.println("1. Pemesanan ");
//           System.out.println("2. Lihat ");
//              System.out.println("3. Update ");
//              System.out.println("4. Remove ");
//               System.out.println("5. Logout ");
//              System.out.print("Pilih = ");
//              pil = input.nextInt();
//              switch(pil){ 
//                case 1 : Customer();
//               break;
//                case 2 : 
//              if(pelanggan.cekDaftarPelanggan(cekpelanggan).size() == 0){
//               System.out.println("Data Kosong");
//              }else{
//               view();
//               } 
//                break;
//              case 3:  
//            System.out.print("Masukkan ID yang mau tambah barang :");
//            String idd =input.next();
//            update(idd);                   
//            break;
//          case 4:  
//           System.out.print("Kode Pelanggan :");
//         String iddd =input.next();
//          remove(iddd);
//          break;            
//      }
//      }while(pil !=  5);
//      }catch(Exception exception){
//     System.out.println("Kode Atau Password Salah !!");
//          } 
//      }
//       static void Customer()
//       {
//         System.out.print("Id Pelanggan :");
//       String id = input.next();
//       System.out.print("Nama Pelanggan : ");
//       String nama = input.next();
//       System.out.print("No Telp Pelanggan : ");
//       String notelp = input.next();
//       System.out.print("Keperluan : ");
//      String keperluan = input.next();
//      System.out.print("Alamat  : ");
//      String alamat = input.next();
//     System.out.print("Jaminan : ");
//       String jaminan = input.next();
//     System.out.print("Nama Admin : ");
//       String indexadmin = input.next();
//     pelanggan.insert(nama, notelp, keperluan, alamat);
//        pembayaran.insertt(jaminan, indexadmin, id);
//        System.out.print("Jumlah yang dipesan : ");
//        int jmlh=input.nextInt();
//       for(int j=0;j<jmlh;j++){
//            for(int i=0;i<Hafidz07135_CetakEntity.Cetak.length;i++){
//             System.out.println(i+". "+Hafidz07135_CetakEntity.Cetak[i]);
//               }
//               System.out.print("Percetakan Yang Dipesan : ");
//              int indexcetak = input.nextInt();
//             pembayaranCetak.insert(indexcetak, jmlh, id);
//            }
//     }
//     static void view()
//    {                
//        System.out.println("==========> Daftar Pelanggan <==========");
//       for(int i=0;i<pelanggan.cekDaftarPelanggan(cekpelanggan).size();i++)
//      {
//         System.out.println("ID Pelanggan = "+pembayaran.cekDataPelanggan(cekpelanggan).get(i).getIdPelanggan());
//          System.out.println("Nama Pelanggan = "+pelanggan.cekDaftarPelanggan(cekpelanggan).get(i).getNama());
//          System.out.println("No Telp Pelanggan = "+pelanggan.cekDaftarPelanggan(cekpelanggan).get(i).getNotelp());
//         System.out.println("Keperluan Pelanggan = "+pelanggan.cekDaftarPelanggan(cekpelanggan).get(i).getUmur());
//             System.out.println("Alamat Pelanggan = "+pelanggan.cekDaftarPelanggan(cekpelanggan).get(i).getAlamat());
//            System.out.println("Jaminan Pelanggan = "+pembayaran.cekDataPelanggan(cekpelanggan).get(i).getJaminan());
//          System.out.println("===>["+pembayaran.cekDataPelanggan(cekpelanggan).get(i).getIndexadmin()+"]<==");    
//     }
//      System.out.println("Masukkan ID yang mau dilihat pesanannya : "); //01
//      String IdP=input.next();
//     for(int k=0;k<pembayaranCetak.cekDaftarCetak(cekcetak).size();k++){
//         if(pembayaranCetak.cekDaftarCetak(k).get(k).getIdCetak().equals(IdP)){
//             int indexcetak=pembayaranCetak.cekDaftarCetak(k).get(k).getIndexcetak();
//             if(indexcetak==0){
//                     System.out.println("> Fotocopy");    
//                }else if(indexcetak==1){
//                     System.out.println("> Print");
//                }else if(indexcetak==2){
//                  System.out.println("> Cetak Foto");
//              }else if(indexcetak==3){
//                  System.out.println("> Cetak Undangan");
//              }else if(indexcetak==4){
//                  System.out.println("> Cetak Stiker");
//              }
//          }         
//      }
//      System.out.println("==========> Terimakasih <==========");
//   }
//   static void update(String id)
//   {
//    for(int i=0;i<pelanggan.cekDaftarPelanggan(cekcetak).size();i++)
//    {
//      if(id.equals(pembayaran.cekDataPelanggan(i).get(i).getIdPelanggan()))
//        {
//            System.out.print("Nambah berapa cetak? :");
//            int jmlh=input.nextInt();
//            for(int j=0;j<jmlh;j++){
//            for(int l=0;l<Hafidz07135_CetakEntity.Cetak.length;l++){
//            System.out.println(l+". "+Hafidz07135_CetakEntity.Cetak[l]);
//            }
//             System.out.print("Percetakan Yang Dipesan : ");
//             int indexcetak = input.nextInt();
//            pembayaranCetak.insert(indexcetak, jmlh, id);
//            }
//             break;    
//        }
//      else
//      {
//           System.out.println("ID salah");
//      }        
//   }
//            }
//   static void remove(String id)
//   {
//    for(int i=0;i<pelanggan.cekDaftarPelanggan(cekpelanggan).size();i++)
//    {
//      if(id.equals(pembayaran.cekDataPelanggan(i).get(i).getIdPelanggan()))
//      {
//            pelanggan.remove(i);
//            System.out.println("Data Sudah Di Hapus");
//            break;
//      }
//      else
//      {
//           System.out.println("ID SALAH");       
//      }
//    }
//    for(int j=0;j<pembayaranCetak.cekDaftarCetak(cekcetak).size();j++)
//    {
//        if(id.equals(pembayaranCetak.cekDaftarCetak(j).get(j).getIdCetak()))
//      {
//           pembayaranCetak.remove(j);
//     }
//   }
//    for(int k=0;k<pembayaran.cekDataPelanggan(cekpembayaran).size();k++)
//   {
//       if(id.equals(pembayaran.cekDataPelanggan(k).get(k).getJaminan()))
//       {
//           pembayaran.remove(k);
//       }
      }
//           }   
 }