import java.util.Scanner;

public class latihan_bunga_tunggal_metode_tetap {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai yang ingin dimasukkan: ");
        int jumlahNilai = scanner.nextInt();
        System.out.print("Pilihan: 1.Hari, 2.Bulan, 3.Tahun\n"+ "Masukkan Pilihan Anda: ");
        int masuk = scanner.nextInt();
        double totalBunga = 0;

        for (int i = 0; i < jumlahNilai; i++) {
            switch (masuk) {
                case 1:
                    System.out.print("Masukkan nilai Modal ke-" + (i + 1) + ": ");
                    double nilai = scanner.nextDouble();

                    System.out.print("Masukkan tingkat bunga: ");
                    double bunga = scanner.nextDouble();

                    System.out.print("Masukkan jangka waktu (dalam hari): ");
                    int jangkaWaktu = scanner.nextInt();

                    double bungaTunggal = (nilai * (bunga / 100) * jangkaWaktu) / 360;
                    totalBunga += bungaTunggal;
                    break;

                case 2:
                    System.out.print("Masukkan nilai Modal ke-" + (i + 1) + ": ");
                    double nilai2 = scanner.nextDouble();

                    System.out.print("Masukkan tingkat bunga: ");
                    double bunga2 = scanner.nextDouble();

                    System.out.print("Masukkan jangka waktu (dalam hari): ");
                    int jangkaWaktu2 = scanner.nextInt();

                    double bungaTunggal2 = (nilai2 * (bunga2/ 100) * jangkaWaktu2) / 12;
                    totalBunga += bungaTunggal2;
                    break;
                case 3:
                    System.out.print("Masukkan nilai Modal ke-" + (i + 1) + ": ");
                    double nilai3 = scanner.nextDouble();

                    System.out.print("Masukkan tingkat bunga: ");
                    double bunga3 = scanner.nextDouble();

                    System.out.print("Masukkan jangka waktu (dalam hari): ");
                    int jangkaWaktu3 = scanner.nextInt();

                    double bungaTunggal3 = (nilai3 * (bunga3 / 100) * jangkaWaktu3);
                    totalBunga += bungaTunggal3;
                    break;
            }
        }
        System.out.println("Total bunga yang harus dibayarkan: " + totalBunga);
        scanner.close();
    }
}

