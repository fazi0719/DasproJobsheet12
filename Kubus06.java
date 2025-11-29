import java.util.Scanner;
public class Kubus06 {
    
static int LuasKubus (int sisi){
    int luas = 6*sisi*sisi;
    return luas;
}
    
static int VolumeKubus (int sisi){
    int volume = sisi*sisi*sisi;
    return volume;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sisi,L,Vol;

System.out.print(" Masukkan sisi: ");
        sisi = sc.nextInt();

      L= LuasKubus(sisi);
        System.out.println(" Luas kubus adalah: " + L);
      Vol = VolumeKubus(sisi);
        System.out.println(" Volume kubus adalah: " + Vol);

        sc.close();

}
}