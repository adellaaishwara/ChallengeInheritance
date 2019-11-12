/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalchallenge;

/**
 *
 * @author User
 */
public class DataSepatu {
    
    String MerkSepatu;
    String Warna;
    String Jenis;
    String Kategori;
    int Size;
    int Harga;
    int Diskon;
    int Total;
    
    public DataSepatu(String MerkSepatu,String Warna, String Jenis, String Kategori, int Size, int Harga, int Diskon, int Total)
    {
        this.MerkSepatu = MerkSepatu;
        this.Warna = Warna;
        this.Jenis = Jenis;
        this.Kategori = Kategori;
        this.Size = Size;
        this.Harga = Harga;
        this.Diskon = Diskon;
        this.Total = Total;
        
    }
    
    public void info()
    {
        System.out.println("Merk Sepatu :"+MerkSepatu);
        System.out.println("Warna :"+Warna);
        System.out.println("Jenis :"+Jenis);
        System.out.println("Kategori"+Kategori);
        System.out.println("Size :"+Size);
        System.out.println("Harga :"+Harga);
        System.out.println("Diskon :"+Diskon);
        System.out.println("Total :"+Total);
        
    }
}
    
