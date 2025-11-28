import java.util.Scanner;
public class Kafe06 {
   
   public static void Menu (String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println(" Selamat datang " + namaPelanggan + "!");

        if (isMember){
            System.out.println(" Anda adalah member, dapatkan diskon 10% untuk setiap pembelian! ");
        }

        if (kodePromo.equals("diskon 50%")) {
            System.out.println("SELAMAT! Anda mendapat diskon 50%");
        } else if (kodePromo.equals("diskon 30%")) {
            System.out.println("SELAMAT! Anda mendapat diskon 30%");
        } else {
            System.out.println("Kode promo " + kodePromo + " tidak valid");
        }

        System.out.println("====== MENU RESTO CAFE ======");
        System.out.println(" 1. Kopi hitam - Rp. 15,000 ");
        System.out.println(" 2. Cappucino - Rp. 20,000 ");
        System.out.println(" 3. Latte - Rp. 22,000 ");
        System.out.println(" 4. Teh tarik - Rp. 12,000 ");
        System.out.println(" 5. Roti bakar - Rp. 10,000 ");
        System.out.println(" 6. Mie goreng - Rp. 18,000 ");
        System.out.println(" ============================== ");
    }

    public static int hitungTotalHarga06 (int pilihanMenu, int banyakItem,boolean isMember, String kodePromo ) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        double diskon = 0;
        if (kodePromo.equals("diskon 50%")) {
            diskon = hargaTotal * 0.50;
        } else if (kodePromo.equals("diskon 30%")) {
            diskon = hargaTotal * 0.30;
        }

       

        System.out.println("Harga asli: Rp. " + hargaTotal);
        System.out.println("Diskon: Rp. " + diskon);
        return (int) (hargaTotal - diskon);
    }

    public static void main(String[] args) {
        String kodePromo = "diskon 30%";
        Menu("Budi", true, kodePromo);

        Scanner sc = new Scanner(System.in);
        double totalKeseluruhan = 0;
        int pilihan, banyakItem;

        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            pilihan = sc.nextInt();

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            banyakItem = sc.nextInt();

            int totalHarga = hitungTotalHarga06(pilihan, banyakItem,true, kodePromo);
            System.out.println("Total harga untuk pesanan Anda: Rp. " + totalHarga);

            totalKeseluruhan += totalHarga;

            System.out.print("Apakah Anda ingin memesan lagi? (1 = Ya, 0 = Tidak): ");
            pilihan = sc.nextInt();

        } while (pilihan != 0);

        System.out.println("\n=======================");
        System.out.println(" Total keseluruhan pesanan: Rp. " + totalKeseluruhan);
        System.out.println("=======================\n");
    }
}
