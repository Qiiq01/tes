public class segitigaforloop1 {
    public static void main (String[]args){

        System.out.println("Nomor 1");
        for (int i = 1; i <=5; i++){
            System.out.print(" * ");
        }

        System.out.println();
        System.out.println();
        
        System.out.println("Nomor 2");
        for (int i = 1; i <=5; i++){
            for (int j = 1; j<=5; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        System.out.println();

        System.out.println("Nomor 3");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(" * ");
                if ( i == j) {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Nomor 4");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(" * ");
                if ( (i+j) == 4) {
                    break;
                }
            }
            System.out.println();
        }
        
        System.out.println();

        System.out.println("Nomor 5");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if ( j < 5 - i) {
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Nomor 6");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
