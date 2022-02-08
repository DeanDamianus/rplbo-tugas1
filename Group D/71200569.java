package soal1;
import java.util.*;

class main {
    public static void main(String[] args) {
        System.out.println("Menghitung Bilangan 1 sampai n bilangan");
        System.out.println("________________________________________________");

        System.out.println("NIM anda 71200569 dan 3 digit terakhir 569");
        int n = 569;
        int hasil = 0;

        for (int i=1; i<=n; i++)
            hasil += i;
        System.out.println("Jumlah bilangan = " + hasil);
  
        String nama = "Damianus Atisanta Sahasrakirana";
        String nim = "71200569";
        System.out.println("TERIMA KASIH " + nim + " " + nama);
    }
}