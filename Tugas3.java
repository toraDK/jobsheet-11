import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan suatu bilangan: ");
        int bilangan = sc27.nextInt();
        int bagi = bilangan - 1;
        if (cekPrimaRekursif(bilangan, bagi)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }

    static boolean cekPrimaRekursif(int n, int bagi) {
        if (n == 1) {
            return false;
        } if (bagi == 1) {
            return true;
        } if (n % bagi == 0) {
            return false;
        } else {
            return cekPrimaRekursif(n, bagi - 1);
        }
    }

}
