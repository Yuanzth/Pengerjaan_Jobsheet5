import java.util.Scanner;

public class PemilihanPercobaan202 {
    
    public static void main(String[] args) {
        
        float total;

        Scanner input02 = new Scanner(System.in);

        System.out.println("Nilai UAS   : ");
        float uas = input02.nextFloat();
        System.out.println("Nilai UTS   : ");
        float uts = input02.nextFloat();
        System.out.println("Nilai Kuis  : ");
        float kuis = input02.nextFloat();
        System.out.println("Nilai Tugas : ");
        float tugas = input02.nextFloat();

        total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if ( 80 < total && total <= 100) 
        {
            System.out.println("Nilai Huruf Anda = A \nNilai Setara Anda = 4 \nKualifikasi Anda = Sangat Baik");
        }
        else if ( 73 < total && total <= 80) 
        {
            System.out.println("Nilai Huruf Anda = B+ \nNilai Setara Anda = 3,5 \nKualifikasi Anda = Lebih dari Baik");
        }
        else if ( 65 < total && total <= 73) 
        {
            System.out.println("Nilai Huruf Anda = B \nNilai Setara Anda = 3 \nKualifikasi Anda = Baik");
        }
        else if ( 60 < total && total <= 65) 
        {
            System.out.println("Nilai Huruf Anda = C+ \nNilai Setara Anda = 2,5 \nKualifikasi Anda = Lebih dari Cukup");
        }
        else if ( 50 < total && total <= 60) 
        {
            System.out.println("Nilai Huruf Anda = C \nNilai Setara Anda = 2 \nKualifikasi Anda = Cukup");
        }
        else if ( 39 < total && total <= 50) 
        {
            System.out.println("Nilai Huruf Anda = D \nNilai Setara Anda = 1 \nKualifikasi Anda = Kurang");
        }
        else if ( 0 < total && total <= 39)
        {
            System.out.println("Nilai Huruf Anda = E \nNilai Setara Anda = 0 \nKualifikasi Anda = Gagal");
        }
        else 
        {
            System.out.println("Terjadi Kesalahan");
        }
        
        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai Akhir = " + total + " sehingga " + message);
        
    }
}
