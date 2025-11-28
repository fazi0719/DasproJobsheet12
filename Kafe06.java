import java.util.Scanner;
public class Kafe06 {
   
   public static void Menu (String namaPelanggan, boolean isMember, String kodePromo) {
    System.out.println(" Selamat datang " + namaPelanggan + "!");

    if (isMember){
        System.out.println(" Anda adalah member, dapatkan diskon 10% untuk setiap pembelian! ");
    }

    // logika Kode Promo
    if (kodePromo.equals("diskon 50%") ) { // "diskon 50%" tidak boleh ada spasi jika ada mka hasil output tidak valid
        System.out.println("SELAMAT! Anda mendapat diskon 50%");
    }else if (kodePromo.equals("diskon 30%")){
        System.out.println("SELAMAT! Anda mendapat diskon 30%");
    }else {
        System.out.println("Kode promo" + kodePromo + " tidak valid " );
    }
        System.out.println("====== MENU RESTO CAFE ======");
        System.out.println(" 1. Kopi hitam - Rp. 15,000 ");
        System.out.println(" 2. Cappucino - Rp. 20,000 ");
        System.out.println(" 3. Latte - Rp.22,000");
        System.out.println(" 4. Teh tarik - Rp.12,000");
        System.out.println(" 5. Roti bakar - Rp. 10.000");
        System.out.println(" 6. Mie goreng - Rp. 18,000");
        System.out.println(" ============================== ");
        System.out.println(" Silahkan pilih menu yang anda inginkan. ");
    }
    public static int hitungTotalHarga06 (int pilihanMenu, int banyakItem, String kodePromo ) {
        int [] hargaItems = {15000, 20000, 22000,12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu-1]*banyakItem;
        
    
      double diskon = 0;
    if (kodePromo.equals("diskon 50%")) {
    diskon = hargaTotal * 0.50;
    System.out.println("Anda mendapat diskon 50%! (Rp. " + diskon + ")");
    } else if (kodePromo.equals("diskon 30%")) {
    diskon = hargaTotal * 0.30; 
    System.out.println("Anda mendapat diskon 30%! (Rp. " + diskon + ")");
    } else {
    System.out.println("Kode promo " + kodePromo + "invalid ");
    diskon = 0;
    
}
    
double totalBayarAkhir = hargaTotal - diskon;
return (int) totalBayarAkhir;

}


           public static void main(String[] args) {
          Menu("Budi", true, "diskon 30%"); // "diskon 30%" tidak boleh ada spasi jika ada mka hasil output tidak valid
    
            Scanner sc = new Scanner (System.in);
            System.out.print("\nMasukkan nomor menu yang anda ingin pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            
            int totalHarga = hitungTotalHarga06 (pilihanMenu, banyakItem, "diskon 30%");
            System.out.println(" Total harga untuk pesanan anda: Rp. " + totalHarga );
      
}
}
