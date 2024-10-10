import java.util.Scanner;

/**
 * KafeDoWhile17
 */
public class KafeDoWhile17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  kopi,teh,roti,hargakopi = 12000,hargateh = 7000,hargaroti = 20000;
        String namaPelanggan;
        do {
            System.out.print("maukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transaksi dibatalkan");
                break;
            }
            System.out.print("jumlah kopi");
            kopi = sc.nextInt();
            System.out.print("jumlah teh");
            teh = sc.nextInt();
            System.out.println("jumlah roti");
            roti = sc.nextInt();
            int totalharga = (kopi*hargakopi) + (teh*hargateh) + (roti*hargaroti);
            System.out.println("total yang harus dibayar : Rp " + totalharga);
            sc.nextLine();
        } while (true);
        System.out.println("semua transaksi selesai");
    }
}