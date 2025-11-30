import java.util.Scanner;
public class RekapPenjualanCafe06 {
    
    static Scanner sc = new Scanner(System.in); // kenapa menggunakan static karena method yang memanggil Scanner juga static 
    // (contoh: main(), inputData(), inputMenuDanHari()), maka variabel yang digunakan di dalamnya harus static juga.
    
   // Variabel array belum ditentukan ukurannya karena akan menyesuaikan input user
    static String[] menu; //static : variabel milik class (bukan milik object)
    static int[][] penjualan;
    static int jumlahMenu, jumlahHari;
    
        //MODIFIKASI 1 
    public static void inputMenuDanHari() {
        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = sc.nextInt();
        sc.nextLine(); // menghindari bug 

        //  jumlah menu
        menu = new String[jumlahMenu];

        System.out.print("Masukkan jumlah hari penjualan: ");
        jumlahHari = sc.nextInt();

        // Array 2d  dibuat berdasar input (menu x hari)
        penjualan = new int[jumlahMenu][jumlahHari];
        sc.nextLine(); // menghindari bug 

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine(); // input nama menu
        }
    }
    
    public static void inputData(int[][] data) {
        System.out.println(" =====Input Data Penjualan===== ");
        for (int i =0; i<jumlahMenu;i++ ){
            System.out.println( "Menu "+"= " + menu[i]);
            for ( int j =0; j <jumlahHari; j++){
                System.out.print("Hari ke- " + (j+1) + ":");
                data[i][j] = sc.nextInt();    // input dimasukkan ke array
            }
        }
    }
    public static void tampilTabel(int [][] tabel) {
        System.out.println("\n ====TABEL PENJUALAN====");
        System.out.print( "Menu/hari | "); 
         for ( int j =0; j < jumlahHari; j++){   
            System.out.print("H" + (j + 1) +" ");
    }
        System.out.println("\n-------------------------------------------------------------");   
    for (int i = 0; i < jumlahMenu; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(tabel[i][j] + "\t");
    }
    System.out.println();
}
    System.out.println("-------------------------------------------------------------");   
    }

     public static void Menu(int [][] tertinggi) {
        int indexMax = 0;
        int totalMax = -1;

         for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
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
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += rata[i][j];
            }
            double rataRata = (double) total / 7;
            System.out.printf("%-15s : %.2f\n ", menu[i], rataRata);
        }
    }
     public static void main(String[] args) {
        inputMenuDanHari();
        inputData(penjualan);
        tampilTabel(penjualan);
        Menu(penjualan);
        rataRata(penjualan);
    }

}


    
