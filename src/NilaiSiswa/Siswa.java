
package NilaiSiswa;

public class Siswa {
    //Mendefinisikan atribut
    String nama;
    int nilai;
    
    //method cetak nilai 
    public void cetaknilai(){
            System.out.println("Nilai Produktif RPL 5 "+nama+"adalah = "+nilai);
            
    }
    //method pengecekan 
    public boolean lulus(){
        return nilai>=75;
    }
    public boolean tidaklulus(){
        return nilai<74;
        
    }
    
    
}
