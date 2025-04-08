
import java.text.DecimalFormat;

public class soal6 {

    public static void main(String[] args) {
        // Harga Menu
        double ayamGoreng = 15_000;
        double ayamPuk = 13_000;
        double ayamBakar = 20_000;
        double esTeh = 5_000;
        double esJeruk = 7_000;

        // Pajak
        double pajakMakanan = 0.05; // 5%
        double pajakMinuman = 0.03; // 3%
        double pajakTransaksi = 0.15; // 15%

        // Pesanan (termasuk pajak menu)
        double subtotalRehan = (2 * ayamBakar * (1 + pajakMakanan)) + (1 * esTeh * (1 + pajakMinuman));
        double subtotalAmbaRoni = (1 * ayamPuk * (1 + pajakMakanan)) + (3 * esTeh * (1 + pajakMinuman));
        double subtotalFaiz = ((ayamGoreng + ayamPuk + ayamBakar) * (1 + pajakMakanan)) + ((esJeruk + esTeh) * (1 + pajakMinuman));

        // Total setelah pajak transaksi
        double totalRehan = subtotalRehan * (1 + pajakTransaksi);
        double totalAmbaRoni = subtotalAmbaRoni * (1 + pajakTransaksi);
        double totalFaiz = subtotalFaiz * (1 + pajakTransaksi);

        DecimalFormat rupiahFormat = new DecimalFormat("#,###.00");

        System.out.println("Total biaya rehan : Rp " + rupiahFormat.format(totalRehan));
        System.out.println("Total biaya Amba Roni : Rp " + rupiahFormat.format(totalAmbaRoni));
        System.out.println("Total biaya Faiz : Rp " + rupiahFormat.format(totalFaiz));
    }
}
