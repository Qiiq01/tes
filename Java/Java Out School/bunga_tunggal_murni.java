import java.util.Scanner;

public class bunga_tunggal_murni {

    public static void main(String[] args) {
        double M,P,T;
        String huruf, masuk;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Pilihan Anda Sesuai Soal (/thn, /bln, /hari)= ");
        masuk= input.next();
        System.out.print("Masukkan Nilai Modal = ");
        M = input.nextDouble();
        System.out.print("Masukkan Nilai Persen = ");
        P = input.nextDouble();
        System.out.print("Masukkan Nilai Waktu = ");
        T = input.nextDouble();
        System.out.print("Masukkan Pilihan Waktu Anda (thn, bln, atau hari)= ");
        huruf = input.next();

        switch (masuk) {
            case "/thn":
                switch (huruf) {
                    case "thn" :
                        double hasil1 = (M * P * T) / 100;
                        System.out.print("= Rp" + hasil1);
                        break;
                    case "bln":
                        double hasil11 = (M* P * T) / (100*12);
                        System.out.print("= Rp" + hasil11);
                        break;
                    case "hari" :
                        double hasil111 = (M * P * T) / (100*360);
                        System.out.print("= Rp" + hasil111);
                        break;
                    default:
                        System.out.print("Hasil Tidak Ditemukan / Pengetikan Kata Tidak Sesuai/Salah");
                        break;
                }break;
            case "/bln":
                switch (huruf) {
                    case "thn" :
                        double hasil2 = (M * P * T*12) / 100;
                        System.out.print("= Rp" + hasil2);
                        break;
                    case "bln" :
                        double hasil22 = (M* P * T) / (100);
                        System.out.print("= Rp" + hasil22);
                        break;
                    case "hari" :
                        double hasil222 = (M * P * T) / (100*360);
                        System.out.print("= Rp" + hasil222);
                        break;
                    default:
                        System.out.print("Hasil Tidak Ditemukan / Pengetikan Kata Tidak Sesuai/Salah");
                        break;
                }break;
            case "/hari":
                switch (huruf) {
                    case "thn" :
                        double hasil3 = (M * P * T*12) / 100;
                        System.out.print("= Rp" + hasil3);
                        break;
                    case "bln" :
                        double hasil33 = (M* P * T*30) / (100);
                        System.out.print("= Rp" + hasil33);
                        break;
                    case "hari" :
                        double hasil333 = (M * P * T) / (100);
                        System.out.print("= Rp" + hasil333);
                        break;
                    default:
                        System.out.print("Hasil Tidak Ditemukan / Pengetikan Kata Tidak Sesuai/Salah");
                        break;
                }break;
            default:
                System.out.print("Hasil Tidak Ditemukan / Pengetikan Kata Tidak Sesuai/Salah ");
                break;
        }
        input.close();
    }
}