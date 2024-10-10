import java.util.Scanner;

/**
 * SiakadFor18
 */
public class SiakadFor17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //inisialisasi
        double nilai ,tertinggi = 0 ,terendah = 100;
        // kondisi
        // inkrementasi (i++)
        for (int i = 1; i <= 10; i++ ){
            // block perulangan
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " :");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

        }
        System.out.println("nilai tertinggi : " + tertinggi);
        System.out.println("nilai terendah : " + terendah);  }
}