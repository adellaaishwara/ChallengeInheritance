 package soalchallenge;
 import java.util.Scanner;
public class TokoSepatu{
    Scanner input = new Scanner (System.in);
    private String infoSepatu;
    int pilih;
    String merek;
    String color;
    String gender;
    String ktgr;
    String ukur;
    String hiya;

 
    
   
    public String MerkSepatu (){
        System.out.println("[1]ADIDAS   [2]NIKE     [3]SKECHERS     [4]PUMA     [5]REEBOK   [6]VANS     [7]CONVERSE     [8]FILA");
        switch(pilih){
            case 1:merek="ADIDAS";
            case 2:merek="NIKE";
            case 3:merek="SKECHERS";
            case 4:merek="PUMA";
            case 5:merek="REEBOK";
            case 6:merek="VANS";
            case 7:merek="CONVERSE";
            case 8:merek="FILA";
                    
        }
        System.out.println("=== Silahkan masukkan pilihan Sepatu ===");
        pilih=input.nextInt();
        return merek;
    }
    
    public String Warna (){
        System.out.println("[1]BLACK    [2]WHITE    [3]GOLD         [4]SILVER   [5]GREEN    [6]YELLOW   [7]BLUE         [8]RED");
        switch(pilih){
            case 1:color="BLACK";
            case 2:color="WHITE";
            case 3:color="GOLD";
            case 4:color="SILVER";
            case 5:color="GREEN";
            case 6:color="YELLOW";
            case 7:color="BLUE";
            case 8:color="RED";
        }
        System.out.println("=== Silahkan masukkan pilihan Warna ===");
        pilih=input.nextInt();
        return color;
    }
    
    public String Jenis () {
        System.out.println("[1]CEWEK     [2]COWOK");
        switch(pilih){
            case 1:gender="CEWEK";
            case 2:gender="COWOK";
        }
        System.out.println("=== Silahkan masukkan pilihan Jenis ===");
        pilih=input.nextInt();
        return gender;
    }
    
    public String Kategori (){
        System.out.println("[1]OLAHRAGA [2]LARI [3]SANTAI [4]KANTORAN");
        switch(pilih){
            case 1:ktgr="OLAHRAGA";
            case 2:ktgr="LARI";
            case 3:ktgr="SANTAI";
            case 4:ktgr="KANTORAN";
        }
        System.out.println("=== Silahkan masukkan pilihan Kategori ===");
        pilih=input.nextInt();
        return ktgr;
    }
    
    public String Size (){
        System.out.println("-25-    -26-    -27-    -28-    -29-    -30-    -31-    -32-    -33-    -34-");
        switch(pilih){
            case 1:ukur="25";
            case 2:ukur="26";
            case 3:ukur="27";
            case 4:ukur="28";
            case 5:ukur="29";
            case 6:ukur="30";
            case 7:ukur="31";
            case 8:ukur="32";
            case 9:ukur="33";
            case 10:ukur="34";  
        }
        System.out.println("=== Silahkan masukkan pilihan Size ===");
        pilih=input.nextInt();
        return ukur;
    }
    
    public String Harga(){
        System.out.println("[1]200.000      [2]300.000      [3]400.000      [4]500.000      [5]600.000      [6]700.000      [7]800.000      [8]900.000");
        switch(pilih){
            case 1:hiya="200.000";
            case 2:hiya="300.000";
            case 3:hiya="400.000";
            case 4:hiya="500.000";
            case 5:hiya="600.000";
            case 6:hiya="700.000";
            case 7:hiya="800.000";
            case 8:hiya="900.000";      
        }
        System.out.println("=== Silahkan masukkan pilihan Harga ===");
        pilih=input.nextInt();
        return hiya;
    }    
}
 