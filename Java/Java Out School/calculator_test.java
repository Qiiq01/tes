import java.util.Scanner;
public class calculator_test {
    public static void main(String[] args) {

        double a, b;
        char operator;
        boolean calculatorr = true;
        Scanner input = new Scanner(System.in);

        while (calculatorr) {
            System.out.print("Masukkan Nilai kesatu = ");
            a = input.nextDouble();
            System.out.print("Masukkan operator = ");
            operator = input.next().charAt(0);
            System.out.print("Masukkan Nilai kedua = ");
            b = input.nextDouble();

            if (operator == '+') {
                System.out.println(a + b);
            } else if (operator == '-') {
                System.out.println(a - b);
            } else if (operator == '*') {
                System.out.println(a * b);
            } else if (operator == '/') {
                if (b == 0) {
                    System.out.println("hasil nya tidak terbatas");
                } else {
                    System.out.println(a / b);
                }
            } else {
                System.out.println("hasil tidak ditemuka");
            }
            System.out.println();
        }
        input.close();
    }
}