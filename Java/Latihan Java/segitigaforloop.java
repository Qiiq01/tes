public class segitigaforloop {
    public static void main (String[]args){
        int i,j;
        for ( i = 0; i < 5; i++){
            System.out.print("* ");
        }
        System.out.print("\n\n");

        for ( i = 0; i < 5; i++){
            for ( j = 0; j <=i;  j++ ){
            System.out.print("* ");
            }

            System.out.println();
        }
        System.out.print("\n");

        for ( i = 0; i < 5; i++){
            for ( j = 0; j < 5;  j++ ){
            System.out.print("* ");
            
            }

            System.out.println();
        }
        System.out.print("\n");

        for ( i = 5; i > 0; i--){
            for (j = 0; j < i; j++){
                System.out.print("* ");
            }
                System.out.println();
        }
        System.out.print("\n");

        for(i=5; i> 0; i--) {
            for(j=0; j< 5; j++){
                if(j < i-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
        System.out.print("\n");

        for( i = 0; i<5; i++) {
            for( j = 0; j<5; j++){
                if (j > i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.println();
        }

   
    }
 }