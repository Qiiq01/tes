import java.util.Scanner;
public class latihaninformatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


/*Input*/ System.out.println("==============================================");
            System.out.print("Masukkan Tinggi Badan: ");
            double tinggi1 = input.nextInt();
            System.out.print("Masukkan Berat Badan : ");
            double berat = input.nextInt();
                      
                      double tinggi = tinggi1 / 100;
/*Proses*/            double BMI = berat / (tinggi * tinggi);
            
          System.out.println("==============================================");
            /*Proses*/ if (BMI<18.5) {
                /*Output*/ System.out.printf("Hasil BMI: %.02f \nTinggi Badan: %.01f  \nBerat Badan: %.01f \nStatus Berat Badan: Kurus\n", BMI,tinggi1,berat );
            }
            /*Proses*/ else if (BMI<25) {
                /*Output*/ System.out.printf("Hasil BMI: %.02f \nTinggi Badan: %.01f  \nBerat Badan: %.01f \nStatus Berat Badan: Normal/Ideal",BMI, tinggi1, berat);
            }
            /*Proses*/ else if (BMI<27) {
                /*Output*/ System.out.printf("Hasil BMI: %.02f \nTinggi Badan: %.01f  \nBerat Badan: %.01f \nStatus Berat Badan: Gemuk",BMI, tinggi1, berat);
            }
            /*Proses*/ else {
                /*Output*/ System.out.printf("Hasil BMI: %.02f \nTinggi Badan: %.01f  \nBerat Badan: %.01f \nStatus Berat Badan: Obesitas Anjim",BMI, tinggi1, berat);
            }
             input.close();
    }
}