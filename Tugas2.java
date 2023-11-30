import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {

        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan nilai f : ");
        int f = sc27.nextInt();

        int hasil = penjumlahanRekursif(f);
        System.out.println("Hasil penjumlahan : " + hasil);

        System.out.println("Proses penjumlahan : ");
        prosesPenjumlahan(f);
    }

    public static int penjumlahanRekursif(int n){
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }
    public static void prosesPenjumlahan(int n) {
        if (n == 1) {
            System.out.print("1");
        } else {
            prosesPenjumlahan(n - 1);
            System.out.print(" + " + n);
        }
    }
}
