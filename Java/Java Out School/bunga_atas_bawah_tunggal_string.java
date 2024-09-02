import java.util.Scanner;

public class bunga_atas_bawah_tunggal_string {

    public static void main(String[] args) {
        double P,M;
        String masuk;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Pilihan Soal Anda (diatas100, dibawah100)= " );
        masuk= input.next();
        System.out.print("Masukkan Nilai Persen = ");
        P = input.nextDouble();
        System.out.print("Masukkan Nilai Modal = ");
        M = input.nextDouble();

        switch (masuk) {
            case "diatas100":
                double hasil = (P*M) / (100+P);
                System.out.println("Hasilnya adalah " + "RP" + hasil);
                break;
            case "dibawah100":
                double hasil1 = (P*M) / (100-P);
                System.out.println("Hasilnya adalah " + "RP " + hasil1);
                break;
            default:
                System.out.println("Hasil Tidak Ditemukan");
        }
        input.close();
    }
}