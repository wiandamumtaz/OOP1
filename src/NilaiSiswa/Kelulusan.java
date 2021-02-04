
package NilaiSiswa;

public class Kelulusan {
    
    public static void main(String[] args) {
    //object
    Siswa Pelajar= new Siswa();
    
    //pengisian atribut 
    Pelajar.nama = "Anya";
    Pelajar.nilai = 80;
    
    //menjalankan method 
    Pelajar.cetaknilai();
    
    //menentukan lulus
    if(Pelajar.lulus()){
            System.out.println("Selamat anda lulus");      
    }
    else if (Pelajar.tidaklulus()){
            System.out.println("Anda Harus Belajar Lebih Giat");
            
    
    }
    }
}
