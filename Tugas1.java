import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        

        System.out.println("Menggunakan rekursif : ");
        deretRekursif(5);

        System.out.println();
        
        System.out.println("Menggunakan iterarif : ");
        deretIteratif(5);

    }


    public static void deretRekursif(int n) {
        if (n>= 0){
            System.out.print(n + " ");
            deretRekursif(n - 1);
        }
    }
    
    public static void deretIteratif(int n){
        for (int i = n; i >= 0; i--){
            System.out.print(i + " ");
        }
    }
}
