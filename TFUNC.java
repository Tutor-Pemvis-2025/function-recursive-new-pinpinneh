import java.util.*;
import java.lang.Math;

public class TFUNC {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, hasil;

        System.out.println("Masukkan bilangan bulat positif (N): ");
        n = Integer.parseInt(input.nextLine());
        hasil = hitungRekursif(n);
        System.out.println("Hasil penjumlahan dari 1 sampai " + n + " adalah: " + hasil);
    }

    public static int hitungRekursif(int angka) {
        int hasilFungsi;

        if (angka == 1) {
            hasilFungsi = 1;
        } else {
            hasilFungsi = angka + hitungRekursif(angka - 1);
        }

        return hasilFungsi;
    }
}
