import java.util.Scanner;

/**
 * tugas117
 */
public class tugas117 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int tiket,totaltiket = 0;
       double harga ,totalharga = 0, diskon = 0.0;
       do  {
        System.out.print("masukkan jumlah tiket" + " : ");
        tiket = sc.nextInt();
        if (tiket <= 0) {
            System.out.println("jumlah tidak valid.silahkan input ulang");
            break;
        }
        else if (tiket > 4 && tiket <= 10) {
            System.out.println("mendapatkan diskon 10%");
            diskon = 0.1;
        }
        else if (tiket > 10) {
            System.out.println("mendapatkan diskon 15%");
            diskon = 0.15;
        }
        else{
            diskon = 0.0;
        }
        harga = 50000*tiket;
        totalharga += harga - (harga*diskon);
        totaltiket += tiket;
       }
        while (true) ;
        System.out.println("total harga : " + totalharga);
        System.out.println(" total tiket : " + totaltiket);
        
    }
}