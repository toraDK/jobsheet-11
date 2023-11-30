import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Bilangan yang dihitung: "); 
        int bilangan = sc.nextInt();
        System.out.print ("Pangkat: ");
        int pangkat = sc.nextInt();

        hitungPangkat(bilangan, pangkat);
        cetakpangkat(bilangan, pangkat);
    }   

    static int hitungPangkat(int x, int y){
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat (x, y - 1));
        }
    }

    static void cetakpangkat(int x, int y){
        if (y == 0) {
            System.out.println("1");
        }else{
            System.out.print(x + "x");
            cetakpangkat(x, y - 1);
        }
    }
}
