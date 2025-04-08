
import java.util.Scanner;

public class soal10 {

    public static void main(String[] args) {
        int[] denominasi = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan total pembayaran: ");
        int totalPembayaran = scanner.nextInt();
        System.out.print("Masukkan total belanja: ");
        int totalBelanja = scanner.nextInt();

        int kembalian = totalPembayaran - totalBelanja;

        if (kembalian < 0) {
            System.out.println("Uang yang diberikan kurang!");
        } else if (kembalian == 0) {
            System.out.println("Tidak ada kembalian.");
        } else {
            System.out.println("Kembalian yang harus diberikan:");
            for (int uang : denominasi) {
                if (kembalian >= uang) {
                    int jumlah = kembalian / uang;
                    kembalian %= uang;
                    System.out.println(uang + " -> " + jumlah + " lembar/keping");
                }
            }
        }

        scanner.close();
    }
}
