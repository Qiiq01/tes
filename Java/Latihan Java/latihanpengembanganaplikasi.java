import java.util.Scanner;
public class latihanpengembanganaplikasi {
    public static void main(String[]args){
        Scanner User = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("MENGHITUNG ENERGI KINETIK, MASSA, DAN KECEPATAN");
        System.out.println("===============================================");

        
        System.out.print("Pilihan yang di cari \n 1. Energi Kinetik \n 2. Massa \n 3. Kecepatan/v \n = ");
        int pindah = User.nextInt();


        switch (pindah) {
            case 1:
            System.out.print("Masukkan Massa: ");
            double m = User.nextDouble();
            System.out.print("Masukkan Kecepatan: ");
            double v = User.nextDouble();
            double ek = (m * v * v)/2;
            System.out.print("Energi kinetik diatas adalah " + ek );
                break;
                
            case 2: 
            System.out.print("Masukkan Energi Kinetik: ");
            double ek2 = User.nextDouble();
            System.out.print("Masukkan Kecepatan: ");
            double v2 = User.nextDouble();
            double hasil2 = 2 * ek2 / (v2 * v2);
            System.out.print("Hasil Massa diatas adalah " + hasil2 );
                break;
        

            case 3:
            System.out.print("Masukkan Energi Kinetik: ");
            double ek3 = User.nextDouble();
            System.out.print("Masukkan Massa: ");
            double m3 = User.nextDouble();
            double hasil3 = Math.sqrt((2 * ek3) / m3);
            
            System.out.printf("Hasil Kecepatan diatas adalah %f \n ", hasil3 + " m/s" );
                break;

            default:
                break;
        }
        User.close();
    }
}
