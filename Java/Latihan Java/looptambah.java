public class looptambah {
    public static void main (String[]args) {
        
        int jml=0;
        for (int i=1; i<=10;i++) {
            System.out.print(i + " + " );
            jml+=i;
        }
        System.out.print ("0 = Jumlah Semua Bilangan : "+jml + "\n \n");

        for (int i = 5; i < 8; i++){
            for (int j = 2; j < 8; j++){
                System.out.print("*");
                if ( i == j){
                    break;
                }
            }
            System.out.println();
        }
        
    }
}
