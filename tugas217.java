import java.util.Scanner;

/**
 * tugas217
 */
public class tugas217 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis,durasi,total=0;
        System.out.println("1.motor");
        System.out.println("2.mobil");
        System.out.println("0.");
        System.out.print("masukkan jenis kendaraan : ");
        jenis = sc.nextInt();
        if (jenis==1 || jenis==2) {
            System.out.print("masukkan durasi : ");
            durasi = sc.nextInt();
            if (durasi > 5) {
                total += 12500;
            }
            else if (jenis==1) {
                total+=durasi*3000;
            }
            else if (jenis==2) {
                total+=durasi*2000;
            }
        }
        
        else{

        }
        while (jenis !=0);
        System.out.println("total : " + total);
    }
}