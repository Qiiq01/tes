import java.util.Arrays;

public class ulanganlatihan {
    public static void main (String [] args){
          System.out.println("Nomor 1");
          int satu = 0;
            while (satu < 10) {
                satu++;
                System.out.print(satu + " ");
            }
System.out.println();
            int satudua = 1;
            do {
                System.out.print(satudua + " ");
                satudua++;
              }
              while (satudua <= 10);{
         }
System.out.println();
System.out.println();
        System.out.println("Nomor 2");
            for (int dua = 91; dua <= 100; dua++){
                System.out.print(dua + " ");
            }
System.out.println();
System.out.println();
        System.out.println("Nomor 3");
            for ( int i = 5; i > 0; i--){
                for ( int j = 0; j < i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }        
System.out.println();
            System.out.println("Nomor 4");
            int [] ihsan = {80,90,70,95,85};
            System.out.println("Secara Langsung");
            System.out.print(ihsan[0] + " ");
            System.out.print(ihsan[1] + " ");
            System.out.print(ihsan[2] + " ");
            System.out.print(ihsan[3] + " ");
            System.out.print(ihsan[4] + " ");
System.out.println();
            System.out.println("Secara Perulangan");
            for ( int i = 0; i < ihsan.length; i++){
                System.out.print(ihsan [i] + " ");
            }
            System.out.println();
            for ( int angka:ihsan) {
                System.out.print(angka + " ");
            }
System.out.println();
System.out.println();
            System.out.println("Nomor 5");
            String [][] rifqi = { {"Senin","Selasa"}, {"Rabu", "Jumat"}, {"Kamis", "Sabtu"} };
            System.out.println("Secara Langsung");
            System.out.print(rifqi[0][0] + " ");
            System.out.print(rifqi[0][1] + " ");
            System.out.print(rifqi[1][0] + " ");
            System.out.print(rifqi[1][1] + " ");
            System.out.print(rifqi[2][0] + " ");
            System.out.print(rifqi[2][1] + " ");
System.out.println();
            System.out.println("Secara Perulangan");
            System.out.println( Arrays.toString(ihsan));
            for (int i = 0; i < rifqi.length; i++) {
            for (int j = 0; j < rifqi[i].length; j++) {
                System.out.print(rifqi[i][j]+ " ") ;
            }
        }
    }
}