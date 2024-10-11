import java.util.Scanner;

public class Parkir07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jenis, durasi, total=0;

        System.out.println("Jenis Kendaraan");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("Masukkan Jenis Kendaraan: ");
        jenis = sc.nextInt();

        do {
            System.out.println("Masukkan durasi parkir (ketik '0' untuk selesai): ");
            durasi = sc.nextInt();
            if ((jenis == 1) || (jenis == 2)) {
                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }
                if (durasi == 0) {
                    System.out.println("Transaksi selesai");
                    break;
                }
            }
        } while (jenis != 0);
        Sustem.out.println("Total biaya parkir: Rp " + total);
    }
}