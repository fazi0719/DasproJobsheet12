import java.util.Scanner;
public class RekapPenjualanCafe06 {
    
    Scanner sc = new Scanner(System.in);
    
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    // Array 2 dimensi untuk menampung penjualan (5 menu x 7 hari)
    static int[][] penjualan = new int[5][7];

    public static void inputData(int [][] data ) {
    Scanner sc = new Scanner(System.in);
        System.out.println(" =====Input Data Penjualan===== ");
        for (int i =0; i<menu.length;i++ ){
            System.out.println( "Menu "+"= " + menu[i]);
            for ( int j =0; j < data[i].length; j++){
                System.out.print("Hari ke- " + (j+1) + ":");
                data[i][j] = sc.nextInt();    // input dimasukkan ke array
            }
        }
    }
    public static void tampilTabel(int [][] tabel) {
        System.out.println("\n ====TABEL PENJUALAN====");
        System.out.print( "Menu/hari | "); 
         for ( int j =0; j < 7; j++){   
            System.out.print("H" + j +" ");
    }
        System.out.println("\n-------------------------------------------------------------");   
    for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < tabel[i].length; j++) {
                System.out.print(tabel[i][j] + "\t");
    }
    System.out.println();
}
    System.out.println("-------------------------------------------------------------");   
    }

     public static void Menu(int [][] tertinggi) {
        int indexMax = 0;
        int totalMax = 0;

         for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < tertinggi[i].length; j++) {
                total = total + tertinggi[i][j];
            }
            if (total > totalMax) {
                totalMax = total;
                indexMax = i;
            }
        }
        System.out.println("\nMenu dengan total penjualan tertinggi: " + menu[indexMax]);
        System.out.println("Total: " + totalMax + "porsi");
        }
    public static void rataRata(int[][] rata) {
        System.out.println("\n=== RATA-RATA PENJUALAN SETIAP MENU ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < rata[i].length; j++) {
                total += rata[i][j];
            }
            double rataRata = (double) total / 7;
            System.out.printf("%-15s : %.2f\n ", menu[i], rataRata);
        }
    }
     public static void main(String[] args) {
        inputData(penjualan);
        tampilTabel(penjualan);
        Menu(penjualan);
        rataRata(penjualan);
    }

}


    
