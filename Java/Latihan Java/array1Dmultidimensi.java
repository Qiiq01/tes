public class array1Dmultidimensi {
    public static void main (String []args) {
System.out.println("Belajar Array Bersama Ikmal\n");


        System.out.println("Array 1D Inisialisasi");
        int [] ages = {10,11,12,13};
        System.out.println(ages[2]);
        System.out.println(ages.length);
        /*for ( int i=0; i < ages.length; i++){
            System.out.println("array ke " + i + " adalah " + ages [i]);*/
                

System.out.println();

        System.out.println("Array 1D Deklarasi");
        int [] arrayint = new int[3];
        arrayint[0] = 1;
        arrayint[1] = 2;
        arrayint[2] = 3;
        System.out.println(arrayint[0]);

System.out.println();

        System.out.println("Array Multidimensi Inisialisasi");
        String [][] arraymulti = { {"Samaniah","Repasha"}, {"Ihsan", "Ikmal"}, {"Sabila", "Annisa"}, {"fadillah", "Rafe'i"} };
        //System.out.println(arraymulti[0][1]);
        for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 1; j++) {
                        System.out.print(arraymulti[i][j]+ " ") ;
                }
        }

System.out.println();
System.out.println();

        System.out.println("Array MultiDimensi Deklarasi");
        int [][] arraymultiDe = new int [2][3];
        arraymultiDe [0][0] = 1;
        arraymultiDe [0][1] = 2;
        arraymultiDe [0][2] = 3;

        arraymultiDe [1][0] = 4;
        arraymultiDe [1][1] = 5;
        arraymultiDe [1][2] = 6;
        System.out.println(arraymultiDe[0][1]);
        /*for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(arraymultiDe[i][j] + " "); */
                    
                }
        }

        