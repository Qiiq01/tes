import java.util.Scanner;

public class latihan_bunga_majemuk_pecahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hasil2 = 1;
        double hasil22 = 1;

        System.out.println(10 * 2);
        System.out.println("KALKULATOR BUNGA MAJEMUK PECAHAN\n");
        System.out.print("Masukkan nilai modal akhir: ");
        double modal = input.nextDouble();
        System.out.print("Masukkan nilai persen: ");
        double persen = input.nextDouble();
        /*System.out.print("Masukkan jangka waktu (tahun): ");
        double waktu = input.nextDouble();*/
        System.out.print("Masukkan pecahan pertama: ");
        //double pecahan1 = input.nextDouble();
        System.out.print("Masukkan pecahan kedua: ");
        double pecahan2 = input.nextDouble();
        System.out.print("Pilih bunga majemuk\n" + "1. Nilai Akhir\n" + "2. Nilai Tunai\n" + ": ");
        int pilih = input.nextInt();


        switch (pilih) {
            case 1:
                System.out.print("Masukkan jangka waktu: ");
                double waktu = input.nextDouble();
                double hasilpers1 = persen/100;
                double hasil1 = (1+hasilpers1);
                //double hasilpec1 = pecahan1 * hasilpers1;
                double hasilpers2 = 1 + (hasilpers1 / pecahan2);
                //double hasil2 = Math.pow(hasil1, waktu); //JIKA INGIN MENGGUNAKAN METODE SINGKAT GUNAKAN MATH
                for (int i = 0; i < waktu; i++) { // METODE UMUM MENGGUNAKAN LOOPING
                    hasil2 *= hasil1;
                }
                double hasil3 = modal * hasil2 * hasilpers2;
                System.out.printf("%,f\n", hasil3);
                break;
            case 2:
                System.out.print("Masukkan jangka waktu: ");
                double waktu2 = input.nextDouble();
                double hasilpers12 = persen/100;
                double hasil12 = (1+hasilpers12);
                //double hasilpec12 = pecahan1 * hasilpers12;
                double hasilpers22 = 1 + (hasilpers12 / pecahan2);
                //double hasil2 = Math.pow(hasil1, waktu); //JIKA INGIN MENGGUNAKAN METODE SINGKAT GUNAKAN MATH
                for (int i = 0; i < waktu2; i++) { // METODE UMUM MENGGUNAKAN LOOPING
                    hasil22 *= hasil12;
                }
                double hasil32 = modal / (hasil22 * hasilpers22);
                System.out.printf("%,f\n", hasil32);
                break;
            default:
                System.out.println("Hasil Tidak ada");
        }
        input.close();
    }
}