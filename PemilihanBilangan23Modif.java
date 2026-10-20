import java.util.Scanner;
public class PemilihanBilangan23Modif {
    public static void main(String[] args) {
        //Input angka
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        String hasil;

        //Ternary operator
        hasil = (angka % 2 == 0) ? "Ganjil" : "Genap";
        System.out.println(hasil);

        sc.close();
    }
}
