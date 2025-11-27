public class Kafe06 {
   
   public static void Menu (String namaPelanggan, boolean isMember) {
    System.out.println(" Selamat datang " + namaPelanggan + "!");

    if (isMember){
        System.out.println(" Anda adalah member, dapatkan diskon 10% untuk setiap pembelian! ");
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
    public static void main(String[] args) {
        Menu("andi", true);
    }
}

