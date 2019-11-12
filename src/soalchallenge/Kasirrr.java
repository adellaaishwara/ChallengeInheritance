package soalchallenge;

import java.util.Scanner;
public class Kasirrr  {
    public static void main(String []args){
        int MerkSepatu;
        int Warna;
        int Jenis;
        int Kategori;
        int Size;
        int Harga;
        int Diskon;
        int Total;
   
    Scanner aish = new Scanner(System.in);
        System.out.println("=========================-----> JAYA BARU SPORTS <-----========================");
        System.out.println("========== SELAMAT DATANG DI JAYA BARU SPORTS DAN SELAMAT BERBELANJA ==========");
        System.out.println("-------------------->>> SILAHKAN MASUKKAN NAMA KASIR <<<------------------------");
        String NamaKasir = aish.next();
        System.out.print("Nama Kasir :"+NamaKasir);
        System.out.println(" ");
        System.out.println("==================--- Data Sepatu di toko JAYA BARU SPORTS ---=================");
        int jumlah;
        
        
         TokoSepatu toko = new TokoSepatu();
            toko.MerkSepatu();
            toko.Warna();
            toko.Jenis();
            toko.Kategori();
            toko.Size();
            toko.Harga();
        
        System.out.println("Masukkan Jumlah Beli");
        jumlah=aish.nextInt();
    
        if(jumlah==1){
            int uk = 0;
            if(uk<=25){
                Harga=200000;
                System.out.println("Total : Rp.200.000\n__________Harga__________\n-=Harga :"+Harga);
            } else {
                if(uk<=30){
                    Harga=250000;
                    System.out.println("Total : Rp.600.000\n__________Harga__________\n-=Harga :"+Harga);
                }
                if(uk>=31){
                    Harga=900000;
                    System.out.println("Total : Rp.900.000\n__________Harga__________\n-=Harga :"+Harga);}}}
                
            
        else{
            if(jumlah==2){
                int uk = 0;
                if(uk<=25){
                    Harga=2*200000-50000;
                    System.out.println("Total : Rp.200.000 x 2 = 400.000\n Diskon : 200.000 - 50.000\n__________Harga Diskon__________\n-=Harga :"+Harga);
                } else{
                    if(uk<=30){
                        Harga=2*250000-50000;
                        System.out.println("Total : Rp.600.000 x 2 = 500.000\n Diskon : 500.000 - 50.000\n__________Harga Diskon__________\n-=Harga :"+Harga);
                    }
                    if(uk>=31){
                        Harga=2*900000-50000;
                        System.out.println("Total : Rp.900.000 x 2 = 1.800.000\n Diskon : 1.800.000 - 50.000\n__________Harga Diskon_________\n-=Harga :"+Harga);}}}
                    
                    
                
         else{
            if(jumlah>=3){
                int uk = 0;
                if(uk<=25){
                    Harga=jumlah*200000-100000;
                    System.out.println("Harga : Rp.200.000 * "+jumlah+"\nDiskon : 100.000\n__________Harga Diskon__________\n-=Harga :"+Harga);
                } else{
                    if(uk<=30){
                        Harga=jumlah*250000-100000;
                        System.out.println("Harga : Rp.600.000 * "+jumlah+"\nDiskon : 100.000\n__________Harga Diskon__________\n-=Harga :"+Harga);
                    }
                    if(uk>=31){
                        Harga=jumlah*900000-100000;
                        System.out.println("Harga : Rp.900.000 * "+jumlah+"\nDiskon : 100.000\n__________Harga Diskon__________\n-=Harga :"+Harga);
                    
                    }}}}}}}
            
            
            
    
    

    
    
   
           
                                                    
    
    
    
    
    
   

