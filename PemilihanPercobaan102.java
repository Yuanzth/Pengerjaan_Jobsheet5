import java.util.Scanner;

public class PemilihanPercobaan102 {

    public static void main(String[] args) {
        
        Scanner input02 = new Scanner(System.in);

        int angka;

        System.out.println("Masukan angka:  ");
        angka = input02.nextInt();

        String jenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " bilangan " + jenisAngka);
        
    }
    
}