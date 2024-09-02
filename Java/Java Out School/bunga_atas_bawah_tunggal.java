import java.util.Scanner;

public class bunga_atas_bawah_tunggal {

    public static void main(String[] args) {
        double P,M;
        int masuk;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Pilihan Anda \n 1 Persen Diatas 100 \n 2 Persen Dibawah 100\n" +
                "Masukkan Pilihan anda : 1/2 = " );
        masuk= input.nextInt();

        switch (masuk) {
            case 1:
                System.out.print("Masukkan Nilai Persen = ");
                P = input.nextDouble();
                System.out.print("Masukkan Nilai Modal = ");
                M = input.nextDouble();
                double hasil = (P*M) / (100+P);
                System.out.println("Hasil Dari Persen Diatas Seratus adalah " + "RP" + hasil);
                break;
            case 2:
                System.out.print("Masukkan Nilai Persen = ");
                P = input.nextDouble();
                System.out.print("Masukkan Nilai Modal = ");
                M = input.nextDouble();
                double hasil1 = (P*M) / (100-P);
                System.out.println("Hasil Dari Persen Dibawah Seratus adalah " + "RP " + hasil1);
                break;
            default:
                System.out.println("Hasil Tidak Ditemukan");
        }
        input.close();
    }
}