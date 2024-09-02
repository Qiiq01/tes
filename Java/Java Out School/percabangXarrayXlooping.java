import java.util.Scanner;

public class percabangXarrayXlooping {
    public static void main(String[] args) {
        String[] name = new String[3];
        int[] number = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan Nama: ");
            name[i] = scanner.nextLine();
            System.out.print("Masukkan Nilai: ");
            number[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            if (number[i] <= 45) {
                System.out.println(name[i] + ": Nilai Anda D");
            } else if (number[i] <= 55) {
                System.out.println(name[i] + ": Nilai Anda C");
            } else if (number[i] <= 65) {
                System.out.println(name[i] + ": Nilai Anda C+");
            } else if (number[i] <= 75) {
                System.out.println(name[i] + ": Nilai Anda B");
            } else if (number[i] <= 85) {
                System.out.println(name[i] + ": Nilai Anda B+");
            } else {
                System.out.println(name[i] + ": Nilai Anda A");
            }
        }
        scanner.close();
    }
}
