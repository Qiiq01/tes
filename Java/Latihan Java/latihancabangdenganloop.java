import java.util.Scanner;
public class latihancabangdenganloop {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        for ( int i = 0; i <= 3; i++) {

        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.next();
        System.out.print("Masukkan Nilai: ");
        int Nilai = scanner.nextInt();
        

        if (Nilai<=45) {
            System.out.println(nama + "Nilai Anda D");
        }
        else if (Nilai<=55) {
            System.out.println(nama + "Nilai Anda C");
        }
        else if (Nilai<=65) {
            System.out.println(nama + "Nilai Anda C+");
        }
        else if (Nilai<=75){
            System.out.println(nama + "Nilai Anda B");
        }
        else if (Nilai<=85){
            System.out.println(nama + "Nilai Anda B+");
        }
        else {
            System.out.println(nama + "Nilai Anda A");
        }
         }
         scanner.close();
    }
}
