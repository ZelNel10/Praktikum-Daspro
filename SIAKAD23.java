import java.util.Scanner;
public class SIAKAD23 {

    public static void main(String[] args) {
        //Deklarasi variabel
        String nama;
        int nim, noAbsen;
        char kelas;
        double nilaiKuis, nilaiTugas, nilaiUjian;

        //Input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan nim: ");
        nim = input.nextInt();
        System.out.print("Masukkan no absen: ");
        noAbsen = input.nextInt();
        System.out.print("Masukkan kelas: ");
        kelas = input.next().charAt(0);
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = input.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = input.nextDouble();

        System.out.println("Mahasiswa dengan nama " + nama + " ( NIM " + nim + ")" + " Kelas " + kelas + " nomor absen " + noAbsen);

        double nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        System.out.println("Nilai akhir: " + nilaiAkhir);

        String nilaiAkhirHuruf;
        String kualifikasi;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiAkhirHuruf = "A";
            kualifikasi = "Sangat baik";
        } 
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiAkhirHuruf = "B+";
            kualifikasi = "Lebih dari baik";
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiAkhirHuruf = "B";
            kualifikasi = "Baik";
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiAkhirHuruf = "C+";
            kualifikasi = "Lebih dari cukup";
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiAkhirHuruf = "C";
            kualifikasi = "Cukup";
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiAkhirHuruf = "D";
            kualifikasi = "Kurang";
        }
        else if (nilaiAkhir <= 39) {
            nilaiAkhirHuruf = "E";
            kualifikasi = "Gagal";
        }
        else {
            nilaiAkhirHuruf = "Invalid";
            kualifikasi = "Invalid";
        }

        System.out.println("Nilai akhir huruf: " + nilaiAkhirHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}