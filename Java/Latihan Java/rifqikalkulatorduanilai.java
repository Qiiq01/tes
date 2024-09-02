import java.util.Scanner;
public class rifqikalkulatorduanilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

System.out.println("==========================================");
System.out.println("MENGHITUNG CALCULATOR SEDERHANA DUA NILAI||");
System.out.println("==========================================");



            

/*System.out.print("Masukkan operator (+, -, *, /) = ");
char operator = input.next().charAt(0);*/
    System.out.print("Masukkan Pilihan \n 1. Penjumlahan \n 2. Pengurangan \n 3. Perkalian \n 4. Pembagian \n = ");
    int pilihan = input.nextInt();
System.out.println();
System.out.println();

            switch (pilihan) {
                case 1:
                System.out.println("Pilihan Anda Penjumlahan");
                System.out.println("==========================================");
                    System.out.print("Masukkan Nilai kesatu = ");
                    double a = input.nextDouble();
                    System.out.println(a + " + ");
                    System.out.print("Masukkan Nilai kedua = ");
                    double b = input.nextDouble();
                System.out.println("==========================================");
                    double rifqitambah = a + b;
                    System.out.print("Hasil dari " + a + " + " + b + " adalah " + rifqitambah);
                    break;

                case 2:
                System.out.println("Pilihan Anda Pengurangan");
                System.out.println("==========================================");
                    System.out.print("Masukkan Nilai kesatu = ");
                    double c = input.nextDouble();
                    System.out.println(c + " - ");
                    System.out.print("Masukkan Nilai kedua = ");
                    double d = input.nextDouble();
                System.out.println("==========================================");
                    double rifqikurang = c - d;
                    System.out.print("Hasil dari " + c + " - " + d + " adalah "  + rifqikurang);
                    break;

                case 3:
                System.out.println("Pilihan Anda Perkalian");
                System.out.println("==========================================");
                    System.out.print("Masukkan Nilai kesatu = ");
                    double e = input.nextDouble();
                    System.out.println(e + " x ");
                    System.out.print("Masukkan Nilai kedua = ");
                    double f = input.nextDouble();
                System.out.println("==========================================");
                    double rifqikali = e * f;
                    System.out.print("Hasil dari " + e + " x " + f + " adalah "  + rifqikali);
                    break;

                case 4:
                System.out.println("Pilihan Anda Pembagian");
                System.out.println("==========================================");
                    System.out.print("Masukkan Nilai kesatu = ");
                    double g = input.nextDouble();
                    System.out.println(g + " / ");
                    System.out.print("Masukkan Nilai kedua = ");
                    double h = input.nextDouble();
                System.out.println("==========================================");
                    double rifqibagi = g / h;
                    System.out.print("Hasil dari " + g + " / " + h + " adalah "  + rifqibagi);
                    break;
                    
                default:
                System.out.println("Tidak ada hasil pilihan");
                    break;
            }
            System.out.println("\n by: Ihsan");
        input.close();
    }
}