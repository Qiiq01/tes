import java.util.Scanner;

public class latihan_bunga_majemuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hasil2 = 1;
        double hasil22 = 1;

        System.out.println("KALKULATOR BUNGA MAJEMUK\n");
        System.out.print("Masukkan nilai modal: ");
        double modal = input.nextDouble();
        System.out.print("Masukkan nilai persen: ");
        double persen = input.nextDouble();
        /*System.out.print("Masukkan jangka waktu (tahun): ");
        double waktu = input.nextDouble();*/
        System.out.print("Pilih bunga majemuk\n" + "1. Nilai Akhir\n" + "2. Nilai Tunai\n" + ": ");
        int pilih = input.nextInt();


        switch (pilih) {
            case 1:
                System.out.print("Masukkan jangka waktu: ");
                double waktu = input.nextDouble();
                double hasil1 = (1+(persen/100));
                //double hasil2 = Math.pow(hasil1, waktu); //JIKA INGIN MENGGUNAKAN METODE SINGKAT GUNAKAN MATH
                for (int i = 0; i < waktu; i++) { // METODE UMUM MENGGUNAKAN LOOPING
                    hasil2 *= hasil1;
                }
                double hasil3 = modal * hasil2;
                System.out.printf("%,f\n", hasil3);
                break;
            case 2:
                System.out.print("Masukkan jangka waktu: ");
                double waktu2 = input.nextDouble();
                double hasil12 = (1+(persen/100));
                //double hasil2 = Math.pow(hasil1, waktu); //JIKA INGIN MENGGUNAKAN METODE SINGKAT GUNAKAN MATH
                for (int i = 0; i < waktu2; i++) { // METODE UMUM MENGGUNAKAN LOOPING
                    hasil22 *= hasil12;
                }
                double hasil32 = modal / hasil22;
                System.out.printf("%,f\n", hasil32);
                break;
            default:
                System.out.println("Hasil Tidak ada");
                break;
        }
        input.close();
    }
}