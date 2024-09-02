import java.util.Scanner;

public class bunga_tunggal_murni_variable_angka {

    public static void main(String[] args) {
        double M,P,T;
        int huruf;
        int masuk;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Pilihan Anda \n 1: Jika Soal ditanya P%/thn \n 2: Jika Soal ditanya P%/bln \n 3: Jika Soal ditanya P%/hari\n" +
                "Masukkan Pilihan anda : 1/2/3 = " );
        masuk= input.nextInt();
        System.out.print("Masukkan Nilai Modal = ");
        M = input.nextDouble();
        System.out.print("Masukkan Nilai Persen = ");
        P = input.nextDouble();
        System.out.print("Masukkan Nilai Waktu = ");
        T = input.nextDouble();
        System.out.print("Pilih Angka Waktu \n 1: thn \n 2: bln \n 3: hari \n" + "Masukkan Pilihan Anda 1/2/3 = ");

        huruf = input.nextInt();

        switch (masuk) {
            case 1:
                switch (huruf) {
                    case 1:
                        double hasil1 = (M * P * T) / 100;
                        System.out.print("= Rp" + hasil1);
                        break;
                    case 2:
                        double hasil11 = (M* P * T) / (100*12);
                        System.out.print("= Rp" + hasil11);
                        break;
                    case 3:
                        double hasil111 = (M * P * T) / (100*360);
                        System.out.print("= Rp" + hasil111);
                        break;
                    default:
                        System.out.print("Hasil tidak ditemukan");
                        break;
                }break;
            case 2:
                switch (huruf) {
                    case 1:
                        double hasil2 = (M * P * T*12) / 100;
                        System.out.print("= Rp" + hasil2);
                        break;
                    case 2:
                        double hasil22 = (M* P * T) / (100);
                        System.out.print("= Rp" + hasil22);
                        break;
                    case 3:
                        double hasil222 = (M * P * T) / (100*360);
                        System.out.print("= Rp" + hasil222);
                        break;
                    default:
                        System.out.print("Hasil tidak ditemukan");
                        break;
                }break;
            case 3:
                switch (huruf) {
                    case 1:
                        double hasil3 = (M * P * T*12) / 100;
                        System.out.print("= Rp" + hasil3);
                        break;
                    case 2:
                        double hasil33 = (M* P * T*30) / (100);
                        System.out.print("= Rp" + hasil33);
                        break;
                    case 3:
                        double hasil333 = (M * P * T) / (100);
                        System.out.print("= Rp" + hasil333);
                        break;
                    default:
                        System.out.print("Hasil tidak ditemukan");
                        break;
                }break;
            default:
                System.out.print("Hasil tidak ditemukan");
                break;
        }
        input.close();
    }
}