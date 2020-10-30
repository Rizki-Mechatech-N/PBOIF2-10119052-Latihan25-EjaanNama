package pboif2.pkg10119052.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * ejaan nama 
 * 
 */
public class PBOIF210119052Latihan25EjaanNama {

    public static void main(String[] args) {
        Scanner mulai = new Scanner(System.in);
        System.out.print("Masukkan nama anda untuk di eja : ");
        String nama = mulai.next();
        int jumlahKarakter = nama.length();
        for(int i=0; i<jumlahKarakter; i++){
            System.out.println("Huruf ke-"+(i+1)+" : "+nama.charAt(i));

        }
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Developed By Rizki Dwi Nugraha");      
    }
    
}
