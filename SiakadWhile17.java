import java.util.Scanner;

/**
 * SiakadWhile17
 */
public class SiakadWhile17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai ,jumlah ,i = 0;
        System.out.print("masukkan jumlah siswa : ");
        jumlah = sc.nextInt();
        while (i<jumlah) {
            System.out.print("masukkan  nilai mahasisiwa ke- " + (i + 1) + ":");
            nilai = sc.nextInt();
            if (nilai < 0 || nilai > 100) {
                System.out.println("nilai tidak valid . masukkan lagi nilai yang valid");
                continue;
            }
            if (nilai > 80 && nilai <= 100) {
                System.out.println("nilai mahasiswa ke- " + (i+1) + " adalah A");
            }
            else if (nilai > 73 && nilai <= 80) {
                System.out.println("nilai mahasiswa ke- " + (i+1) + " adalah B+");
            }
            else if (nilai > 65 && nilai <= 73) {
                System.out.println("nilai mahasiswa ke- " + (i+1) + "adalah B");
            }
            else if (nilai > 60 && nilai <= 65) {
                System.out.println("nilai mahasiswa ke- "+ (i+1) + "adalah C+");
            }
            else if (nilai > 50 && nilai <= 60) {
                System.out.println("nilai mahasiswa ke- " + (i+1) + "adalah C");
            }
            else if (nilai > 39 && nilai <= 50) {
                System.out.println("nilai mahasiswa ke- " + (i+1) + "adalah D");
            }
            else{
                System.out.println("mahasiswa ke- " + (i+1) + "adalah E");
            }
            i++;
        }

    }
}